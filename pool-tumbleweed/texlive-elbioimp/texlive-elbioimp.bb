SUMMARY = "A LaTeX document class for the Journal of Electrical Bioimpedance"
DESCRIPTION = "A document class for writing articles to the Journal of \
Electrical Bioimpedance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn21758"

RPM_NAME = "texlive-elbioimp-2026.226.1.2svn21758-61.4.noarch.rpm"
RPM_HASH = "36f3500e368c012ed80b2177e83989a83f43b51ed6f86b5be8538ead3426a522358743416a5d8f872d59d0067dd9b4032cd7905cc192840514b6fdcc6023d87a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elbioimp.cls \
texlive-elbioimp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-ifthen.sty \
tex-mathptmx.sty \
tex-type1cm.sty \
tex-type1ec.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
