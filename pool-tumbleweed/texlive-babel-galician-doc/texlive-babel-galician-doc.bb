SUMMARY = "Documentation for texlive-babel-galician"
DESCRIPTION = "This package includes the documentation for texlive-babel-galician"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.3csvn30270"

RPM_NAME = "texlive-babel-galician-doc-2026.226.4.3csvn30270-60.2.noarch.rpm"
RPM_HASH = "46a0d83ca4aee190db8b1c8c42bb718bac038ae5e627205b59297c87d3a578ef22a23d648fee187f10a97f4e0f0081b4a893986518e8287a3c465f2fbd1112af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-galician-doc"

RDEPENDS:${PN} += ""

inherit rpm
