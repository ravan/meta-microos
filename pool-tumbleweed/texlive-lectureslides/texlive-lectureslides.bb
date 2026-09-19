SUMMARY = "Combine single PDF files into one file"
DESCRIPTION = "This package makes it easy to combine and index individual PDF \
files into one large PDF file."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn62292"

RPM_NAME = "texlive-lectureslides-2026.226.1.0svn62292-61.2.noarch.rpm"
RPM_HASH = "6a7a21b2c4dc91b45ffc85bce131811b7fe39137263b2136a56452c471e4effb64fe61ca9237d09ecb8e2fdd1b71c1dccccee07b596580a2f6b6d86835e9062d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lectureslides.sty \
texlive-lectureslides"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
