SUMMARY = "Documentation for texlive-mongolian-babel"
DESCRIPTION = "This package includes the documentation for texlive-mongolian-babel"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn15878"

RPM_NAME = "texlive-mongolian-babel-doc-2026.226.1.2svn15878-61.2.noarch.rpm"
RPM_HASH = "486e55845254783de2d87f34823e9dce78671f955352fb781876727e8da68b1d704c20b1249ff7ce9e8c33a7c2fa529790c296259c58226f63b51bef4d5a085a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mongolian-babel-doc"

RDEPENDS:${PN} += ""

inherit rpm
