SUMMARY = "Documentation for texlive-bboldx"
DESCRIPTION = "This package includes the documentation for texlive-bboldx"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.032svn77682"

RPM_NAME = "texlive-bboldx-doc-2026.226.1.032svn77682-61.2.noarch.rpm"
RPM_HASH = "64d5e89f2d920242f75ad7243f8f3289bd700338409671f1fb40bd080192df60117f5a2d7ce59dd9d635515f3226d323e5f2a0c8f8805160bb275546c0ff89ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bboldx-doc"

RDEPENDS:${PN} += ""

inherit rpm
