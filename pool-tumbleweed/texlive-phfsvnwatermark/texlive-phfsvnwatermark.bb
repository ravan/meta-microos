SUMMARY = "Watermarks with version control information from SVN"
DESCRIPTION = "This package allows you to add version control information as a \
gray watermark on each page of your document. The SVN info is \
read from keyword tags such as $Id$, $Date$, and $Author$ via \
the svn or svn-multi packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn41870"

RPM_NAME = "texlive-phfsvnwatermark-2026.226.1.0svn41870-58.2.noarch.rpm"
RPM_HASH = "5b9305d437f2986063a097f756fa840b8c8e0ef9b226ce37e7cf90b83d29e9c3901db07730c680c92852edb0da9b88965b66be7f02f3fcba690964e1b1ba7922"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phfsvnwatermark.sty \
texlive-phfsvnwatermark"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-currfile.sty \
tex-eso-pic.sty \
tex-kvoptions.sty \
tex-svn-multi.sty \
tex-svn.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
