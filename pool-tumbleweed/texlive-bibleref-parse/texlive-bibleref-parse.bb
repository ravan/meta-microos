SUMMARY = "Specify Bible passages in human-readable format"
DESCRIPTION = "The package parses Bible passages that are given in human \
readable format. It accepts a wide variety of formats. This \
allows for a simpler and more convenient interface to the \
functionality of the bibleref package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn22054"

RPM_NAME = "texlive-bibleref-parse-2026.226.1.1svn22054-61.2.noarch.rpm"
RPM_HASH = "6506d882aa74c49743c83233a94ab7d0b7abf1db9e401a81988da8501ed1336d39eabfa40fe939ff3af91e1885ba9196f08a2a15d88f23580421daf58d5f4c78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibleref-parse.sty \
texlive-bibleref-parse"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bibleref.sty \
tex-etoolbox.sty \
tex-scrlfile.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
