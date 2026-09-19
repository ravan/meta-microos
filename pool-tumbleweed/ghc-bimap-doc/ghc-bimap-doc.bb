SUMMARY = "Haskell bimap library documentation"
DESCRIPTION = "This package provides the Haskell bimap library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "ghc-bimap-doc-0.5.0-2.23.noarch.rpm"
RPM_HASH = "4e97ca274482eefd1c5b5801d35f8a4973fd8538f3c8a499aebdab47144ba1396fb4f52cafa6b64836c493c431fffe32fdb9fbbbde7ce1d71e38df47ebc33cd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bimap-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
