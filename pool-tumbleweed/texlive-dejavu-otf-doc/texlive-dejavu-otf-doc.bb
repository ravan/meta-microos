SUMMARY = "Documentation for texlive-dejavu-otf"
DESCRIPTION = "This package includes the documentation for texlive-dejavu-otf"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.07svn77682"

RPM_NAME = "texlive-dejavu-otf-doc-2026.226.0.0.07svn77682-59.2.noarch.rpm"
RPM_HASH = "5353c0bd55938e29679d931db5e5b09634dd1155be544d742999827a90d854706663b4767d0542ceb31c3674f6756da3a9cee83ed976e00b34a34a78efd019c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dejavu-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
