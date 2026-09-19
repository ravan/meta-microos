SUMMARY = "Per-page numbering of footnotes"
DESCRIPTION = "Allows footnotes on individual pages to be numbered from 1, \
rather than being numbered sequentially through the document."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-footnpag-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "adcbb4b41ec8b3c043d6987668d81a8dea14b69b6aca7f86c6aed311dbc9fd864c16f145f9af45e437eb6d143cbe06c79265c8eaa17e48ffff3619e99716dbd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-footnpag.sty \
texlive-footnpag"

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
