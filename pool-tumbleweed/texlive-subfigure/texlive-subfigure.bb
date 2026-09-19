SUMMARY = "Deprecated: Figures divided into subfigures"
DESCRIPTION = "Provides support for the manipulation and reference of small or \
'sub' figures and tables within a single figure or table \
environment. It is convenient to use this package when your \
subfigures are to be separately captioned, referenced, or are \
to be included in the List-of-Figures. A new \\subfigure command \
is introduced which can be used inside a figure environment for \
each subfigure. An optional first argument is used as the \
caption for that subfigure. The package is now considered \
obsolete: it was superseded by subfig, but users may find the \
more recent subcaption package more satisfactory."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.5svn15878"

RPM_NAME = "texlive-subfigure-2026.226.2.1.5svn15878-64.2.noarch.rpm"
RPM_HASH = "8034ac41aecf6840bcd5c2d0754224f5363bd64fa19db14657b0960c966cd6b573b7f37701f823419f7ca4b709c8b6e6f3bf10b225966ee70c757c8a2cb23b6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subfigure.cfg \
tex-subfigure.sty \
texlive-subfigure"

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
