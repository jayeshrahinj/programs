#include <vector>
#include <iostream>

using namespace std;

int maxMoves(vector<vector<int>>& grid) {
    int m = grid.size();
    int n = grid[0].size();
    int max_moves = 0;

    vector<vector<int>> dp(m, vector<int>(n, 0));

    for (int i = 0; i < m; ++i) {
        dp[i][n - 1] = 1;
    }
    for (int col = n - 2; col >= 0; col--) {
        for (int row = 0; row < m; row++) {
           dp[row][col] = 1;
       if (row > 0 && grid[row][col] < grid[row - 1][col + 1])
                dp[row][col] = max(dp[row][col], dp[row - 1][col + 1] + 1);
            if (row < m - 1 && grid[row][col] < grid[row + 1][col + 1])
                dp[row][col] = max(dp[row][col], dp[row + 1][col + 1] + 1);
            if (grid[row][col] < grid[row][col + 1])
                dp[row][col] = max(dp[row][col], dp[row][col + 1] + 1);

             max_moves = max(max_moves, dp[row][col]);
        }
    }

    return max_moves-1;
}

int main() {
    vector<vector<int>> grid1 = {{2, 4, 3, 5}, {5, 4, 9, 3}, {3, 4, 2, 11}, {10, 9, 13, 15}};
    vector<vector<int>> grid2 = {{3, 2, 4}, {2, 1, 9}, {1, 1, 7}};

    int result1 = maxMoves(grid1);
    int result2 = maxMoves(grid2);

    cout << "Example 1: " << result1 << endl;
     
    return 0;
}
