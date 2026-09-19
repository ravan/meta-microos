SUMMARY = "Haskell os-string library"
DESCRIPTION = "This package provides the Haskell os-string library."
LICENSE = "BSD-3-Clause"

PV = "2.0.10"

RPM_NAME = "ghc-os-string-2.0.10-1.3.aarch64.rpm"
RPM_HASH = "d1fa63192cba1f223fe06074f77165286a66a338a63b5c54a5c763a7885a2ea9dcf8430bdc3b236ef8ec3ab20daf712b63093797dcbf77361730ddbbf406d11e"

RPROVIDES:${PN} += "ghc-os-string \
libHSos-string-2.0.10-5320-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
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
