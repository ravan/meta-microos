SUMMARY = "Modification of inputenc for German"
DESCRIPTION = "If the inputenc is used and German umlauts are input directly, \
they are converted to the LICR representation \\'a (etc.). This \
breaks the sort algorithm of makeindex, for instance. Ginpenc \
converts umlauts and the sharp-s to the short forms defined by \
babel, e.g., 'a instead, if the text is typeset in German."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn24980"

RPM_NAME = "texlive-ginpenc-2026.226.1.0svn24980-60.2.noarch.rpm"
RPM_HASH = "1e828558cc50136d1cad2b4ddeab9e133a1eb7e462076d7b1bdb5c70ed9faec58e2d15cb868d19f19fe92d8a46779beda392c58d518536f408b5b012f2f005e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ginpenc.sty \
texlive-ginpenc"

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
