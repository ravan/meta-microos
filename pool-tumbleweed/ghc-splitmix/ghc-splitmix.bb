SUMMARY = "Fast Splittable PRNG"
DESCRIPTION = "Pure Haskell implementation of SplitMix described in \
 \
Guy L. Steele, Jr., Doug Lea, and Christine H. Flood. 2014. Fast splittable \
pseudorandom number generators. In Proceedings of the 2014 ACM International \
Conference on Object Oriented Programming Systems Languages & Applications \
(OOPSLA '14). ACM, New York, NY, USA, 453-472. DOI: \
<https://doi.org/10.1145/2660193.2660195> \
 \
The paper describes a new algorithm /SplitMix/ for /splittable/ pseudorandom \
number generator that is quite fast: 9 64 bit arithmetic/logical operations per \
64 bits generated. \
 \
/SplitMix/ is tested with two standard statistical test suites (DieHarder and \
TestU01, this implementation only using the former) and it appears to be \
adequate for 'everyday' use, such as Monte Carlo algorithms and randomized data \
structures where speed is important. \
 \
In particular, it __should not be used for cryptographic or security \
applications__, because generated sequences of pseudorandom values are too \
predictable (the mixing functions are easily inverted, and two successive \
outputs suffice to reconstruct the internal state)."
LICENSE = "BSD-3-Clause"

PV = "0.1.3.2"

RPM_NAME = "ghc-splitmix-0.1.3.2-1.3.aarch64.rpm"
RPM_HASH = "7532638af3bc0d38c78785f6a31fb37e4daef2aeb498f46547abeca19a9fe5d959eb0569ffee937f828a4a201877e1629045e021151dc40d50c0345522411d2c"

RPROVIDES:${PN} += "ghc-splitmix \
libHSsplitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
