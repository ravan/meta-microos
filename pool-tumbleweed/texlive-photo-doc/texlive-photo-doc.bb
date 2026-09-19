SUMMARY = "Documentation for texlive-photo"
DESCRIPTION = "This package includes the documentation for texlive-photo"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn18739"

RPM_NAME = "texlive-photo-doc-2026.226.svn18739-58.2.noarch.rpm"
RPM_HASH = "513e690766d2e5bf608a7bbbd16f2c0d7100cbb609ac1dcfcddd15a3503634ecce2163fefdab8e6d50c230f2e218d5bb43c5096e820742c0ec3ddd4c42c91f58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-photo-doc"

RDEPENDS:${PN} += ""

inherit rpm
