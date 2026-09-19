SUMMARY = "Documentation for texlive-gsftopk"
DESCRIPTION = "This package includes the documentation for texlive-gsftopk"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.19.2svn52851"

RPM_NAME = "texlive-gsftopk-doc-2026.226.1.19.2svn52851-60.4.noarch.rpm"
RPM_HASH = "9b0f0c2256e0eb4c1113ee3bc643dbbd4f10299b4007d79f65671a33cb8c2d890b953869fe2261251371b42369eb11e9b0bed5f939f89164720a8e14871d580e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-gsftopk.1 \
texlive-gsftopk-doc"

RDEPENDS:${PN} += ""

inherit rpm
