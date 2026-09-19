SUMMARY = "Documentation for texlive-tango"
DESCRIPTION = "This package includes the documentation for texlive-tango"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.8.0svn71825"

RPM_NAME = "texlive-tango-doc-2026.227.0.0.8.0svn71825-62.2.noarch.rpm"
RPM_HASH = "8fd52677bca81e67d3ed5bb7a8298fb47a13bc80db0d4d5691795148a7dca43d4df0f11b5ff5555b8ca34aa6105091634ac4a8c1fbba9a5b8793e2ee66911cde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tango-doc-en;fr \
texlive-tango-doc"

RDEPENDS:${PN} += ""

inherit rpm
