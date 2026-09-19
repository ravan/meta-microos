SUMMARY = "Create a cross-document bookmark tree"
DESCRIPTION = "The package defines the concept of a document bundle, which is \
a collection of documents that are to be built separately, but \
have a common bookmark tree. The only options are driver \
options, these are dvips (Acrobat Distiller or ps2pdf these can \
be used as the PDF creator), pdfLaTeX (and LuaLaTeX, which is \
treated the same as pdfLaTeX), and XeLaTeX. The package \
auto-detects pdfLaTeX and XeLaTeX, and dvips is the default, so \
there is actually no need to pass the driver option."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn53448"

RPM_NAME = "texlive-xbmks-2026.226.svn53448-59.4.noarch.rpm"
RPM_HASH = "0f6b16ba9cf70da623e08c98a2403c5d2b6aa3069c4f079e823d82ac2432e41a6d0380c94e16276e61676846de7fde0d84e8cebfdf78bdad0d3147597b75c4b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xbmks-pdfmark.def \
tex-xbmks-pdftex.def \
tex-xbmks-xetex.def \
tex-xbmks.sty \
texlive-xbmks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
