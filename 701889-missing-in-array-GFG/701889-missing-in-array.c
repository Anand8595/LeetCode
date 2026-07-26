void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

int missingNum(int arr[], int size) {
    int n = size + 1;
    int i = 0;

    while (i < size) {
        if (arr[i] == i + 1 || arr[i] == n) {
            i++;
        } else {
            int idx = arr[i] - 1;

            if (arr[i] != arr[idx]) {
                swap(arr, i, idx);
            } else {
                i++;
            }
        }
    }

    for (i = 0; i < size; i++) {
        if (arr[i] != i + 1)
            return i + 1;
    }

    return n;
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna