SUMMARY = "Identify (typographic) widows and orphans"
DESCRIPTION = "This package identifies all widows and orphans in a document to \
help a user to get rid of them. The act of resolving still \
needs to be done manually: By rewriting text, running some \
paragraph long or short or explicitly breaking in some \
strategic place. It will also identify and warn about words \
broken across columns or pages and display formulas separated \
from their introductory paragraph."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0fsvn77682"

RPM_NAME = "texlive-widows-and-orphans-2026.226.1.0fsvn77682-60.2.noarch.rpm"
RPM_HASH = "6dde08ec3caee7e96ec5c95bc5ef4a4735b4c9351ac98aa497b77b350da5939106562a9944256289decc235b6b59d755c969fc1c39d87cce68c6db3f6f71b199"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-widows-and-orphans.sty \
texlive-widows-and-orphans"

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
