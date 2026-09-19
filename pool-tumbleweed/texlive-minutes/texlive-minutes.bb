SUMMARY = "Typeset the minutes of meetings"
DESCRIPTION = "Supports the creation of a collection of minutes. Features \
include: Support of tasks (who, schedule, what, time of \
finishing; possibility of creating a list of open tasks; \
inclusion of open tasks from other minutes; Support for \
attachments; Support of schedule dates (in planning: support \
for the calendar package); Different versions ('secret parts'); \
and Macros for votes and decisions (list of decisions). Support \
for minutes in German, Dutch and English is provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8fsvn42186"

RPM_NAME = "texlive-minutes-2026.226.1.8fsvn42186-61.2.noarch.rpm"
RPM_HASH = "2f96b79abeb71f1019e339987d85ea7b2632e129591c663fe1723dba3726497c9c73a82e828b5cfc16e9f9bc98576886d3846774c8867143e6541f5d661142cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minutes.sty \
texlive-minutes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-minitoc.sty \
tex-multicol.sty \
tex-url.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
