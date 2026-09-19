SUMMARY = "Italian Translation of Obsolete packages and commands"
DESCRIPTION = "Italian translation of the l2tabu practical guide to LaTeX2e (a \
list of obsolete packages and commands)."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn25218"

RPM_NAME = "texlive-l2tabu-italian-2026.226.2.3svn25218-63.2.noarch.rpm"
RPM_HASH = "d0ea3f96fd507b41cb6ec8393de1f3bca58c1c3104f7d1eb043caa7d5aebf449e0a66ba3e581b081d0c1bb945a7b054d2eeeac41774b01f268021d1aeab95f4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l2tabu-italian"

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
