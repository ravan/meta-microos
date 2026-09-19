SUMMARY = "Prosper preview"
DESCRIPTION = "This class is used with LaTeX presentations using the prosper \
class. ppr-prv stands for 'Prosper Preview'. The aim of this \
class is to produce a printable version of the slides written \
with Prosper, with two slides per page."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.13csvn15878"

RPM_NAME = "texlive-ppr-prv-2026.226.0.0.13csvn15878-59.2.noarch.rpm"
RPM_HASH = "4ef5843119ddbbaba03607ba2826a32b2377db1dd2422a9fd7a39b7f0b94a2c813719adab8ad2fe78414a908fd37c570a94673328ee8a2f3d2522d213d636f9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-HAP-ppr-prv.def \
tex-ppr-prv.cls \
texlive-ppr-prv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-float.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-keyval.sty \
tex-pstricks.sty \
tex-textcomp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
