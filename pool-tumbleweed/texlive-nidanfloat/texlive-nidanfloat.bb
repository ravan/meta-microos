SUMMARY = "Bottom placement option for double float in two column mode (nidan-kumi)"
DESCRIPTION = "This package enables a bottom placement option for double \
floats in two column mode (nidan-kumi). It was originally part \
of the Japanese pLaTeX bundle and is now distributed as a \
separate package because it supports all LaTeX formats."
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-nidanfloat-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "d667ff550fd05acc06774e2d32b1df2db2af84f206ffbcf433016d09bbaddaf93c199fdc170fe5ccc7143175a76ae86d1d0f0dbdadf4a2722ac58eb5f59ffecf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nidanfloat.sty \
texlive-nidanfloat"

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
