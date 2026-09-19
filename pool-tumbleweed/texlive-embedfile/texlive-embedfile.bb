SUMMARY = "Embed files into PDF"
DESCRIPTION = "This package embeds files in a PDF document, using the PDF \
format's embedding operation (note the contrast with the attach \
operation used by the attachfile and attachfile2 packages). \
Currently only pdfTeX >=1.30, in PDF mode, is supported."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.13svn77682"

RPM_NAME = "texlive-embedfile-2026.226.2.13svn77682-61.4.noarch.rpm"
RPM_HASH = "74b4ac73df9bb80c79bdbd71061648564dd3cbb99bf7b859961d670ac93ce0e6888064aa35354f34f5adee74f9a94c7734c726336febb9c00023417a7edf33fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dtx-attach.sty \
tex-embedfile.sty \
texlive-embedfile"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
