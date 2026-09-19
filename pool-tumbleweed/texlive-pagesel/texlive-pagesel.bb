SUMMARY = "Select pages of a document for output"
DESCRIPTION = "Selects single pages, ranges of pages, odd pages or even pages \
for output."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn77682"

RPM_NAME = "texlive-pagesel-2026.226.1.10svn77682-58.2.noarch.rpm"
RPM_HASH = "7d7c36fbe6ce6b0dfc8f04c92c670adc28d46813e8f36a3ad355beb863d56ff38eb8ce79ee58902e0eba549d2d535d15c813c1334bf7280a940132708bafb662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pagesel-2016-05-16.sty \
tex-pagesel.sty \
texlive-pagesel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everyshi.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
