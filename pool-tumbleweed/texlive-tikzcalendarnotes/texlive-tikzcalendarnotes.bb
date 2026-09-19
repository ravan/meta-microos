SUMMARY = "Highlighting, marking and annotating dates in a TikZ calendar"
DESCRIPTION = "This package offers a 'calendar arrangement' (atop of the TikZ \
calendar library) and provides a set of commands to highlight, \
mark, and annotate dates in a calendar."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77050"

RPM_NAME = "texlive-tikzcalendarnotes-2026.226.1.2svn77050-59.2.noarch.rpm"
RPM_HASH = "cd501b998ce7d958b4e76486674d5ecef89c49b0fd77dda5d410d85733cd529e580076b501c902b06770216a8b9be777221078f95fff0c573125ecf88b1dc69f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzcalendarnotes.sty \
texlive-tikzcalendarnotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pkginfograb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
