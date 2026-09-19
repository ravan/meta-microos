SUMMARY = "Documentation for texlive-vertbars"
DESCRIPTION = "This package includes the documentation for texlive-vertbars"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0csvn77682"

RPM_NAME = "texlive-vertbars-doc-2026.226.1.0csvn77682-60.2.noarch.rpm"
RPM_HASH = "ec3536b1e8010007d37d8328c635870950ed4d7016c90c8105d064680a2681f5493c0bf9ab94f0f71a1c6513c7d787a1bac5473d9a63da12352fa5c8a0543f03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vertbars-doc"

RDEPENDS:${PN} += ""

inherit rpm
