SUMMARY = "Documentation for texlive-mecaso"
DESCRIPTION = "This package includes the documentation for texlive-mecaso"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn60346"

RPM_NAME = "texlive-mecaso-doc-2026.226.1.0svn60346-59.2.noarch.rpm"
RPM_HASH = "11522d477e86b112272b6fceb66bd170b319bb5051561c147e0fd1333db2e64a8e298f0f921e25d1b1008284fd1fa234e89d7c6eed2d16f285f0fd3e193abd3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-mecaso-doc-fr \
texlive-mecaso-doc"

RDEPENDS:${PN} += ""

inherit rpm
