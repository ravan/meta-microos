SUMMARY = "Components of paths"
DESCRIPTION = "Hackage documentation generation is not reliable. For up to date documentation, \
please see: <http://www.stackage.org/package/path-pieces>."
LICENSE = "BSD-2-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-path-pieces-0.2.1-12.19.aarch64.rpm"
RPM_HASH = "cd7d64522651f444cf2ca7b5e2a0c9de6be879e99870fac525eda1859da345a590440780ce0771667f80c7a0daf907f20a9378c22dde4a324716297341b826f8"

RPROVIDES:${PN} += "ghc-path-pieces \
libHSpath-pieces-0.2.1-FtFHzM20JKUFHdFVBop6JH-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
