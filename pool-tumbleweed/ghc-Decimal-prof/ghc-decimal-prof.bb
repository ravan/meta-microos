SUMMARY = "Haskell Decimal profiling library"
DESCRIPTION = "This package provides the Haskell Decimal profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "ghc-Decimal-prof-0.5.2-2.19.aarch64.rpm"
RPM_HASH = "f25cd868918888135dd897f671070341e043bc764b816b79e06ff81a17ba130bd7a53a2402ec89ff5abd132967c41f049ddf859be8c5364f4853f8ac08ad79d1"

RPROVIDES:${PN} += "ghc-Decimal-prof \
ghc-prof-Decimal-0.5.2-1UdB985IcTF52sAwbBdCjx"

RDEPENDS:${PN} += "ghc-Decimal-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350"

inherit rpm
