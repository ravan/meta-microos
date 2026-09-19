SUMMARY = "Japanese document class collection for all major engines"
DESCRIPTION = "This package provides an extended version of the Japanese \
document class collection provided by jsclasses. While the \
original version supports only pLaTeX and upLaTeX, the extended \
version also supports pdfLaTeX, XeLaTeX and LuaLaTeX, with the \
aid of suitable packages that provide capability of Japanese \
typesetting."
LICENSE = "BSD-3-Clause"

PV = "2026.226.2.9dsvn75447"

RPM_NAME = "texlive-bxjscls-2026.226.2.9dsvn75447-59.2.noarch.rpm"
RPM_HASH = "19e45e4c11f161e0219cd11e2d093e99db6e5af7c6f9d44277e31b0a2a4da991c5fca2b48ffcc9b6f40663c77357c44f3a237a7a418f5fe53de6709fda6d8d85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxjsarticle.cls \
tex-bxjsbook.cls \
tex-bxjscjkcat.sty \
tex-bxjscompat.sty \
tex-bxjsja-minimal.def \
tex-bxjsja-modern.def \
tex-bxjsja-pandoc.def \
tex-bxjsja-standard.def \
tex-bxjspandoc.sty \
tex-bxjsreport.cls \
tex-bxjsslide.cls \
texlive-bxjscls"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-bxcalc.sty \
tex-bxcjkjatype.sty \
tex-bxghost.sty \
tex-bxorigcapt.sty \
tex-bxwareki.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-filehook.sty \
tex-fixltx2e.sty \
tex-geometry.sty \
tex-iftex.sty \
tex-inputenc.sty \
tex-jslogo.sty \
tex-keyval.sty \
tex-luatexja-fontspec.sty \
tex-luatexja-preset.sty \
tex-luatexja.sty \
tex-pdftexcmds.sty \
tex-plautopatch.sty \
tex-polyglossia.sty \
tex-pxchfon.sty \
tex-pxjahyper-enc.sty \
tex-pxjahyper-uni.def \
tex-t1enc.def \
tex-type1cm.sty \
tex-zxjafont.sty \
tex-zxjatype.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
