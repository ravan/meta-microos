SUMMARY = "Haskell brick library documentation"
DESCRIPTION = "This package provides the Haskell brick library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.12"

RPM_NAME = "ghc-brick-doc-2.12-1.4.noarch.rpm"
RPM_HASH = "85b8d5b285e0e6f96cae30c2db3ab6085b662dff2804e25d248e63f1f23974ea261433007f469b01d1eb9c59f3735319b186f7c9cadc23f23b3f944b63017adf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-brick-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
