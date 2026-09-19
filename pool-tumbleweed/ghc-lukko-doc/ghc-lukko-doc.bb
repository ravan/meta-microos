SUMMARY = "Haskell lukko library documentation"
DESCRIPTION = "This package provides the Haskell lukko library documentation."
LICENSE = "GPL-2.0-or-later & BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-lukko-doc-0.1.2-2.14.noarch.rpm"
RPM_HASH = "8c02ee886cf795514df371876ac93f51ec08e585e6a8696c0f3026db71b113cd92b4c8027465c89eba59db3e396a31dd7995427edd5dbf84f1b4afa3febdaff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lukko-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
