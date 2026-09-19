SUMMARY = "Documentation for texlive-universa"
DESCRIPTION = "This package includes the documentation for texlive-universa"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.1svn51984"

RPM_NAME = "texlive-universa-doc-2026.226.2.1svn51984-60.2.noarch.rpm"
RPM_HASH = "e2281453c64f38aa9d0e5b4cf7e5fa15273accf6ca6226032b57060babd78329e634fe3eac1c942f01a931a7c761f78a9243a264ccd7891057b22f0a9720098a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-universa-doc"

RDEPENDS:${PN} += ""

inherit rpm
