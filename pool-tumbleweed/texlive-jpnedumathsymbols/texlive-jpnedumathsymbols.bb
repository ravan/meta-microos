SUMMARY = "Mathematical equation representation in Japanese education"
DESCRIPTION = "Mathematical equation representation in Japanese education \
differs somewhat from the standard LaTeX writing style. This \
package introduces mathematical equation representation in \
Japanese education."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn72959"

RPM_NAME = "texlive-jpnedumathsymbols-2026.226.1.3svn72959-63.2.noarch.rpm"
RPM_HASH = "30276fbf275cb7735057e5157c3715b96fa0f8139551a52bc439d3267012c6c662f953d64ddf8aab1309a45292d8a86484c2dc125e74eb6142d1af1a8d2959bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jpnedumathsymbols.sty \
texlive-jpnedumathsymbols"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-empheq.sty \
tex-luatexja-otf.sty \
tex-otf.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
