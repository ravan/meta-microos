SUMMARY = "Generate alphabet soup puzzles"
DESCRIPTION = "Generate alphabet soup puzzles (aka word search puzzles), and \
variations using numbers or other symbols. Provides macros to \
generate an alphabet soup style puzzle (also known as word \
search puzzles or 'find-the-word' puzzles). Allow creating \
numbersoup and soups with custom symbol sets."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn50815"

RPM_NAME = "texlive-soup-2026.226.1.0.2svn50815-64.2.noarch.rpm"
RPM_HASH = "9c550ee3f11a7d0ee5fd04207f6a6a3ba02b3bab005bd791dc3932d011f3c97053f9ff834685a1362df891c2badad0278e8dfba2ce21570842b0970e55017477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-soup.sty \
texlive-soup"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
