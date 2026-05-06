import subprocess
import sys

def run_java_program():
    test_input = "2\n10\n2\n20\n1\nREGULAR\nSAVE10\n"

    result = subprocess.run(
        ['java', '-cp', 'out/production/PricingLab', 'com.example.PricingEngine'],
        input=test_input,
        capture_output=True,
        text=True,
        cwd='C:/Users/INFOLAB/IdeaProjects/PricingLab/PricingLab'
    )

    output = result.stdout
    print("=== Program Output ===")
    print(output)
    print("=== End of Output ===")

    checks = [
        ("Subtotal: 40.0", "Subtotal"),
        ("Discount: 4.0", "Discount"),
        ("Final Price: 41.4", "Final Price")
    ]

    all_passed = True

    for expected, name in checks:
        if expected in output:
            print(f"[OK] {name}: OK")
        else:
            print(f"[FAIL] {name}: Expected '{expected}' not found")
            all_passed = False

    # التحقق من الضريبة (متسامح مع الدقة)
    if "Tax:" in output:
        lines = output.split('\n')
        tax_line = None
        for line in lines:
            if 'Tax:' in line:
                tax_line = line
                break

        if tax_line:
            print(f"[INFO] Tax line found: '{tax_line}'")
            # التحقق من وجود 5.4 أو 5.3999999999999995
            if '5.4' in tax_line or '5.3999999999999995' in tax_line:
                print(f"[OK] Tax: OK (value found: approximately 5.4)")
            else:
                print(f"[WARN] Tax value may be different")
                all_passed = False
    else:
        print(f"[FAIL] Tax: 'Tax:' not found in output")
        all_passed = False

    return all_passed

if __name__ == "__main__":
    print("=" * 40)
    print("Integration Testing Suite")
    print("=" * 40)

    if run_java_program():
        print("\n[SUCCESS] All integration tests passed!")
        sys.exit(0)
    else:
        print("\n[FAILURE] Some integration tests failed!")
        sys.exit(1)