SUMMARY = "Multimedia inclusion package"
DESCRIPTION = "The package provides an interface to embed movies, sounds and \
3D objects into PDF documents for use with LaTeX as well as \
pdfLaTeX. The package defines a command \\includemovie with \
PDF-1.5 compatibility. Option 'autoplay' causes the media clip \
to be started right after the page has loaded. This is useful \
for side by side movie clips to be played back synchronously. \
The package is now superseded by media9"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn26473"

RPM_NAME = "texlive-movie15-2026.226.svn26473-61.2.noarch.rpm"
RPM_HASH = "62b26493c03a15d01f7ee65365d2c70415466eeca9684c403b339ca162158526f256983b7c3278b474332e3a5b39d77344ea7d3faafe687c0544a68e28fc8b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-movie15.sty \
texlive-movie15"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everyshi.sty \
tex-fp.sty \
tex-ifdraft.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
