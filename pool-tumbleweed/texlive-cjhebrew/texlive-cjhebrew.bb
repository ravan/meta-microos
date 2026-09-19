SUMMARY = "Typeset Hebrew with LaTeX"
DESCRIPTION = "The cjhebrew package provides Adobe Type 1 fonts for Hebrew, \
and LaTeX macros to support their use. Hebrew text can be \
vocalised, and a few accents are also available. The package \
makes it easy to include Hebrew text in other-language \
documents. The package makes use of the e-TeX extensions to \
TeX, so should be run using an 'e-LaTeX'."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2asvn43444"

RPM_NAME = "texlive-cjhebrew-2026.226.0.0.2asvn43444-60.2.noarch.rpm"
RPM_HASH = "a1370d3728a4646894c62d98a8405a9a3c42be2db828b3cc6a3928bce4375d14f80666b9c93a72f822840c14a41f606dcfb47acc538d1db4d713e1257d6ac19f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cjhblsm.tfm \
tex-cjhblsm.vf \
tex-cjhbltx.tfm \
tex-cjhbltx.vf \
tex-cjheblsm.tfm \
tex-cjhebltx.enc \
tex-cjhebltx.tfm \
tex-cjhebrew.map \
tex-cjhebrew.sty \
tex-rcjhblsm.tfm \
tex-rcjhbltx.tfm \
texlive-cjhebrew"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-luabidi.sty \
tex-updmap.cfg \
texlive \
texlive-cjhebrew-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
