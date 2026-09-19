SUMMARY = "Tinos fonts with LaTeX support"
DESCRIPTION = "Tinos, designed by Steve Matteson, is an innovative, refreshing \
serif design that is metrically compatible with Times New \
Roman."
LICENSE = "Apache-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-tinos-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "3b621cc227ba1ee33951fa761bd14490ed3f6bf06c5cf93b0a3f919c7eb815e85974ed4d82b0eee57c2e74c723464ce1526bcb407078b3a0dcf0f6149da0e48c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LY1Tinos-TLF.fd \
tex-OT1Tinos-TLF.fd \
tex-T1Tinos-TLF.fd \
tex-TS1Tinos-TLF.fd \
tex-Tinos-Bold-tlf-ly1.tfm \
tex-Tinos-Bold-tlf-ot1.tfm \
tex-Tinos-Bold-tlf-t1--base.tfm \
tex-Tinos-Bold-tlf-t1.tfm \
tex-Tinos-Bold-tlf-t1.vf \
tex-Tinos-Bold-tlf-ts1--base.tfm \
tex-Tinos-Bold-tlf-ts1.tfm \
tex-Tinos-Bold-tlf-ts1.vf \
tex-Tinos-BoldItalic-tlf-ly1.tfm \
tex-Tinos-BoldItalic-tlf-ot1.tfm \
tex-Tinos-BoldItalic-tlf-t1--base.tfm \
tex-Tinos-BoldItalic-tlf-t1.tfm \
tex-Tinos-BoldItalic-tlf-t1.vf \
tex-Tinos-BoldItalic-tlf-ts1--base.tfm \
tex-Tinos-BoldItalic-tlf-ts1.tfm \
tex-Tinos-BoldItalic-tlf-ts1.vf \
tex-Tinos-Italic-tlf-ly1.tfm \
tex-Tinos-Italic-tlf-ot1.tfm \
tex-Tinos-Italic-tlf-t1--base.tfm \
tex-Tinos-Italic-tlf-t1.tfm \
tex-Tinos-Italic-tlf-t1.vf \
tex-Tinos-Italic-tlf-ts1--base.tfm \
tex-Tinos-Italic-tlf-ts1.tfm \
tex-Tinos-Italic-tlf-ts1.vf \
tex-Tinos-tlf-ly1.tfm \
tex-Tinos-tlf-ot1.tfm \
tex-Tinos-tlf-t1--base.tfm \
tex-Tinos-tlf-t1.tfm \
tex-Tinos-tlf-t1.vf \
tex-Tinos-tlf-ts1--base.tfm \
tex-Tinos-tlf-ts1.tfm \
tex-Tinos-tlf-ts1.vf \
tex-tinos.map \
tex-tinos.sty \
tex-tns-27astb.enc \
tex-tns-s6t4vy.enc \
tex-tns-xze2cy.enc \
tex-tns-y6kixo.enc \
texlive-tinos"

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
texlive-tinos-fonts"

inherit rpm
