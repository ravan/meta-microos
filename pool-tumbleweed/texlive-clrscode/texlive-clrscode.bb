SUMMARY = "Typesets pseudocode as in Introduction to Algorithms"
DESCRIPTION = "This package allows you to typeset pseudocode in the style of \
Introduction to Algorithms, Second edition, by Cormen, \
Leiserson, Rivest, and Stein. The package was written by the \
authors. You use the commands the same way the package's author \
did when writing the book, and your output will look just like \
the pseudocode in the text."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn51136"

RPM_NAME = "texlive-clrscode-2026.226.1.7svn51136-60.2.noarch.rpm"
RPM_HASH = "6c8b1ff09feaca1b5d17607bbf7bd983e0830a18158b234e030f6754a66b46497fe78185d8c32c5370d4ca0eeb0f15a630d0365a1ae56ed0a3cbd41708dbf2a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clrscode.sty \
texlive-clrscode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-latexsym.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
