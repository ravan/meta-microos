SUMMARY = "Support for Japanese holidays"
DESCRIPTION = "This LaTeX package provides a command to convert dates to names \
of Japanese holidays. Another command, converting dates to the \
day of the week in Japanese, is available as a free gift. \
Further (lower-level) APIs are provided for expl3. The package \
supports pdfTeX, XeTeX, LuaTeX, pTeX, and upTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn76924"

RPM_NAME = "texlive-bxjaholiday-2026.226.1.1.1svn76924-59.2.noarch.rpm"
RPM_HASH = "1ace9b938c5e99d33ac8df984c20a000c695ddfb98a7370a3b626f98bcfc5dad480a83d888d0b84a9b40ade698b5a4bf0636fe39c8412e994d416d5e3a6489ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxjaholiday.sty \
texlive-bxjaholiday"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
