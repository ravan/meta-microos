SUMMARY = "Typeset the (logic) turnstile notation"
DESCRIPTION = "Among other uses, the turnstile sign is used by logicians for \
denoting a consequence relation, related to a given logic, \
between a collection of formulas and a derived formula."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-turnstile-2026.226.1.0svn77682-59.2.noarch.rpm"
RPM_HASH = "ed7ab098e28c7c96eec2546016a6b1d8b07e3f767bac89532c2552d686b6e0cd8d0e45dabf5ffe1a2e4e8f2b794d8a17301a184e3e2c3f92c8f55676d9898c17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-turnstile.sty \
texlive-turnstile"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
