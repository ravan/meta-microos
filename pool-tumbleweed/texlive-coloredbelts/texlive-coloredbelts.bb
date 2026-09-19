SUMMARY = "Insert colored belts in documents (to present skills, for example)"
DESCRIPTION = "The package provides commands (English and French version) to \
insert 'colored belts' (in vectorial format) to present skills, \
for example."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20asvn78037"

RPM_NAME = "texlive-coloredbelts-2026.226.0.0.20asvn78037-60.2.noarch.rpm"
RPM_HASH = "2f1dd00adea3dd62d2207339f1a4d708271a89b96bd59c0e58a5ef140817a54e0d729ae09e9c51f63b92e8cb5a0c700d475735857f55fc5174d4344e854df34d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coloredbelts.sty \
texlive-coloredbelts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
