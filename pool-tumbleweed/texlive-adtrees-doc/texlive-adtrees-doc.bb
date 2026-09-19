SUMMARY = "Documentation for texlive-adtrees"
DESCRIPTION = "This package includes the documentation for texlive-adtrees"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn51618"

RPM_NAME = "texlive-adtrees-doc-2026.226.1.1svn51618-61.2.noarch.rpm"
RPM_HASH = "05cf08ae5f27af402157eaea38dfe38efd4f4d581ef98d16e9adae66a65f3976b8f84c395bf58d40256292314ce1536fc0ca3a276f2f7783222fc51900819799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adtrees-doc"

RDEPENDS:${PN} += ""

inherit rpm
