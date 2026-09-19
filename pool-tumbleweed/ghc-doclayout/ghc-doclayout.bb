SUMMARY = "A prettyprinting library for laying out text documents"
DESCRIPTION = "Doclayout is a prettyprinting library for laying out text documents, with \
several features not present in prettyprinting libraries designed for code. \
It was designed for use in pandoc."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.3"

RPM_NAME = "ghc-doclayout-0.5.0.3-1.3.aarch64.rpm"
RPM_HASH = "f8e7372c0970061a501cfe34d8b35d15dff450ca41d699e6dea272d5a954170609c1cd120ecbd39873260f308df30f94d3106d83a4fe6c2e31af9764cb765b38"

RPROVIDES:${PN} += "ghc-doclayout \
libHSdoclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSemojis-0.1.5-AZAxFgnk0gPLtmkqpmmj2s-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSsafe-0.3.21-AzRUUYeJ47sQc55olWnva-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
