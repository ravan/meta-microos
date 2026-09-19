SUMMARY = "Documentation for texlive-academicons"
DESCRIPTION = "This package includes the documentation for texlive-academicons"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9.6_2svn77682"

RPM_NAME = "texlive-academicons-doc-2026.226.1.9.6_2svn77682-61.2.noarch.rpm"
RPM_HASH = "141df6a0e246298f898c67efc0bab498c5942a97c0483e3d23194c4c5ff5c2cf1978e0bf1ca40db6f17d3632f7c22150982bdafc2cc00955120928d4ef96bb7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-academicons-doc"

RDEPENDS:${PN} += ""

inherit rpm
