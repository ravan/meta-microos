SUMMARY = "Documentation for texlive-didec"
DESCRIPTION = "This package includes the documentation for texlive-didec"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn78113"

RPM_NAME = "texlive-didec-doc-2026.226.1.1.1svn78113-59.2.noarch.rpm"
RPM_HASH = "af1417257e98e44bf9132246d256e66b8ee5a488dea4e093811d75a54e377d389c4edff4b5048ca80ad67b668891e7cd146db92866b570b2d280676942f715de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-didec-doc"

RDEPENDS:${PN} += ""

inherit rpm
