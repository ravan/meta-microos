SUMMARY = "LaTeX package for automatic definite articles for Hungarian"
DESCRIPTION = "LaTeX package for automatic definite articles for Hungarian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn39029"

RPM_NAME = "texlive-nevelok-2026.226.1.03svn39029-61.2.noarch.rpm"
RPM_HASH = "4fbca49b20e5994aedf269c0787773e2d478496703dca3898eec59ec6992d9b798b5f26cb7615937f23e0f3fa1c06fa49f187e175a41d701b04dd89db29fde78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nevelok.sty \
texlive-nevelok"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
