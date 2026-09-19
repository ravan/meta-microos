SUMMARY = "Math support for Noto fonts"
DESCRIPTION = "Math support via newtxmath for Google's NotoSerif and NotoSans. \
(Regular and Bold weights only.)"
LICENSE = "OFL-1.1"

PV = "2026.226.1.031svn77682"

RPM_NAME = "texlive-notomath-2026.226.1.031svn77682-61.2.noarch.rpm"
RPM_HASH = "4f7d6af1559f735c06879866f9c24019cefb5ae8d7233a590873e8cf26c33a6eb50f7a93b0bc21d87516eb0bac0c230a38821b87039570eaddc821085e525397"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-NotoMath.map \
tex-NotoMathBMI.tfm \
tex-NotoMathBRM.tfm \
tex-NotoMathMI.tfm \
tex-NotoMathRM.tfm \
tex-NotoSansMathBMI.tfm \
tex-NotoSansMathBRM.tfm \
tex-NotoSansMathMI.tfm \
tex-NotoSansMathRM.tfm \
tex-notobmi.tfm \
tex-notobmi.vf \
tex-notobmia.tfm \
tex-notobmia.vf \
tex-notomath.sty \
tex-notomi.tfm \
tex-notomi.vf \
tex-notomia.tfm \
tex-notomia.vf \
tex-notosansbmi.tfm \
tex-notosansbmi.vf \
tex-notosansbmia.tfm \
tex-notosansbmia.vf \
tex-notosansmi.tfm \
tex-notosansmi.vf \
tex-notosansmia.tfm \
tex-notosansmia.vf \
tex-omlnotomi.fd \
tex-omlnotosansmi.fd \
texlive-notomath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontaxes.sty \
tex-fontenc.sty \
tex-mweights.sty \
tex-newtxmath.sty \
tex-noto-mono.sty \
tex-noto-sans.sty \
tex-noto-serif.sty \
tex-stxscr.tfm \
tex-textcomp.sty \
tex-txbmiaSTbb.tfm \
tex-txbmiaX.tfm \
tex-txmiaSTbb.tfm \
tex-txmiaX.tfm \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-notomath-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
