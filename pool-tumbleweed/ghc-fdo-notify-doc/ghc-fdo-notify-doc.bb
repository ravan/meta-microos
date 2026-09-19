SUMMARY = "Haskell fdo-notify library documentation"
DESCRIPTION = "This package provides the Haskell fdo-notify library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-fdo-notify-doc-0.3.1-4.72.noarch.rpm"
RPM_HASH = "50c41373a87bd0f522f820c1d337576d1b72ce2ad9053bbe24a8c1d29bf36f41adddfee2e232130a74783cfe94ea1078a307306cb267c2467b1cfab5183fc62c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-fdo-notify-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
