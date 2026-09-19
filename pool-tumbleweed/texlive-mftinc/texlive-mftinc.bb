SUMMARY = "Pretty-print Metafont source"
DESCRIPTION = "The mft program pretty-prints Metafont source code into a TeX \
file. The mftinc package facilitates incorporating such files \
into a LaTeX2e document. In addition, mftinc provides routines \
for improved comment formatting and for typesetting font \
tables."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn15878"

RPM_NAME = "texlive-mftinc-2026.226.1.0asvn15878-61.2.noarch.rpm"
RPM_HASH = "2a5e00eff0148ad099cd3adc91df11bd648951da5202a287b1a91b9cab68c10765b8a6405b0a9b2290a340c906fb6f599d73f367ffe7d0338dcc66a0076fb5e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mftinc.sty \
texlive-mftinc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-chngpage.sty \
tex-keyval.sty \
tex-lineno.sty \
tex-rawfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
