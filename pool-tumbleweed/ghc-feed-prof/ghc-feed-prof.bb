SUMMARY = "Haskell feed profiling library"
DESCRIPTION = "This package provides the Haskell feed profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-feed-prof-1.3.2.1-8.19.aarch64.rpm"
RPM_HASH = "2d818c82ca8a7c7bf1ca3f87903b8b10cab12640ab9c9969c8ad42546ba97e5be6fd90e1316c33e317b8a796d0b5ecf6746335578b0ec6eb738c11aacc9d8cd5"

RPROVIDES:${PN} += "ghc-feed-prof \
ghc-prof-feed-1.3.2.1-4vDzNCNFGbT2EeiQ4DJ7Ch"

RDEPENDS:${PN} += "ghc-feed-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base-compat-0.14.1-KqldihVKqBMDOTSpHrHMJy \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-old-locale-1.0.0.7-DplRrAcnBM96ijBftoXSc5 \
ghc-prof-old-time-1.1.1.0-LOMYAgPdxtNFCxdl8604aX \
ghc-prof-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc \
ghc-prof-time-locale-compat-0.1.1.5-9vdyA9EPu1IDeF7oXoCWqM \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-prof-xml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4 \
ghc-prof-xml-types-0.3.8-35OA2z37X8M4UCRyGooeYw"

inherit rpm
