SUMMARY = "Adjust behaviour of the ends of footnotes"
DESCRIPTION = "The LaTeX internal command \\@finalstrut is used automatically \
used at the end of footnote texts to insert a strut to avoid \
mis-spacing of multiple footnotes. Unfortunately the command \
can cause a blank line at the end of a footnote. The package \
provides a solution to this problem."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn21719"

RPM_NAME = "texlive-finstrut-2026.226.0.0.5svn21719-59.2.noarch.rpm"
RPM_HASH = "b32d06ba57dfe6a4723122bb6669b60a882a4c82bbb0ca68e8fe1bba367b60ca6a69fc91562119dfcd5f42ddcd25f0dd13ccb5dec4a95f8dd8ac4133ea8e21fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-finstrut.sty \
texlive-finstrut"

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
