SUMMARY = "Drop-in replacement for 'ocgx' and 'ocg-p'"
DESCRIPTION = "This package serves as a drop-in replacement for the packages \
ocgx by Paul Gaborit and ocg-p by Werner Moshammer for the \
creation of PDF Layers. It re-implements the functionality of \
the ocg, ocgx, and ocg-p packages and adds support for all \
known engines and back-ends including: LaTeX - dvips - \
ps2pdf/Distiller (Xe)LaTeX(x) - dvipdfmx pdfLaTeX and LuaLaTeX \
. It also ensures compatibility with the media9 and animate \
packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.60svn76924"

RPM_NAME = "texlive-ocgx2-2026.226.0.0.60svn76924-61.2.noarch.rpm"
RPM_HASH = "3e85b72c2c8e48754d367e55bbe38893767bf9125816150434e225f59f14ff41c6a18f7a6031da29ef15525f7945a26681bcf4a5fa06dcc60a4a4168d5735f16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixocgx.sty \
tex-ocgbase.sty \
tex-ocgx2.sty \
texlive-ocgx2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-ocgx.sty \
tex-pdfbase.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
