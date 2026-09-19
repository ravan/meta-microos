SUMMARY = "Code for PDF tagging using pdfLaTeX and LuaLaTeX"
DESCRIPTION = "The package contains the core code for tagging and \
accessibility used by the LaTeX kernel in the Tagged PDF \
project. See https://github.com/latex3/tagging-project for more \
information."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.99ysvn77539"

RPM_NAME = "texlive-tagpdf-2026.227.0.0.99ysvn77539-62.2.noarch.rpm"
RPM_HASH = "aeda1e4cb6beacd7077de90fe5fad01a97cdbb181fc47dd4c6d6816fb56589f5fe57f57db0b62406f7ca2922913cbe7a907ac26abcc335628a002ff110f6c95e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tagpdf-base.sty \
tex-tagpdf-debug-generic.sty \
tex-tagpdf-debug-lua.sty \
tex-tagpdf-debug.sty \
tex-tagpdf-luatex.def \
tex-tagpdf-mc-code-generic.sty \
tex-tagpdf-mc-code-lua.sty \
tex-tagpdf-ns-latex-book.def \
tex-tagpdf-ns-latex-inline.def \
tex-tagpdf-ns-latex.def \
tex-tagpdf-ns-mathml.def \
tex-tagpdf-ns-pdf.def \
tex-tagpdf-ns-pdf2.def \
tex-tagpdf.sty \
tex-tagpdfdocu-patches.sty \
texlive-tagpdf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
