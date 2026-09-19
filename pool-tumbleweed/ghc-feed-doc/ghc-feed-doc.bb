SUMMARY = "Haskell feed library documentation"
DESCRIPTION = "This package provides the Haskell feed library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-feed-doc-1.3.2.1-8.19.noarch.rpm"
RPM_HASH = "ddeddec954b951560f39f0dfddf61c51bb25fcabafcf2af492224ddccd74bce9c3c73c25493732453afc77824cccd1a06cd985d61f0b86d2bafe1d36bc401edf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-feed-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
