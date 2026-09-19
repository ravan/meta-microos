SUMMARY = "Haskell feed library development files"
DESCRIPTION = "This package provides the Haskell feed library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-feed-devel-1.3.2.1-8.19.aarch64.rpm"
RPM_HASH = "c42425f862203bf9a4b7d52de3f1e574098d56b81b83b1591c3ec5fcfa6081b682845b61574eb92a5e4c89e7e845cced343cfec8d14eefde73f3678f465bf3db"

RPROVIDES:${PN} += "ghc-devel-feed-1.3.2.1-4vDzNCNFGbT2EeiQ4DJ7Ch \
ghc-feed-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base-compat-0.14.1-KqldihVKqBMDOTSpHrHMJy \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-old-locale-1.0.0.7-DplRrAcnBM96ijBftoXSc5 \
ghc-devel-old-time-1.1.1.0-LOMYAgPdxtNFCxdl8604aX \
ghc-devel-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-devel-time-locale-compat-0.1.1.5-9vdyA9EPu1IDeF7oXoCWqM \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-devel-xml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4 \
ghc-devel-xml-types-0.3.8-35OA2z37X8M4UCRyGooeYw \
ghc-feed"

inherit rpm
