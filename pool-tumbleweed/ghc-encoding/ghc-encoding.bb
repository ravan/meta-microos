SUMMARY = "A library for various character encodings"
DESCRIPTION = "Haskell has excellect handling of unicode, the Char type covers all unicode \
chars. Unfortunately, there's no possibility to read or write something to the \
outer world in an encoding other than ascii due to the lack of support for \
encodings. This library should help with that."
LICENSE = "BSD-3-Clause"

PV = "0.10.3"

RPM_NAME = "ghc-encoding-0.10.3-1.3.aarch64.rpm"
RPM_HASH = "5a9a1bb89bebc334a09156fa3f5c3870e9d7e5fc0fb992702cb73eec4c879fdbb73dc26c404f839f3d9484bbe4c8084ad1d9b24b72a3b76c2feec7ccb08b9adf"

RPROVIDES:${PN} += "ghc-encoding \
libHSencoding-0.10.3-AvKSpiZHZdhEtvUKaxdqNC-ghc9.12.4.so"

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
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSregex-base-0.94.0.3-1XPR6520nrRCZPbnaVzsF0-ghc9.12.4.so \
libHSregex-compat-0.95.2.2-BPr9re8H6vl1LOIxX40pHj-ghc9.12.4.so \
libHSregex-posix-0.96.0.2-ChZqQGTfEDW3V6S9qgLypS-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
