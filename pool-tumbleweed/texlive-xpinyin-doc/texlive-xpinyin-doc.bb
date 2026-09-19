SUMMARY = "Documentation for texlive-xpinyin"
DESCRIPTION = "This package includes the documentation for texlive-xpinyin"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn77682"

RPM_NAME = "texlive-xpinyin-doc-2026.226.3.1svn77682-59.4.noarch.rpm"
RPM_HASH = "b8dc7c742bde7a96cc49e6841e577835fd5b2ff5564803d05ffea5a66028dab0afa13e18f09611807f2c2a6ea3410de6449a811f715c55a01ad8bc54ccc56f77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xpinyin-doc-zh \
texlive-xpinyin-doc"

RDEPENDS:${PN} += ""

inherit rpm
