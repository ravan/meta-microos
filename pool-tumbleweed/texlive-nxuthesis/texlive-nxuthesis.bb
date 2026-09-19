SUMMARY = "Thesis template for Ningxia University"
DESCRIPTION = "This package provides a LaTeX thesis template for Ningxia \
University in order to make it easy to write theses for \
graduate students."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn74831"

RPM_NAME = "texlive-nxuthesis-2026.226.2.0.0svn74831-61.2.noarch.rpm"
RPM_HASH = "aa2677e3b6685c1c5b8caa2d0e37d405560a4d1c37a926cc321cefc547774ccb78fa707e2423b7d809ceebd708244a6a2509e923c6d9efbb8afbcd246e131f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nxuthesis.cls \
texlive-nxuthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-array.sty \
tex-bibunits.sty \
tex-bm.sty \
tex-booktabs.sty \
tex-ctexbook.cls \
tex-enumitem.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-filehook.sty \
tex-fontenc.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-kvdefinekeys.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-natbib.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-notoccite.sty \
tex-pdfpages.sty \
tex-subcaption.sty \
tex-titletoc.sty \
tex-ulem.sty \
tex-unicode-math.sty \
tex-url.sty \
tex-xeCJKfntef.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
