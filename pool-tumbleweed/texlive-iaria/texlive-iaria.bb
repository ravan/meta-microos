SUMMARY = "Write documents for the IARIA publications"
DESCRIPTION = "This package contains templates for the creation of documents \
for IARIA publications (International Academy, Research, and \
Industry Association) and implements the specifications for the \
IARIA citation style."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.1svn78137"

RPM_NAME = "texlive-iaria-2026.226.0.0.9.1svn78137-60.2.noarch.rpm"
RPM_HASH = "4fd578ee025fff4eff699cc5ecb934e5e606584f5ee5ae5d6692047ebbaa42de7a7ba6956f3b32c9b7b050c307dd8670c4d1f6e86e1e4d6e8d16cb5a39a16186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iaria.cls \
texlive-iaria"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-IEEEtran.cls \
tex-caption.sty \
tex-etoolbox.sty \
tex-extdash.sty \
tex-floatrow.sty \
tex-flushend.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-orcidlink.sty \
tex-pbalance.sty \
tex-subcaption.sty \
tex-subfig.sty \
tex-times.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
