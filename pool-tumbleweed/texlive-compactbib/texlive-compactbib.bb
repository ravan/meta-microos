SUMMARY = "Multiple thebibliography environments"
DESCRIPTION = "Allows a second bibliography, optionally with a different \
title, after the main bibliography."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-compactbib-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "ac5a8260a4dd92bcda933b4f0addd52371e55e6b5cb58e448367be5aa5e090bc63d446ebc4ae56b921face93e9792de1a5735e3ab7ed9bc73bdec5c72ae0dbf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-compactbib.sty \
texlive-compactbib"

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
