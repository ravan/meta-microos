SUMMARY = "Documentation for texlive-iodhbwm"
DESCRIPTION = "This package includes the documentation for texlive-iodhbwm"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.2svn57773"

RPM_NAME = "texlive-iodhbwm-doc-2026.226.1.2.2svn57773-60.2.noarch.rpm"
RPM_HASH = "fc5dc34cfaa674fd58e800a0f1b45767a84ec5b77863d304c76f227ecdcbb6a1526dffbcd08498ce53d4e26ef4ab857fe62d2f74272807cd1e5877fd04467da5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-iodhbwm-doc-de \
texlive-iodhbwm-doc"

RDEPENDS:${PN} += ""

inherit rpm
