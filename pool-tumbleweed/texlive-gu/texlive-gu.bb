SUMMARY = "Typeset crystallographic group-subgroup-schemes"
DESCRIPTION = "The package simplifies typesetting of simple crystallographic \
group-subgroup-schemes in the Barnighausen formalism. It \
defines a new environment stammbaum, wherein all elements of \
the scheme are defined. Afterwards all necessary dimensions are \
calculated and the scheme is drawn. Currently two steps of \
symmetry reduction are supported."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-gu-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "b2de72dc9602ed8fb9595e4b74c27842cb112e00de1f939c7a833b141030503da1b163815d7defd6880155b509d6753f17001ecf6fe8810b8b72fec9f72786cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gu.sty \
texlive-gu"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-calc.sty \
tex-fp.sty \
tex-ifthen.sty \
tex-pict2e.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
