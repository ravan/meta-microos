SUMMARY = "Restore PDF 1.4 to a TeX Live 2010 format"
DESCRIPTION = "Starting with TeX Live 2010, the various formats, that directly \
generate PDF, default to generating PDF 1.5. This is generally \
a good thing, but it can lead to compatibility issues with some \
older PDF viewers. This package changes the version of PDF \
generated with formats (based on pdfTeX or LuaTeX in PDF mode), \
back to 1.4 for documents that need to achieve maximal \
compatibility with old viewers."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76924"

RPM_NAME = "texlive-pdf14-2026.226.0.0.1svn76924-58.2.noarch.rpm"
RPM_HASH = "bf27b85af6406cc4a124b7862f9e813586aa2dc2f6db06f14dd2d800d62d76c7060a1df772e708b6ab9ae9e7e76c3053bb69e1ea4a1865dab9d32556e0229d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdf14.sty \
texlive-pdf14"

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
