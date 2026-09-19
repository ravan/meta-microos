SUMMARY = "Documentation for texlive-conditext"
DESCRIPTION = "This package includes the documentation for texlive-conditext"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn55387"

RPM_NAME = "texlive-conditext-doc-2026.226.1.5svn55387-60.2.noarch.rpm"
RPM_HASH = "63225bfa281fd3d263450bdab51c1d964fa0abf834428b6352be6390499dfcbaee310841bef8cc1b02015520ea3b7d205aaf1a0bcd4f06874a46a2f53878411d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-conditext-doc"

RDEPENDS:${PN} += ""

inherit rpm
