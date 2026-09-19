SUMMARY = "Documentation for texlive-texcount"
DESCRIPTION = "This package includes the documentation for texlive-texcount"
LICENSE = "LPPL-1.0"

PV = "2026.227.3.1.1svn49013"

RPM_NAME = "texlive-texcount-doc-2026.227.3.1.1svn49013-62.2.noarch.rpm"
RPM_HASH = "c3e80b7bb3c6b91b9d6ee475a90b84e73578b38dd18440582bab727a6ecc7e38b8ae0afd39923eaba2617d37aac23ed75e8a639a649e5f6b546e1dec0080c4e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
