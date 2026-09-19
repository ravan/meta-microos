SUMMARY = "Bidirectional mapping between two key types"
DESCRIPTION = "A data structure representing a bidirectional mapping between two key types. \
Each value in the bimap is associated with exactly one value of the opposite \
type."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "ghc-bimap-0.5.0-2.23.aarch64.rpm"
RPM_HASH = "f2275808086821e4447db54fd532312bd5bbeae231bdcfd87e6353015fbb5d0a43915354b5e13d64b28fceb1c04ad6edfb09fdbd97959018e134dbaa7a28b909"

RPROVIDES:${PN} += "ghc-bimap \
libHSbimap-0.5.0-4NSO3lF4JlF9IWsrimrxRe-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
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
