SUMMARY = "Documentation for texlive-mfnfss"
DESCRIPTION = "This package includes the documentation for texlive-mfnfss"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-mfnfss-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "a1578d18910e3bf6470906dce6ef90ecc9bde32c25b8b8ab9bd0b0e348d2056e4aafb31583dfdec7c552d242b76dd713673dd834b97215c9c287c5ed0825a836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mfnfss-doc"

RDEPENDS:${PN} += ""

inherit rpm
