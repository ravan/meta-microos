SUMMARY = "A simple (but internally ugly) memoization function"
DESCRIPTION = "A simple (but internally ugly) memoization function. \
 \
* New in 0.1.0.1: Make it exception safe."
LICENSE = "SUSE-Public-Domain"

PV = "0.1.0.1"

RPM_NAME = "ghc-uglymemo-0.1.0.1-4.19.aarch64.rpm"
RPM_HASH = "7979d4dd850e1fa69440dbc16e0425a9574064342f2d4e841613730f8184ed2946f8bd2004ef15f40bb4e081b4bdf8d36de461f8392c7304829d44a4cf7bc093"

RPROVIDES:${PN} += "ghc-uglymemo \
libHSuglymemo-0.1.0.1-7xglRopOL0Q1bomJJkVUR-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
