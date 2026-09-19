SUMMARY = "Divide without division"
DESCRIPTION = "Generate routines for integer division, employing arithmetic and bitwise \
operations only, which are __2.5x-3.5x faster__ than 'quot'. Divisors must be \
known in compile-time and be positive."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-quote-quot-0.2.1.0-1.21.aarch64.rpm"
RPM_HASH = "7c48789dd6a173dbb86b65b0f18f7b8d0ec9222dafe4d51d49577eae3dcda23db16ca947c899f44d35acb03f9f69200c0374e73394b5e0078a1720c7150b8845"

RPROVIDES:${PN} += "ghc-quote-quot \
libHSquote-quot-0.2.1.0-8ke8gm9O7CFLkwYR1NwZbK-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
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
