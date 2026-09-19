SUMMARY = "Thumb marks in documents"
DESCRIPTION = "Place thumb marks in books, manuals and reference maunals."
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.1.0svn16549"

RPM_NAME = "texlive-thumb-2026.227.1.0svn16549-62.2.noarch.rpm"
RPM_HASH = "a990774220d560c51ce395befa9cf5255ce818f9348d5ea2577133f441718b3a39002c6d30f5753e33778efca2043430f37d3712a6241f6d8091e13a64ae4653"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thumb.sty \
texlive-thumb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-minitoc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
