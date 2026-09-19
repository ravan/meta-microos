SUMMARY = "Font support for the Arka language"
DESCRIPTION = "The package supports typesetting hacm, the alphabet of the \
constructed language Arka. The bundle provides nine official \
fonts, in Adobe Type 1 format."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn27671"

RPM_NAME = "texlive-hacm-2026.226.0.0.1svn27671-60.4.noarch.rpm"
RPM_HASH = "fa896ff363eb5258f2bed2d6e79f9696320b3e5af6d570eaa740ae6922b3a6a4e3045213cad3535a09bc1a9b1492d413b827449b371ea108bb7a022fe15ef1b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-alblant.tfm \
tex-alblant.vf \
tex-defans.tfm \
tex-defans.vf \
tex-fenlil.tfm \
tex-fenlil.vf \
tex-fialis.tfm \
tex-fialis.vf \
tex-hacm.map \
tex-hacm.sty \
tex-inje.tfm \
tex-inje.vf \
tex-kardinal.tfm \
tex-kardinal.vf \
tex-lantia.tfm \
tex-lantia.vf \
tex-nalnia.tfm \
tex-nalnia.vf \
tex-olivia.tfm \
tex-olivia.vf \
tex-ot1halb.fd \
tex-ot1hdef.fd \
tex-ot1hfen.fd \
tex-ot1hfia.fd \
tex-ot1hinj.fd \
tex-ot1hkar.fd \
tex-ot1hlan.fd \
tex-ralblant.tfm \
tex-rdefans.tfm \
tex-rfenlil.tfm \
tex-rfialis.tfm \
tex-rinje.tfm \
tex-rkardinal.tfm \
tex-rlantia.tfm \
tex-rnalnia.tfm \
tex-rolivia.tfm \
texlive-hacm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-hacm-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
