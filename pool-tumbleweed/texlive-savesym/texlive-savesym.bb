SUMMARY = "Redefine symbols where names conflict"
DESCRIPTION = "There are a number of symbols (e.g., \\Square) that are defined \
by several packages. In order to typeset all the variants in a \
document, we have to give the glyph a unique name. To do that, \
we define \\savesymbol{XXX}, which renames a symbol from \\XXX to \
\\origXXX, and \\restoresymbols{yyy}{XXX}, which renames \\origXXX \
back to \\XXX and defines a new command, \\yyyXXX, which \
corresponds to the most recently loaded version of \\XXX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn78101"

RPM_NAME = "texlive-savesym-2026.226.1.2svn78101-60.2.noarch.rpm"
RPM_HASH = "b246521b0341081280792a0b52b49e30570142d2ae43f0e2f69034b18849c3e5cf300d84c4bb16d8ad4704d27ee66406ce4955c8e32a0ac7da910ace1ef9d68b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-savesym.sty \
texlive-savesym"

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
