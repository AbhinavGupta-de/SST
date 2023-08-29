#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    string input;
    cin >> input;

    vector<int> nums(26, 0);
    for (int i = 0; i < input.length(); i++) {
        nums[input[i] - 'A']++;
    }

    int oddCount = 0;
    for (int i = 0; i < 26; i++) {
        if (nums[i] % 2 != 0) {
            oddCount++;
        }
    }

    if (oddCount > 1) {
        cout << "NO SOLUTION" << endl;
    } else {
        string palindrome = "";
        string middle = "";

        for (int i = 0; i < 26; i++) {
            if (nums[i] % 2 == 0) {
                for (int j = 0; j < nums[i] / 2; j++) {
                    palindrome += (char)(i + 'A');
                }
            } else {
                middle = (char)(i + 'A');
                for (int j = 0; j < (nums[i] - 1) / 2; j++) {
                    palindrome += (char)(i + 'A');
                }
            }
        }

        cout << palindrome << middle;
        reverse(palindrome.begin(), palindrome.end());
        cout << palindrome << endl;
    }

    return 0;
}
