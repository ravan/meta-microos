SUMMARY = "Mongolian hyphenation patterns in T2A encoding"
DESCRIPTION = "Serves Mongolian written using Cyrillic letters, using \
T2A-encoded output. (Note that the montex bundle provides \
hyphenation patterns for its own encoding setup.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn69727"

RPM_NAME = "texlive-mnhyphn-2026.226.1.4svn69727-61.2.noarch.rpm"
RPM_HASH = "3e63bf9b500e6c058fb36263197a6a60a237855229dac2b2eb7f04754f366d5fb261c508c9df9509694553525c91d3eda021e9fa75b8d876a9c9b61ad9028503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mnhyphn.tex \
texlive-mnhyphn"

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
