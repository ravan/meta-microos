SUMMARY = "Documentation for texlive-forloop"
DESCRIPTION = "This package includes the documentation for texlive-forloop"
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.3.0svn77682"

RPM_NAME = "texlive-forloop-doc-2026.226.3.0svn77682-60.2.noarch.rpm"
RPM_HASH = "05dcc360099f15008b9ecfd315fbaaf073b985acc87673bc47b77ef73534e353d21164226a646c74e69b69f74da183720c7c131abbf729936ad95899dd278e72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-forloop-doc"

RDEPENDS:${PN} += ""

inherit rpm
