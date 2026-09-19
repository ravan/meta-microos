SUMMARY = "Haskell text-icu profiling library"
DESCRIPTION = "This package provides the Haskell text-icu profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.0.5"

RPM_NAME = "ghc-text-icu-prof-0.8.0.5-3.3.aarch64.rpm"
RPM_HASH = "d04f8a8a1c3a609b6152456a2596ddf363d41d8841eccff8486f5a7212f760fab0914c7f75768fbfe53b582eba268a943cc5b85c4ed537d693318c5595674500"

RPROVIDES:${PN} += "ghc-prof-text-icu-0.8.0.5-3ASu5PNyjAiJW6A93Cqx8U \
ghc-text-icu-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc \
ghc-text-icu-devel"

inherit rpm
