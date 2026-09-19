SUMMARY = "Create notes on appendix frames in beamer"
DESCRIPTION = "This package introduces the \\appxnote command, which puts the \
note's content on a separate beamer frame shown by the command \
\\printappxnotes. It also creates interactive buttons to move \
back and forth between the two frames."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn55732"

RPM_NAME = "texlive-beamerappendixnote-2026.226.1.2.0svn55732-61.2.noarch.rpm"
RPM_HASH = "6dc0636f29ceefbad80633ec2636c72b9c9d3d50ff398cb6b60b0a9fd0705713b7e7a009a96028e3a08828eba01e8afd0e8a18b845cf03fa46122245f6fdd4a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerappendixnote.sty \
texlive-beamerappendixnote"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
