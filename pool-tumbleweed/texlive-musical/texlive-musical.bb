SUMMARY = "Typeset (musical) theatre scripts"
DESCRIPTION = "This package is designed to simplify the development and \
distribution of scripts for theatrical musicals, especially \
ones under development. The output is formatted to follow \
generally accepted script style[1] while also maintaining a \
high level of typographic integrity, and includes commands for \
dialog, lyrics, stage directions, music and dance cues, \
rehearsal marks, and more. It gracefully handles dialog that \
crosses page breaks, and can generate lists of songs and lists \
of dances in the show. [1] There are lots of references for the \
One True Way to format a script. Naturally, none of them agree."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn54758"

RPM_NAME = "texlive-musical-2026.226.3.1svn54758-61.2.noarch.rpm"
RPM_HASH = "1200f5ca2221d36d1879ef0b341887696fb50b8eba9af69d94ccfabe21537ce1bda088ca4f55c4911db99af117e989eea866b53bf7b142200f4449f1936c4e1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-musical.sty \
texlive-musical"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-footmisc.sty \
tex-ifthen.sty \
tex-tcolorbox.sty \
tex-titlesec.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
