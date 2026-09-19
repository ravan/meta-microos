SUMMARY = "Documentation for texlive-mkpic"
DESCRIPTION = "This package includes the documentation for texlive-mkpic"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.03svn76483"

RPM_NAME = "texlive-mkpic-doc-2026.226.1.03svn76483-61.2.noarch.rpm"
RPM_HASH = "f20a2f479bdb5dbd506ace30a044e11c509a8038090ae466c8491889998356d23bfd37f50ce11c094ce14520dbc7e28308b63a41c0d2b2d5564047e620e7a995"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-mkpic.1 \
texlive-mkpic-doc"

RDEPENDS:${PN} += ""

inherit rpm
