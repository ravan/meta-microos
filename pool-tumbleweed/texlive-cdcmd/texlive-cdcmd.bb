SUMMARY = "Expandable conditional commands for LaTeX"
DESCRIPTION = "This package provides some conditional commands, just like the \
styledcmd package. The difference is that cdcmd can define \
expandable conditional commands."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76924"

RPM_NAME = "texlive-cdcmd-2026.226.1.0svn76924-59.2.noarch.rpm"
RPM_HASH = "2cfc9944d18a1b9361911cdb56c8fbbf07c5b3180d43a7abf76efe3fd946d68294e536233b9576e7303f42f73a0f3422a0812faa8ac9effc522616482ab0c1e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cdcmd.sty \
texlive-cdcmd"

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
