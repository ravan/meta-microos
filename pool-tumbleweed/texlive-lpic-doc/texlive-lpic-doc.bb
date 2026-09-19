SUMMARY = "Documentation for texlive-lpic"
DESCRIPTION = "This package includes the documentation for texlive-lpic"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8svn20843"

RPM_NAME = "texlive-lpic-doc-2026.226.0.0.8svn20843-61.2.noarch.rpm"
RPM_HASH = "1e9c775f1153c6c57e4de910b56882f83d7e4b99fda61f57183ccbe140405d7726af7eaea1d3b08b03a906229a9a2060eec0646fd246939483e551fa2efed597"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lpic-doc"

RDEPENDS:${PN} += ""

inherit rpm
