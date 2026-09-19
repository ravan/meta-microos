SUMMARY = "Haskell glib library documentation"
DESCRIPTION = "This package provides the Haskell glib library documentation."
LICENSE = "LGPL-2.1-only"

PV = "0.13.12.0"

RPM_NAME = "ghc-glib-doc-0.13.12.0-2.3.noarch.rpm"
RPM_HASH = "37cc0d7c1c8fb0cab5accc36b3007d2db963a72db585c4b333f000f7047cf5273cec5d4188fbb507014ff4ed2ac9fc0ac36c26d44715ec6110d60e7783a577d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-glib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
