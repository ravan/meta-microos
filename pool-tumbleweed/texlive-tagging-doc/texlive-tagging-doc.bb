SUMMARY = "Documentation for texlive-tagging"
DESCRIPTION = "This package includes the documentation for texlive-tagging"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1.0.1svn77682"

RPM_NAME = "texlive-tagging-doc-2026.227.1.1.0.1svn77682-62.2.noarch.rpm"
RPM_HASH = "73ee42c9fc60ce74a1a7cbaba00f8fc803e9fa9e320feb5108ba2214f49bf9c0e119585da33a1517803af530383c6682167ff2b1df51afebb415bc705d5ebb97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tagging-doc"

RDEPENDS:${PN} += ""

inherit rpm
