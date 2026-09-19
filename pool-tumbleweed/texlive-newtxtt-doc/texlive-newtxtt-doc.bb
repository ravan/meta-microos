SUMMARY = "Documentation for texlive-newtxtt"
DESCRIPTION = "This package includes the documentation for texlive-newtxtt"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.059svn77682"

RPM_NAME = "texlive-newtxtt-doc-2026.226.1.059svn77682-61.2.noarch.rpm"
RPM_HASH = "7e37f2a24cbdeea661f97cf8da0dbe1590472bdb592ca6550aef7fb49164c70ebc11086909327f69b805f99725c1ebbce0a9e8dadc6969435e1123801ddabeac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newtxtt-doc"

RDEPENDS:${PN} += ""

inherit rpm
