package Silver;

import java.io.*;
import java.util.*;

public class SumOfSubMatrix {

    // ultra-fast input
    private static final class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int readByte() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do {
                c = readByte();
            } while (c <= ' '); // skip whitespace

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = readByte();
            }

            int val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = readByte();
            }
            return val * sign;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();

        int n = fs.nextInt();
        int m = fs.nextInt();

        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + fs.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < m; k++) {
            int i = fs.nextInt();
            int j = fs.nextInt();
            sb.append(prefix[j] - prefix[i - 1]).append('\n');
        }

        System.out.print(sb.toString());
    }
}