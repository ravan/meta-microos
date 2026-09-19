SUMMARY = "Print a class calendar"
DESCRIPTION = "This package is intended to print a term calendar for use in \
planning a class. It has a flexible mechanism for specifying \
which days of the week are to be included and for inserting \
text either regularly on the same day each week, or on selected \
days, or for a series of consecutive days. It also has a \
flexible mechanism for specifying class and nonclass days. Text \
may be inserted into consecutive days so that it automatically \
flows around nonclass days."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.8svn76924"

RPM_NAME = "texlive-termcal-2026.227.1.8svn76924-62.2.noarch.rpm"
RPM_HASH = "073bc1c763ae186fbf30f840665b6c11f334ff16daa68860eab54a3df6541f2f6c0cae91ea20fdd62cfa3052f671884b2b58cafe8aa8259a27965a3544067237"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-termcal.sty \
texlive-termcal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
