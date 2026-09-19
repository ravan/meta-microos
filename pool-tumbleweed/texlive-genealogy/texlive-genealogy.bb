SUMMARY = "A compilation genealogy font"
DESCRIPTION = "A simple compilation of the genealogical symbols found in the \
wasy and gen fonts, adding the male and female symbols to \
Knuth's 'gen' font, and so avoiding loading two fonts when you \
need only genealogical symbols. The font is distributed as \
Metafont source."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn25112"

RPM_NAME = "texlive-genealogy-2026.226.svn25112-60.2.noarch.rpm"
RPM_HASH = "8a95a8aa9e2f9edce59846ecb75ff4fb8444015e33d3d7bb9a3e7d3077776bbdf74fe496eb380fe434c359adea0bd3e66fab7dd374cd606dd45797e5fc160bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-drgen10.tfm \
texlive-genealogy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
