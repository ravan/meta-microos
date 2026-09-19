SUMMARY = "Documentation for texlive-xevlna"
DESCRIPTION = "This package includes the documentation for texlive-xevlna"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-xevlna-doc-2026.226.1.1svn77682-59.4.noarch.rpm"
RPM_HASH = "a67542e60d1997af5412a9080cf31f0ab267179c1682f69e5d2401060afa86154d20ccd0cfe0ab43fdb07daaadd0cf378def400fda7c7f17b33d4d0c79a9e5b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xevlna-doc"

RDEPENDS:${PN} += ""

inherit rpm
