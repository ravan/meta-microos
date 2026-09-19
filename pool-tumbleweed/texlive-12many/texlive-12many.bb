SUMMARY = "Generalising mathematical index sets"
DESCRIPTION = "In the discrete branches of mathematics and the computer \
sciences, it will only take some seconds before you're faced \
with a set like {1,...,m}. Some people write $1\\ldotp\\ldotp m$, \
others $\\{j:1\\leq j\\leq m\\}$, and the journal you're submitting \
to might want something else entirely. The 12many package \
provides an interface that makes changing from one to another a \
one-line change."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn15878"

RPM_NAME = "texlive-12many-2026.226.0.0.3svn15878-61.2.noarch.rpm"
RPM_HASH = "cbe543364f2009d4e7d0e0112a36e053da00e74d1bfd0037e68ca6dab634195cae88d68358a21a9438e1586e5a2157b6e204899b75f3627efa9d477597b52eb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-12many.sty \
texlive-12many"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
