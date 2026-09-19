SUMMARY = "Nested delimiters that consistently grow regardless of the contents"
DESCRIPTION = "This package defines the command \\perfectcut#1#2 which displays \
a bracket <#1||#2>. Various other delimiters are similarly \
defined (parentheses, square brackets ...). The effect of these \
commands is to let the delimiters grow according to the number \
of nested \\perfectcommands (regardless of the size of the \
contents). The package was originally intended for solving a \
notational issue for direct-style continuation calculi in proof \
theory. For general use, the package also defines commands for \
defining other sorts of delimiters which will behave in the \
same way (see example in the documentation). The package also \
offers a robust reimplementation of \\big, \\bigg, etc."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn67201"

RPM_NAME = "texlive-perfectcut-2026.226.2.3svn67201-58.2.noarch.rpm"
RPM_HASH = "4b8334b93c1220bd47ae810b1ea9840bc9dc12bba7c257c71b8976a19400bfd69576a6ba23d4cfb3ab9a6c30d63ca01084202e1a214cd7c858009f88679e2126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-perfectcut.sty \
texlive-perfectcut"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
tex-mathstyle.sty \
tex-scalerel.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
