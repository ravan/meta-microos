SUMMARY = "Documentation for texlive-pagegrid"
DESCRIPTION = "This package includes the documentation for texlive-pagegrid"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-pagegrid-doc-2026.226.1.6svn77682-58.2.noarch.rpm"
RPM_HASH = "1698284524eef12e1871f236a8afebc9fd37530dea40e94b6a029bb8ef94e8fe649b2c492a16c2181f3da019e234d6e4c4529e3112bd187f61bd80820c863e27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pagegrid-doc-en \
texlive-pagegrid-doc"

RDEPENDS:${PN} += ""

inherit rpm
