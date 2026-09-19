SUMMARY = "CharisSIL fonts with support for all LaTeX engines"
DESCRIPTION = "This package provides the CharisSIL family of fonts adapted by \
SIL International from Bitstream Charter in TrueType format, \
with support for LaTeX, pdfLaTeX, XeLaTeX and LuaLaTeX."
LICENSE = "OFL-1.1"

PV = "2026.226.6.101svn64998"

RPM_NAME = "texlive-charissil-2026.226.6.101svn64998-60.2.noarch.rpm"
RPM_HASH = "8e862d3d9b15819f3ecc5778e92fec1fbaffdb0c7605807f5a347b879b496f27980d84f80dd38db6b57354d4a4849d1f4a27cb73e356bfbc42a56410701f5403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-CharisSIL.sty \
tex-LY1charssil-TLF.fd \
tex-OT1charssil-TLF.fd \
tex-T1charssil-TLF.fd \
tex-T2Acharssil-TLF.fd \
tex-T2Bcharssil-TLF.fd \
tex-T2Ccharssil-TLF.fd \
tex-TS1charssil-TLF.fd \
tex-a-26lu5p.enc \
tex-a-7qkcho.enc \
tex-a-byetuc.enc \
tex-a-fhbboz.enc \
tex-a-fr2ebm.enc \
tex-a-jf3wr2.enc \
tex-a-l6xsmm.enc \
tex-a-liimvs.enc \
tex-a-lxhc3o.enc \
tex-a-rflyh3.enc \
tex-a-x7dpvy.enc \
tex-a-yszurh.enc \
tex-a-zn43lu.enc \
tex-charssil-Bold-tlf-ly1.tfm \
tex-charssil-Bold-tlf-ot1.tfm \
tex-charssil-Bold-tlf-sc-ly1--base.tfm \
tex-charssil-Bold-tlf-sc-ly1.tfm \
tex-charssil-Bold-tlf-sc-ly1.vf \
tex-charssil-Bold-tlf-sc-ot1--base.tfm \
tex-charssil-Bold-tlf-sc-ot1.tfm \
tex-charssil-Bold-tlf-sc-ot1.vf \
tex-charssil-Bold-tlf-sc-t1--base.tfm \
tex-charssil-Bold-tlf-sc-t1.tfm \
tex-charssil-Bold-tlf-sc-t1.vf \
tex-charssil-Bold-tlf-sc-t2a--base.tfm \
tex-charssil-Bold-tlf-sc-t2a.tfm \
tex-charssil-Bold-tlf-sc-t2a.vf \
tex-charssil-Bold-tlf-sc-t2b--base.tfm \
tex-charssil-Bold-tlf-sc-t2b.tfm \
tex-charssil-Bold-tlf-sc-t2b.vf \
tex-charssil-Bold-tlf-sc-t2c--base.tfm \
tex-charssil-Bold-tlf-sc-t2c.tfm \
tex-charssil-Bold-tlf-sc-t2c.vf \
tex-charssil-Bold-tlf-t1--base.tfm \
tex-charssil-Bold-tlf-t1.tfm \
tex-charssil-Bold-tlf-t1.vf \
tex-charssil-Bold-tlf-t2a.tfm \
tex-charssil-Bold-tlf-t2b.tfm \
tex-charssil-Bold-tlf-t2c.tfm \
tex-charssil-Bold-tlf-ts1--base.tfm \
tex-charssil-Bold-tlf-ts1.tfm \
tex-charssil-Bold-tlf-ts1.vf \
tex-charssil-BoldItalic-tlf-ly1.tfm \
tex-charssil-BoldItalic-tlf-ot1.tfm \
tex-charssil-BoldItalic-tlf-sc-ly1--base.tfm \
tex-charssil-BoldItalic-tlf-sc-ly1.tfm \
tex-charssil-BoldItalic-tlf-sc-ly1.vf \
tex-charssil-BoldItalic-tlf-sc-ot1--base.tfm \
tex-charssil-BoldItalic-tlf-sc-ot1.tfm \
tex-charssil-BoldItalic-tlf-sc-ot1.vf \
tex-charssil-BoldItalic-tlf-sc-t1--base.tfm \
tex-charssil-BoldItalic-tlf-sc-t1.tfm \
tex-charssil-BoldItalic-tlf-sc-t1.vf \
tex-charssil-BoldItalic-tlf-sc-t2a--base.tfm \
tex-charssil-BoldItalic-tlf-sc-t2a.tfm \
tex-charssil-BoldItalic-tlf-sc-t2a.vf \
tex-charssil-BoldItalic-tlf-sc-t2b--base.tfm \
tex-charssil-BoldItalic-tlf-sc-t2b.tfm \
tex-charssil-BoldItalic-tlf-sc-t2b.vf \
tex-charssil-BoldItalic-tlf-sc-t2c--base.tfm \
tex-charssil-BoldItalic-tlf-sc-t2c.tfm \
tex-charssil-BoldItalic-tlf-sc-t2c.vf \
tex-charssil-BoldItalic-tlf-t1--base.tfm \
tex-charssil-BoldItalic-tlf-t1.tfm \
tex-charssil-BoldItalic-tlf-t1.vf \
tex-charssil-BoldItalic-tlf-t2a.tfm \
tex-charssil-BoldItalic-tlf-t2b.tfm \
tex-charssil-BoldItalic-tlf-t2c.tfm \
tex-charssil-BoldItalic-tlf-ts1--base.tfm \
tex-charssil-BoldItalic-tlf-ts1.tfm \
tex-charssil-BoldItalic-tlf-ts1.vf \
tex-charssil-Italic-tlf-ly1.tfm \
tex-charssil-Italic-tlf-ot1.tfm \
tex-charssil-Italic-tlf-sc-ly1--base.tfm \
tex-charssil-Italic-tlf-sc-ly1.tfm \
tex-charssil-Italic-tlf-sc-ly1.vf \
tex-charssil-Italic-tlf-sc-ot1--base.tfm \
tex-charssil-Italic-tlf-sc-ot1.tfm \
tex-charssil-Italic-tlf-sc-ot1.vf \
tex-charssil-Italic-tlf-sc-t1--base.tfm \
tex-charssil-Italic-tlf-sc-t1.tfm \
tex-charssil-Italic-tlf-sc-t1.vf \
tex-charssil-Italic-tlf-sc-t2a--base.tfm \
tex-charssil-Italic-tlf-sc-t2a.tfm \
tex-charssil-Italic-tlf-sc-t2a.vf \
tex-charssil-Italic-tlf-sc-t2b--base.tfm \
tex-charssil-Italic-tlf-sc-t2b.tfm \
tex-charssil-Italic-tlf-sc-t2b.vf \
tex-charssil-Italic-tlf-sc-t2c--base.tfm \
tex-charssil-Italic-tlf-sc-t2c.tfm \
tex-charssil-Italic-tlf-sc-t2c.vf \
tex-charssil-Italic-tlf-t1--base.tfm \
tex-charssil-Italic-tlf-t1.tfm \
tex-charssil-Italic-tlf-t1.vf \
tex-charssil-Italic-tlf-t2a.tfm \
tex-charssil-Italic-tlf-t2b.tfm \
tex-charssil-Italic-tlf-t2c.tfm \
tex-charssil-Italic-tlf-ts1--base.tfm \
tex-charssil-Italic-tlf-ts1.tfm \
tex-charssil-Italic-tlf-ts1.vf \
tex-charssil-tlf-ly1.tfm \
tex-charssil-tlf-ot1.tfm \
tex-charssil-tlf-sc-ly1--base.tfm \
tex-charssil-tlf-sc-ly1.tfm \
tex-charssil-tlf-sc-ly1.vf \
tex-charssil-tlf-sc-ot1--base.tfm \
tex-charssil-tlf-sc-ot1.tfm \
tex-charssil-tlf-sc-ot1.vf \
tex-charssil-tlf-sc-t1--base.tfm \
tex-charssil-tlf-sc-t1.tfm \
tex-charssil-tlf-sc-t1.vf \
tex-charssil-tlf-sc-t2a--base.tfm \
tex-charssil-tlf-sc-t2a.tfm \
tex-charssil-tlf-sc-t2a.vf \
tex-charssil-tlf-sc-t2b--base.tfm \
tex-charssil-tlf-sc-t2b.tfm \
tex-charssil-tlf-sc-t2b.vf \
tex-charssil-tlf-sc-t2c--base.tfm \
tex-charssil-tlf-sc-t2c.tfm \
tex-charssil-tlf-sc-t2c.vf \
tex-charssil-tlf-t1--base.tfm \
tex-charssil-tlf-t1.tfm \
tex-charssil-tlf-t1.vf \
tex-charssil-tlf-t2a.tfm \
tex-charssil-tlf-t2b.tfm \
tex-charssil-tlf-t2c.tfm \
tex-charssil-tlf-ts1--base.tfm \
tex-charssil-tlf-ts1.tfm \
tex-charssil-tlf-ts1.vf \
tex-charssil.map \
texlive-charissil"

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
tex-mweights.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-charissil-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
