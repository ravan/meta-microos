SUMMARY = "Support for the work of classicists"
DESCRIPTION = "The package provides classicists with some of the tools that \
are needed for typesetting scholarly publications dealing with \
Greek and Latin texts, with special emphasis on Greek verse. As \
the package's name suggests, its core is a comprehensive set of \
commands for generating metrical schemes and for placing \
prosodical marks on text set in the Latin or the Greek \
alphabet. The rest of the package provides a miscellany of \
commands for symbols (most of them not directly related to \
metre) that are often used in critical editions of classical \
texts. The package does not require any special font: all \
symbols are taken from the Computer Modern fonts (which are \
included in all TeX distributions) and the package's commands \
are based on TeX primitives."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn18489"

RPM_NAME = "texlive-metre-2026.226.1.0svn18489-61.2.noarch.rpm"
RPM_HASH = "081b16f3194ab8d91b748c9f06aefb706025bbdc77627b8f81b7de9d03dbb6d7883b6f6bf58f5f876fb4fd177cd818687af9a3a8398646cda20c3cfb235f4645"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-metre.sty \
texlive-metre"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-relsize.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
