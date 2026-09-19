SUMMARY = "Documentation for texlive-litetable"
DESCRIPTION = "This package includes the documentation for texlive-litetable"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.9asvn77682"

RPM_NAME = "texlive-litetable-doc-2026.226.3.9asvn77682-61.2.noarch.rpm"
RPM_HASH = "b87b8b0d11b099cd9b333737c137ea4fd34b2d5e59a7b690c24bed2fe31e2027bd0edd12e4b6b38dbb85dd34664162d8de546b43a713786945c248250b08a8fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-litetable-doc-zh;yue \
texlive-litetable-doc"

RDEPENDS:${PN} += ""

inherit rpm
