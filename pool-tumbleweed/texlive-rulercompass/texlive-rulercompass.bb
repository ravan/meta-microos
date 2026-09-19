SUMMARY = "A TikZ library for straight-edge and compass diagrams"
DESCRIPTION = "The package defines some commands and styles to support drawing \
straight-edge and compass diagrams with TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn32392"

RPM_NAME = "texlive-rulercompass-2026.226.1svn32392-60.2.noarch.rpm"
RPM_HASH = "8c918cd346c7a6eec71b0b9621f326b455d0e09833583d431db8b9c07c6628401e09b7ebf7f1840ad354304ce5157af6476684ea4f826cdf28d1352bf428ed79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibraryrulercompass.code.tex \
texlive-rulercompass"

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
