SUMMARY = "Haskell exceptions library"
DESCRIPTION = "This package provides the Haskell exceptions library."
LICENSE = "BSD-3-Clause"

PV = "0.10.12"

RPM_NAME = "ghc-exceptions-0.10.12-1.3.aarch64.rpm"
RPM_HASH = "76da6567f93732d9bb25347fb0eb1b98000b9be0055528a7321c6c8700cff6e94bec90af8a658d13ed478849e2279f351289ca2587b1d19094c8a50f86378107"

RPROVIDES:${PN} += "ghc-exceptions \
libHSexceptions-0.10.12-f655-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
