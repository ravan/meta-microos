SUMMARY = "Support for braille"
DESCRIPTION = "This package allows the user to produce Braille documents on \
paper for the blind without knowing Braille (which can take \
years to learn). Python scripts grade1.py and grade2.py convert \
ordinary text to grade 1 and 2 Braille tags; then, the LaTeX \
package takes the tags and prints out corresponding Braille \
symbols."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn20655"

RPM_NAME = "texlive-braille-2026.226.svn20655-59.2.noarch.rpm"
RPM_HASH = "b4b7df0cb05e01773f84efea00b16784ab4e00527ed2bbadba77c4c0f4636959ed9c56791dfa4ec30a8915b16a0bd1d88c15c7b69b966c012d491176102599e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-braille.sty \
texlive-braille"

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
