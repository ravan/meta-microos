SUMMARY = "Haskell utility-ht profiling library"
DESCRIPTION = "This package provides the Haskell utility-ht profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.17.2"

RPM_NAME = "ghc-utility-ht-prof-0.0.17.2-1.16.aarch64.rpm"
RPM_HASH = "306d4ee457842cee6d8f95e5b301ff9b2501891a3968230c5c839821ccff95e0029648ea880dc4f44ddc9605768a92d9eb866606bf18810a7057c550e4470789"

RPROVIDES:${PN} += "ghc-prof-utility-ht-0.0.17.2-E9mYTmSklQHJf02bWgeDJF \
ghc-utility-ht-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-utility-ht-devel"

inherit rpm
