SUMMARY = "Haskell X11-xft library documentation"
DESCRIPTION = "This package provides the Haskell X11-xft library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-X11-xft-doc-0.3.4-2.21.noarch.rpm"
RPM_HASH = "91f4930738260924296ad5320be67c7f1b3615a0cda63d003402f70d7f3910279f89347255f70c48e5f24af9c86f19212a052091f2a127f7fb15c4fe1fc9d1cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-X11-xft-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
