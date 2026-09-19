SUMMARY = "OpenType math support in (plain) XeTeX"
DESCRIPTION = "This package provides OpenType math font support in plain TeX \
format. It only works with the XeTeX engine."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2csvn72498"

RPM_NAME = "texlive-unimath-plain-xetex-2026.226.0.0.2csvn72498-60.2.noarch.rpm"
RPM_HASH = "386b77baf13c52d535dd3a34e56c11ea3ff6efee2c63f9f195f6e5b317cfb8457cd70027d50a2d3d282c38b9d9e195e2784b5970d9619906f97784deb161f7c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unimath-bb.map \
tex-unimath-bbit.map \
tex-unimath-bf.map \
tex-unimath-bfit.map \
tex-unimath-frak.map \
tex-unimath-frakbf.map \
tex-unimath-it.map \
tex-unimath-plain-xetex.tex \
tex-unimath-scr.map \
tex-unimath-scrbf.map \
tex-unimath-sf.map \
tex-unimath-sfbf.map \
tex-unimath-sfbfit.map \
tex-unimath-sfit.map \
tex-unimath-tt.map \
texlive-unimath-plain-xetex"

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
