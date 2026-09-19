SUMMARY = "Add reference-page-list to bibliography-items"
DESCRIPTION = "The package does its job without using the indexing facilities, \
and needs no special \\cite-replacement package."
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.1svn47407"

RPM_NAME = "texlive-citeref-2026.226.1.1svn47407-60.2.noarch.rpm"
RPM_HASH = "e79d07b2e9128493412c400dbf063fd8b51f241a6214eaaa7be3b11ae376b394cd30b487e3f0db6b9e8a4fa315d1951f02340fe16d1bd2e22432794104bba644"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-citeref.sty \
texlive-citeref"

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
