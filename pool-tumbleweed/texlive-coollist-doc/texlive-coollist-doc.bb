SUMMARY = "Documentation for texlive-coollist"
DESCRIPTION = "This package includes the documentation for texlive-coollist"
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.1.4svn67048"

RPM_NAME = "texlive-coollist-doc-2026.226.1.4svn67048-61.2.noarch.rpm"
RPM_HASH = "3a5b89e8266e38807444e3a7d713d0ea2c5e3c5b0925be147db734957520972f12e253e5c1c7568672276bda23198038eec6272b4cf05fd887d15897d8c9d519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coollist-doc"

RDEPENDS:${PN} += ""

inherit rpm
