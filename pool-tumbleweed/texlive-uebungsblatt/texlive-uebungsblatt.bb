SUMMARY = "A LaTeX class for writing exercise sheets"
DESCRIPTION = "This package implements a LaTeX class for writing exercise \
sheets for a lecture. Features: - quick typesetting of exercise \
sheets or their revisions, - simple user friendly commands, - \
elegant page formatting, - automatic numbering of exercises and \
sub-exercises, - the number of the exercise sheet is extracted \
automatically from the file name, - static information about \
the lectures and the authors needs to provided at one point \
only."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.0svn15878"

RPM_NAME = "texlive-uebungsblatt-2026.226.1.5.0svn15878-60.2.noarch.rpm"
RPM_HASH = "8fd8463881e8f20994b61f40c7ceba8f796d5f301816b7dde2a7a6cbf71b0b18ed13ef338e6a5d28a296428270f0906c56d6a24ab8358cdf777f5cfcf0a3e895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uebungsblatt.cls \
tex-uebungsblatt.sty \
texlive-uebungsblatt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-akkcounterlabelpattern.sty \
tex-akkgerman.sty \
tex-akktecdoc.cls \
tex-amsmath.sty \
tex-fancyhdr.sty \
tex-ifthen.sty \
tex-inputenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
