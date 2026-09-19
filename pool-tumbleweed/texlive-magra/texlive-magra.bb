SUMMARY = "The Magra font face with support for LaTeX and pdfLaTeX"
DESCRIPTION = "This package provides the Magra family of fonts designed by \
FontFuror, with support for LaTeX and pdfLaTeX."
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.0.1svn57373"

RPM_NAME = "texlive-magra-2026.226.0.0.0.1svn57373-59.2.noarch.rpm"
RPM_HASH = "0d547c1ec4bcdf3df11036fd9dae5838a37e8e59284bfef605eb3a3c834422c80ca43ee6ed6a4b775dc7ca803e223aa3e9c069d582fc02632a3d46e24a48f47a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LY1Magra-TLF.fd \
tex-Magra-Bold-tlf-ly1--base.tfm \
tex-Magra-Bold-tlf-ly1.tfm \
tex-Magra-Bold-tlf-ly1.vf \
tex-Magra-Bold-tlf-ot1.tfm \
tex-Magra-Bold-tlf-t1--base.tfm \
tex-Magra-Bold-tlf-t1.tfm \
tex-Magra-Bold-tlf-t1.vf \
tex-Magra-Bold-tlf-ts1--base.tfm \
tex-Magra-Bold-tlf-ts1.tfm \
tex-Magra-Bold-tlf-ts1.vf \
tex-Magra-tlf-ly1--base.tfm \
tex-Magra-tlf-ly1.tfm \
tex-Magra-tlf-ly1.vf \
tex-Magra-tlf-ot1.tfm \
tex-Magra-tlf-t1--base.tfm \
tex-Magra-tlf-t1.tfm \
tex-Magra-tlf-t1.vf \
tex-Magra-tlf-ts1--base.tfm \
tex-Magra-tlf-ts1.tfm \
tex-Magra-tlf-ts1.vf \
tex-Magra.map \
tex-Magra.sty \
tex-OT1Magra-TLF.fd \
tex-T1Magra-TLF.fd \
tex-TS1Magra-TLF.fd \
tex-a-dip3eq.enc \
tex-a-jqnft2.enc \
tex-a-radyzq.enc \
tex-a-va7yvq.enc \
texlive-magra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontaxes.sty \
tex-fontenc.sty \
tex-ifthen.sty \
tex-mweights.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-magra-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
