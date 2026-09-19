SUMMARY = "Haskell os-string profiling library"
DESCRIPTION = "This package provides the Haskell os-string profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.0.10"

RPM_NAME = "ghc-os-string-prof-2.0.10-1.3.aarch64.rpm"
RPM_HASH = "22f0738b2028f10ef94668e0aed4616a5dcace60895c0b06b88e2598d6e60c6241fcfdd9e052516b739201900a30810acb7bdd294e4d0cfac221512faa4eec34"

RPROVIDES:${PN} += "ghc-os-string-prof \
ghc-prof-os-string-2.0.10-5320 \
libHSos-string-2.0.10-5320-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-os-string-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-template-haskell-2.23.0.0-358a \
libHSarray-0.5.8.0-2a42-p-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-p-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-p-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-p-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-p-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-p-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-p-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-p-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
