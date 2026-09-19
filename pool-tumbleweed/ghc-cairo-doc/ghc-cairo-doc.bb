SUMMARY = "Haskell cairo library documentation"
DESCRIPTION = "This package provides the Haskell cairo library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.13.12.0"

RPM_NAME = "ghc-cairo-doc-0.13.12.0-1.12.noarch.rpm"
RPM_HASH = "fa96a7500c5b69dace850a3970159f9bc3f5480b64c1813ce286f9de026b272848a784d54110888308312567f4c256617f366ae03ab02eb3d2c87915b883900b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cairo-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
