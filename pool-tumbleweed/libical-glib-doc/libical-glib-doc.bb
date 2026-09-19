SUMMARY = "Documentation files for libical-glib3"
DESCRIPTION = "Documentation files for libical-glib3"
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.20"

RPM_NAME = "libical-glib-doc-3.0.20-1.8.noarch.rpm"
RPM_HASH = "620f15407e2cb24fcea3d781e675566ccbef09ed17793faa8218630d51a3ade7d941e8b80cac7e21d0f156edc83261987b803e302bf12a64e177ddd433d2b32f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libical-glib-doc"

RDEPENDS:${PN} += ""

inherit rpm
