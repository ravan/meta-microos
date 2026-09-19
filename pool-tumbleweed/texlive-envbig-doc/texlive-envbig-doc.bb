SUMMARY = "Documentation for texlive-envbig"
DESCRIPTION = "This package includes the documentation for texlive-envbig"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-envbig-doc-2026.226.svn15878-61.4.noarch.rpm"
RPM_HASH = "31b37eaa9cb68b9d0c17fbc052e87e342a99639f9fea35f1e771fa4dcb026b8b97aff6fd1fc7f43c5838bdbd4410d2b056a47e168d47ba711f2e8b36c59ca25c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-envbig-doc"

RDEPENDS:${PN} += ""

inherit rpm
