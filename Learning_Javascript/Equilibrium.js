var A = [-1,3,-4,5,1,-6,2,1];
process.stdout.write(""+solution(A));

function solution(A) {
    // write your code in JavaScript (Node.js 6.4.0)
    	var N = A.length;
		var sumleft = 0;
		var sumright = 0;
		var sumtotal = sum(A);
		// System.out.println(sumtotal);
		if (N == 0) {
			return -1;
		}

		if (sumtotal - A[0] == 0) {
			// System.out.println("found equilibrium @0");
			return 0;
		}
		if (sumtotal - A[N - 1] == 0) {
			// System.out.println("found equilibrium @N-1");
			return N - 1;
		}

		for (var i = 0; i < N; i++) {
			if (i != 0)
				sumleft += A[i - 1];
			    sumright = sumtotal - A[i] - sumleft;
			if (sumleft == sumright) {
				// System.out.println("found equilibrium @" + (i));
				return i;
			}
		}

		return -1;
    }
    
function sum(subArray) {
		var sum = 0;
		for (var i = 0; i < subArray.length; i++) {
			sum += subArray[i];
		}
		return sum;
	}