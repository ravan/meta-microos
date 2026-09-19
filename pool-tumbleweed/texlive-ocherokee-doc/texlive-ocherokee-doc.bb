SUMMARY = "Documentation for texlive-ocherokee"
DESCRIPTION = "This package includes the documentation for texlive-ocherokee"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn25689"

RPM_NAME = "texlive-ocherokee-doc-2026.226.svn25689-61.2.noarch.rpm"
RPM_HASH = "b2d346fd8caf7b2f1b3f9a527b2804318f20d489c50eb7018faa45719fd0a386b9d83d84e874afca26c5e20d77c6b3f3a7efcf243fe95b9355ab60a20676f029"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocherokee-doc"

RDEPENDS:${PN} += ""

inherit rpm
