SUMMARY = "The Arvo font face with support for LaTeX and pdfLaTeX"
DESCRIPTION = "This package provides the Arvo family of fonts designed by \
Anton Koovit, with support for LaTeX and pdfLaTeX."
LICENSE = "OFL-1.1"

PV = "2026.226.svn57213"

RPM_NAME = "texlive-arvo-2026.226.svn57213-60.2.noarch.rpm"
RPM_HASH = "e984f7e89493bfa892e2b6bda4083cd3e6435dec607d0b28c9e67be4804f471b06e18754e9ced28b4b05ae3092974f05bedccfa63cac38b0abd0e90828132bdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Arvo-Bold-tlf-ly1--base.tfm \
tex-Arvo-Bold-tlf-ly1.tfm \
tex-Arvo-Bold-tlf-ly1.vf \
tex-Arvo-Bold-tlf-ot1.tfm \
tex-Arvo-Bold-tlf-t1--base.tfm \
tex-Arvo-Bold-tlf-t1.tfm \
tex-Arvo-Bold-tlf-t1.vf \
tex-Arvo-Bold-tlf-ts1--base.tfm \
tex-Arvo-Bold-tlf-ts1.tfm \
tex-Arvo-Bold-tlf-ts1.vf \
tex-Arvo-BoldItalic-tlf-ly1--base.tfm \
tex-Arvo-BoldItalic-tlf-ly1.tfm \
tex-Arvo-BoldItalic-tlf-ly1.vf \
tex-Arvo-BoldItalic-tlf-ot1.tfm \
tex-Arvo-BoldItalic-tlf-t1--base.tfm \
tex-Arvo-BoldItalic-tlf-t1.tfm \
tex-Arvo-BoldItalic-tlf-t1.vf \
tex-Arvo-BoldItalic-tlf-ts1--base.tfm \
tex-Arvo-BoldItalic-tlf-ts1.tfm \
tex-Arvo-BoldItalic-tlf-ts1.vf \
tex-Arvo-Italic-tlf-ly1--base.tfm \
tex-Arvo-Italic-tlf-ly1.tfm \
tex-Arvo-Italic-tlf-ly1.vf \
tex-Arvo-Italic-tlf-ot1.tfm \
tex-Arvo-Italic-tlf-t1--base.tfm \
tex-Arvo-Italic-tlf-t1.tfm \
tex-Arvo-Italic-tlf-t1.vf \
tex-Arvo-Italic-tlf-ts1--base.tfm \
tex-Arvo-Italic-tlf-ts1.tfm \
tex-Arvo-Italic-tlf-ts1.vf \
tex-Arvo-tlf-ly1--base.tfm \
tex-Arvo-tlf-ly1.tfm \
tex-Arvo-tlf-ly1.vf \
tex-Arvo-tlf-ot1.tfm \
tex-Arvo-tlf-t1--base.tfm \
tex-Arvo-tlf-t1.tfm \
tex-Arvo-tlf-t1.vf \
tex-Arvo-tlf-ts1--base.tfm \
tex-Arvo-tlf-ts1.tfm \
tex-Arvo-tlf-ts1.vf \
tex-Arvo.map \
tex-Arvo.sty \
tex-LY1Arvo-TLF.fd \
tex-OT1Arvo-TLF.fd \
tex-T1Arvo-TLF.fd \
tex-TS1Arvo-TLF.fd \
tex-a-6czsg4.enc \
tex-a-fibvii.enc \
tex-a-fin2th.enc \
tex-a-jtfq37.enc \
tex-a-od575u.enc \
tex-a-vt66fp.enc \
tex-a-zmrji7.enc \
texlive-arvo"

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
texlive-arvo-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
