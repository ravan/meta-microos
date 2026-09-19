SUMMARY = "A package to improve the A4 page layout"
DESCRIPTION = "This package produces a wide page layout for documents that use \
A4 paper size. Moreover, LayAureo provides both a simple hook \
for leaving an empty space which is required if pages are \
bundled by a press binding (use option binding=length), and an \
option called big which it forces typearea to become maximum."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn19087"

RPM_NAME = "texlive-layaureo-2026.226.0.0.2svn19087-61.2.noarch.rpm"
RPM_HASH = "82172665b4573b24320f3c72d0b65c0ecc5b724e1832cc9fe53d5af7a1417d8f9c7414ab4f478a7a23aab208e51a600b050eab5989f4d3b547352c81f496aff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-layaureo.sty \
texlive-layaureo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-geometry.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
