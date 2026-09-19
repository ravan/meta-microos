SUMMARY = "Documentation for texlive-gost"
DESCRIPTION = "This package includes the documentation for texlive-gost"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2lsvn76790"

RPM_NAME = "texlive-gost-doc-2026.226.1.2lsvn76790-60.4.noarch.rpm"
RPM_HASH = "df471f4d30b5d200e095646f51b2b03284a1c147909464b442e3f71f9fa342bdb25965da7d21d5c0a147a49f022d7449714da2d7a5e5af0cbdff58475c2f9633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gost-doc-en \
texlive-gost-doc"

RDEPENDS:${PN} += ""

inherit rpm
