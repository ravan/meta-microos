SUMMARY = "Documentation for texlive-ucph-revy"
DESCRIPTION = "This package includes the documentation for texlive-ucph-revy"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn74857"

RPM_NAME = "texlive-ucph-revy-doc-2026.226.1.2.0svn74857-60.2.noarch.rpm"
RPM_HASH = "2e83cc7569b8afd11e7701b9f964c6ac7090f5eed307cc667cb21e5a60d1413d81fc27f699798d25bfb81c01658aecd76771f153899bcdd0360a74eb63e4b1b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ucph-revy-doc-da \
texlive-ucph-revy-doc"

RDEPENDS:${PN} += ""

inherit rpm
