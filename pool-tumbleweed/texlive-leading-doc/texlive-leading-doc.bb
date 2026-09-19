SUMMARY = "Documentation for texlive-leading"
DESCRIPTION = "This package includes the documentation for texlive-leading"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-leading-doc-2026.226.0.0.3svn77682-61.2.noarch.rpm"
RPM_HASH = "3277f5c0e64ca76ab7b65c50abc7ee29bb71da2f2c7903a44ecfc2039fd737cfe4a44589680064289d8b78d2ebcbc027b5d917abfa35a737295dbe28f9b43d9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-leading-doc"

RDEPENDS:${PN} += ""

inherit rpm
