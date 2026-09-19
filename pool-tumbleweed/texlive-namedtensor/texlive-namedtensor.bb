SUMMARY = "Macros for named tensor notation"
DESCRIPTION = "This style file provides macros for named tensor notation. \
Please see the paper 'Named Tensor Notation' for background on \
this notation."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn65346"

RPM_NAME = "texlive-namedtensor-2026.226.0.0.4svn65346-61.2.noarch.rpm"
RPM_HASH = "72257e4182825dbdb928a4ac8cce7905cfaac3414d1efe27b128237716f4ab2033114f1c6c85b017fda54bdb3746973d6271e6a19b3bff8cdd12bc03323520a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-namedtensor.sty \
texlive-namedtensor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
