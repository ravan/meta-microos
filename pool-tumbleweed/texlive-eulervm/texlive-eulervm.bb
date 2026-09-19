SUMMARY = "Euler virtual math fonts"
DESCRIPTION = "The well-known Euler fonts are suitable for typesetting \
mathematics in conjunction with a variety of text fonts which \
do not provide mathematical character sets of their own. \
Euler-VM is a set of virtual mathematics fonts based on Euler \
and CM. This approach has several advantages over immediately \
using the real Euler fonts: Most noticeably, less TeX resources \
are consumed, the quality of various math symbols is improved \
and a usable \\hslash symbol can be provided. The virtual fonts \
are accompanied by a LaTeX package which makes them easy to \
use, particularly in conjunction with Type1 PostScript text \
fonts. They are compatible with amsmath. A package option \
allows the fonts to be loaded at 95% of their nominal size, \
thus blending better with certain text fonts, e.g., Minion."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0svn77682"

RPM_NAME = "texlive-eulervm-2026.226.4.0svn77682-59.2.noarch.rpm"
RPM_HASH = "d0c445aacc49934d713e983ff916a6e5c7dceb8bde520e97eed34e63ca8f4703cc9a53dcd346eb646d5ecfb933f7eceaf19bb427b231de150d710154f5414c62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eulervm.sty \
tex-uzeuex.fd \
tex-uzeur.fd \
tex-uzeus.fd \
tex-zeuex10.tfm \
tex-zeuex10.vf \
tex-zeurb10.tfm \
tex-zeurb10.vf \
tex-zeurb5.tfm \
tex-zeurb5.vf \
tex-zeurb7.tfm \
tex-zeurb7.vf \
tex-zeurm10.tfm \
tex-zeurm10.vf \
tex-zeurm5.tfm \
tex-zeurm5.vf \
tex-zeurm7.tfm \
tex-zeurm7.vf \
tex-zeusb10.tfm \
tex-zeusb10.vf \
tex-zeusb5.tfm \
tex-zeusb5.vf \
tex-zeusb7.tfm \
tex-zeusb7.vf \
tex-zeusm10.tfm \
tex-zeusm10.vf \
tex-zeusm5.tfm \
tex-zeusm5.vf \
tex-zeusm7.tfm \
tex-zeusm7.vf \
texlive-eulervm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmbsy10.tfm \
tex-cmbsy5.tfm \
tex-cmbsy7.tfm \
tex-cmbx10.tfm \
tex-cmbx5.tfm \
tex-cmbx7.tfm \
tex-cmex10.tfm \
tex-cmmi10.tfm \
tex-cmmi5.tfm \
tex-cmmi7.tfm \
tex-cmmib10.tfm \
tex-cmmib5.tfm \
tex-cmmib7.tfm \
tex-cmr10.tfm \
tex-cmr5.tfm \
tex-cmr7.tfm \
tex-cmsy10.tfm \
tex-cmsy5.tfm \
tex-cmsy7.tfm \
tex-euex10.tfm \
tex-eufb10.tfm \
tex-eufb5.tfm \
tex-eufb7.tfm \
tex-eufm10.tfm \
tex-eufm5.tfm \
tex-eufm7.tfm \
tex-eurb10.tfm \
tex-eurb5.tfm \
tex-eurb7.tfm \
tex-eurm10.tfm \
tex-eurm5.tfm \
tex-eurm7.tfm \
tex-eusb10.tfm \
tex-eusb5.tfm \
tex-eusb7.tfm \
tex-eusm10.tfm \
tex-eusm5.tfm \
tex-eusm7.tfm \
tex-msam10.tfm \
tex-msam5.tfm \
tex-msam7.tfm \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
