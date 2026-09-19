SUMMARY = "Documentation for texlive-biblatex-caspervector"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-caspervector"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.7svn76790"

RPM_NAME = "texlive-biblatex-caspervector-doc-2026.226.0.0.3.7svn76790-61.2.noarch.rpm"
RPM_HASH = "a8ccdf95b59d88153a1e478d8441097feaf0d50338c08beaeaaca026052b655d85be0548f0a7f7e347abeb10d7b1dcbed86dfefb6491d1ecd95ddeecff06d615"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-caspervector-doc-zh \
texlive-biblatex-caspervector-doc"

RDEPENDS:${PN} += ""

inherit rpm
