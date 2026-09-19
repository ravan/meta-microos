SUMMARY = "Draw trees"
DESCRIPTION = "Macros to draw trees, within TeX (or LaTeX). The algorithm used \
is discussed in an accompanying paper (written using LaTeX \
2.09)."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn28176"

RPM_NAME = "texlive-treetex-2026.226.svn28176-59.2.noarch.rpm"
RPM_HASH = "f3b7b2ab886e8c4de58882c65aed87e50492d6f285358339f7a9f636feeaaed985881618053e18173397e3fed3638cda869e4ef4e20cafa28fe9cd1549e42cee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-classes.tex \
tex-l-pic.tex \
tex-treetex.tex \
texlive-treetex"

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
