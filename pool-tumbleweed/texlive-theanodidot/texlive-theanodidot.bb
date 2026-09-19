SUMMARY = "TheanoDidot fonts with LaTeX support"
DESCRIPTION = "This package provides the TheanoDidot font designed by Alexey \
Kryukov, in both TrueType and Type1 formats, with support for \
both traditional and modern LaTeX processors. An \
artificially-emboldened variant has been provided but there are \
no italic variants. The package is named after Theano, a famous \
Ancient Greek woman philosopher, who was first a student of \
Pythagoras, and supposedly became his wife. The Didot family \
were active as designers for about 100 years in the 18th and \
19th centuries. They were printers, publishers, typeface \
designers, inventors and intellectuals. Around 1800 the Didot \
family owned the most important print shop and font foundry in \
France. Pierre Didot, the printer, published a document with \
the typefaces of his brother, Firmin Didot, the typeface \
designer. The strong clear forms of this alphabet display \
objective, rational characteristics and are representative of \
the time and philosophy of the Enlightenment."
LICENSE = "LPPL-1.0"

PV = "2026.227.svn64518"

RPM_NAME = "texlive-theanodidot-2026.227.svn64518-62.2.noarch.rpm"
RPM_HASH = "9a408151964169741929b8e0b2803ca387fd1648bea57e2f7b46adb0afa051cfddc51a1009f3affe12a026e2b31781d509650b4d69ea6c57bb188e5bd9479f9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LGRTheanoDidot-TLF.fd \
tex-LGRTheanoDidot-TOsF.fd \
tex-LY1TheanoDidot-TLF.fd \
tex-LY1TheanoDidot-TOsF.fd \
tex-OT1TheanoDidot-TLF.fd \
tex-OT1TheanoDidot-TOsF.fd \
tex-T1TheanoDidot-TLF.fd \
tex-T1TheanoDidot-TOsF.fd \
tex-TS1TheanoDidot-TLF.fd \
tex-TS1TheanoDidot-TOsF.fd \
tex-TheanoDidot-Bold-tlf-lgr.tfm \
tex-TheanoDidot-Bold-tlf-ly1.tfm \
tex-TheanoDidot-Bold-tlf-ot1.tfm \
tex-TheanoDidot-Bold-tlf-t1--base.tfm \
tex-TheanoDidot-Bold-tlf-t1.tfm \
tex-TheanoDidot-Bold-tlf-t1.vf \
tex-TheanoDidot-Bold-tlf-ts1--base.tfm \
tex-TheanoDidot-Bold-tlf-ts1.tfm \
tex-TheanoDidot-Bold-tlf-ts1.vf \
tex-TheanoDidot-Bold-tosf-lgr.tfm \
tex-TheanoDidot-Bold-tosf-ly1.tfm \
tex-TheanoDidot-Bold-tosf-ot1.tfm \
tex-TheanoDidot-Bold-tosf-t1--base.tfm \
tex-TheanoDidot-Bold-tosf-t1.tfm \
tex-TheanoDidot-Bold-tosf-t1.vf \
tex-TheanoDidot-Bold-tosf-ts1--base.tfm \
tex-TheanoDidot-Bold-tosf-ts1.tfm \
tex-TheanoDidot-Bold-tosf-ts1.vf \
tex-TheanoDidot-Regular-tlf-lgr.tfm \
tex-TheanoDidot-Regular-tlf-ly1.tfm \
tex-TheanoDidot-Regular-tlf-ot1.tfm \
tex-TheanoDidot-Regular-tlf-t1--base.tfm \
tex-TheanoDidot-Regular-tlf-t1.tfm \
tex-TheanoDidot-Regular-tlf-t1.vf \
tex-TheanoDidot-Regular-tlf-ts1--base.tfm \
tex-TheanoDidot-Regular-tlf-ts1.tfm \
tex-TheanoDidot-Regular-tlf-ts1.vf \
tex-TheanoDidot-Regular-tosf-lgr.tfm \
tex-TheanoDidot-Regular-tosf-ly1.tfm \
tex-TheanoDidot-Regular-tosf-ot1.tfm \
tex-TheanoDidot-Regular-tosf-t1--base.tfm \
tex-TheanoDidot-Regular-tosf-t1.tfm \
tex-TheanoDidot-Regular-tosf-t1.vf \
tex-TheanoDidot-Regular-tosf-ts1--base.tfm \
tex-TheanoDidot-Regular-tosf-ts1.tfm \
tex-TheanoDidot-Regular-tosf-ts1.vf \
tex-TheanoDidot.map \
tex-TheanoDidot.sty \
tex-thdid-alkcdl.enc \
tex-thdid-ertqq3.enc \
tex-thdid-f66p55.enc \
tex-thdid-izaajv.enc \
tex-thdid-k6ngqv.enc \
tex-thdid-lqxlns.enc \
tex-thdid-oiucyb.enc \
tex-thdid-whuz6y.enc \
tex-thdid-xgfkyc.enc \
tex-thdid-zj2gif.enc \
texlive-theanodidot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontaxes.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-theanodidot-fonts"

inherit rpm
