SUMMARY = "A Type 1 font and LaTeX support for Libertinus Math"
DESCRIPTION = "The package provides a Type1 version of Libertinus Math, with a \
number of additions and changes, plus LaTeX support files that \
allow it to serve as a math accompaniment to Libertine under \
LaTeX. In addition, with option sansmath, it can function as a \
standalone math font with sans serif Roman and Greek letters."
LICENSE = "OFL-1.1"

PV = "2026.226.2.0.6svn77682"

RPM_NAME = "texlive-libertinust1math-2026.226.2.0.6svn77682-61.2.noarch.rpm"
RPM_HASH = "68593ec957917a3503ce41d6c0c68a2c9822c213d11419cb3f5d788579337d491e0fc72f7c9495f9aa6e7510c8d4616cfd4a01e2f1fc65872006d4fc6a9a7a21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-BDXsfmi-bol.tfm \
tex-BDXsfmi-reg.tfm \
tex-BDXsfmr-bol.tfm \
tex-BDXsfmr-reg.tfm \
tex-LibertinusSerif-Italic-tlf-t1-tmp.tfm \
tex-LibertinusSerifTH-Italic-tlf-ot1.tfm \
tex-LibertinusSerifTH-Italic-tlf-ot1.vf \
tex-LibertinusSerifTH-Italic-tlf-t1.tfm \
tex-LibertinusSerifTH-Italic-tlf-t1.vf \
tex-lbtsth.enc \
tex-libertinust1-mathbb.tfm \
tex-libertinust1-mathex.tfm \
tex-libertinust1-mathit-bold.tfm \
tex-libertinust1-mathit.tfm \
tex-libertinust1-mathrm-bold.tfm \
tex-libertinust1-mathrm.tfm \
tex-libertinust1-mathsf.tfm \
tex-libertinust1-mathsfb.tfm \
tex-libertinust1-mathsfi.tfm \
tex-libertinust1-mathsfit-bold.tfm \
tex-libertinust1-mathsfit-bold.vf \
tex-libertinust1-mathsfit.tfm \
tex-libertinust1-mathsfit.vf \
tex-libertinust1-mathsfrm-bold.tfm \
tex-libertinust1-mathsfrm-bold.vf \
tex-libertinust1-mathsfrm.tfm \
tex-libertinust1-mathsfrm.vf \
tex-libertinust1-mathsym.tfm \
tex-libertinust1math.map \
tex-libertinust1math.sty \
tex-libusBB.enc \
tex-libusBMI.enc \
tex-libusBMR.enc \
tex-libusEX.enc \
tex-libusFRK.enc \
tex-libusMI.enc \
tex-libusMR.enc \
tex-libusSF.enc \
tex-libusSFB.enc \
tex-libusSFI.enc \
tex-libusSYM.enc \
tex-libussfMI.enc \
tex-libussfMR.enc \
tex-ls1libertinust1math.fd \
tex-ls1libertinust1mathbb.fd \
tex-ls1libertinust1mathsf.fd \
tex-ls2libertinust1mathex.fd \
tex-ls2libertinust1mathsym.fd \
tex-ot1libertinust1mathsf.fd \
texlive-libertinust1math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-LibertinusSerif-Italic-tlf-ot1.tfm \
tex-LibertinusSerif-Regular-tlf-ot1.tfm \
tex-LibertinusSerif-Regular-tlf-t1.tfm \
tex-amsmath.sty \
tex-amsthm.sty \
tex-etoolbox.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-libertinust1math-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
