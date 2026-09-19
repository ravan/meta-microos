SUMMARY = "Enumerative expressions in Japanese education"
DESCRIPTION = "Mathematical equation representation in Japanese education \
differs somewhat from the standard LaTeX writing style. This \
package introduces enumerative expressions in Japanese \
education."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn72898"

RPM_NAME = "texlive-jpneduenumerate-2026.226.1.3svn72898-63.2.noarch.rpm"
RPM_HASH = "6ee3a5aa15210088d4b437d413f14acfd65fcc30a1ca41dcf26f6deb7ed3ab53f6297d1e480b552499d0c1e7a13438e38ab0207e6a3c5a7de4f28b4fd09c71f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jpneduenumerate.sty \
texlive-jpneduenumerate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-enumitem.sty \
tex-luatexja-otf.sty \
tex-otf.sty \
tex-refcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
