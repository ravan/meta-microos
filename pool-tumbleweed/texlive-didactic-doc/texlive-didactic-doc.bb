SUMMARY = "Documentation for texlive-didactic"
DESCRIPTION = "This package includes the documentation for texlive-didactic"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn70901"

RPM_NAME = "texlive-didactic-doc-2026.226.1.7svn70901-59.2.noarch.rpm"
RPM_HASH = "870ddea8ac171b19094fb51be74d63b5b8817ac4e99bb103ac71af53e23dd8801700be35c77125fbbd4d0f0ec9184f45fb59bc64f9ac9e4dd1dd9d0e3e14521a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-didactic-doc"

RDEPENDS:${PN} += ""

inherit rpm
