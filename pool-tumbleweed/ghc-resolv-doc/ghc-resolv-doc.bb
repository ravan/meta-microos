SUMMARY = "Haskell resolv library documentation"
DESCRIPTION = "This package provides the Haskell resolv library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0.3"

RPM_NAME = "ghc-resolv-doc-0.2.0.3-1.9.noarch.rpm"
RPM_HASH = "85c4fa95306cbc657e9bd63e9b83046236cf11f252fd71c738005b98ecca94c261767d5b7ae25c13be541abf5f6af8e23ae9a7b3585968f79728be24385466b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-resolv-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
