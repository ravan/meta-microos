SUMMARY = "Haskell dbus library documentation"
DESCRIPTION = "This package provides the Haskell dbus library documentation."
LICENSE = "Apache-2.0"

PV = "1.4.3"

RPM_NAME = "ghc-dbus-doc-1.4.3-1.3.noarch.rpm"
RPM_HASH = "542070b61bdb0f29c17c8516dc8cad39d423bdc599bd4749b31255971948aa4c1c02028d4830d331e5929721775ba64d415e9d0d43761969765722cb1b16ae21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-dbus-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
