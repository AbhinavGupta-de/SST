#include <iostream>
using namespace std;

int main() {
    int n, q;
    cin >> n >> q;

    int arr[n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    long long prefixSum[n + 1];
    prefixSum[0] = 0;
    for (int i = 1; i <= n; i++) {
        prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
    }

    for (int i = 0; i < q; i++) {
        int a, b;
        cin >> a >> b;

        long long sum = prefixSum[b] - prefixSum[a - 1];
        cout << sum << endl;
    }

    return 0;
}
