SUMMARY = "Support for the Caladea family of fonts"
DESCRIPTION = "This package provides LaTeX, pdfLaTeX, XeLaTeX and LuaLaTeX \
support for the Caladea family of fonts, designed by Carolina \
Giovagnoli and Andres Torresi of the Huerta Tipografica foundry \
and adopted by Google for ChromeOS as a font-metric compatible \
replacement for Cambria."
LICENSE = "Apache-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-caladea-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "7ff33d061ac9c69fd1a554cde57f4281124243d303909d95263ee18a5e35ece34f53d1bc9679552c0931b2f15895869e00697d0b86414565d3ab4877b2e2f438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Caladea-Bold-tlf-ly1--base.tfm \
tex-Caladea-Bold-tlf-ly1.tfm \
tex-Caladea-Bold-tlf-ly1.vf \
tex-Caladea-Bold-tlf-ot1.tfm \
tex-Caladea-Bold-tlf-t1--base.tfm \
tex-Caladea-Bold-tlf-t1.tfm \
tex-Caladea-Bold-tlf-t1.vf \
tex-Caladea-Bold-tlf-ts1--base.tfm \
tex-Caladea-Bold-tlf-ts1.tfm \
tex-Caladea-Bold-tlf-ts1.vf \
tex-Caladea-BoldItalic-tlf-ly1--base.tfm \
tex-Caladea-BoldItalic-tlf-ly1.tfm \
tex-Caladea-BoldItalic-tlf-ly1.vf \
tex-Caladea-BoldItalic-tlf-ot1.tfm \
tex-Caladea-BoldItalic-tlf-t1--base.tfm \
tex-Caladea-BoldItalic-tlf-t1.tfm \
tex-Caladea-BoldItalic-tlf-t1.vf \
tex-Caladea-BoldItalic-tlf-ts1--base.tfm \
tex-Caladea-BoldItalic-tlf-ts1.tfm \
tex-Caladea-BoldItalic-tlf-ts1.vf \
tex-Caladea-Italic-tlf-ly1--base.tfm \
tex-Caladea-Italic-tlf-ly1.tfm \
tex-Caladea-Italic-tlf-ly1.vf \
tex-Caladea-Italic-tlf-ot1.tfm \
tex-Caladea-Italic-tlf-t1--base.tfm \
tex-Caladea-Italic-tlf-t1.tfm \
tex-Caladea-Italic-tlf-t1.vf \
tex-Caladea-Italic-tlf-ts1--base.tfm \
tex-Caladea-Italic-tlf-ts1.tfm \
tex-Caladea-Italic-tlf-ts1.vf \
tex-Caladea-Regular-tlf-ly1--base.tfm \
tex-Caladea-Regular-tlf-ly1.tfm \
tex-Caladea-Regular-tlf-ly1.vf \
tex-Caladea-Regular-tlf-ot1.tfm \
tex-Caladea-Regular-tlf-t1--base.tfm \
tex-Caladea-Regular-tlf-t1.tfm \
tex-Caladea-Regular-tlf-t1.vf \
tex-Caladea-Regular-tlf-ts1--base.tfm \
tex-Caladea-Regular-tlf-ts1.tfm \
tex-Caladea-Regular-tlf-ts1.vf \
tex-LY1Caladea-TLF.fd \
tex-OT1Caladea-TLF.fd \
tex-T1Caladea-TLF.fd \
tex-TS1Caladea-TLF.fd \
tex-caladea.map \
tex-caladea.sty \
tex-cld-cb3g7n.enc \
tex-cld-fjy5hl.enc \
tex-cld-prieif.enc \
tex-cld-w45fff.enc \
texlive-caladea"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-caladea-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
