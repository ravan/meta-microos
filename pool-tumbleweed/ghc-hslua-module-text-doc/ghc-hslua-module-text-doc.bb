SUMMARY = "Haskell hslua-module-text library documentation"
DESCRIPTION = "This package provides the Haskell hslua-module-text library documentation."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "ghc-hslua-module-text-doc-1.2.0-1.3.noarch.rpm"
RPM_HASH = "9c38f7f81c598d8dbbf59df321e9020efc860f309ab68c85e2adc2c6298378ccf4c10682e3bcd6e593c72432cb48d81980f284d03daacaa46f199216316e57e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-module-text-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
