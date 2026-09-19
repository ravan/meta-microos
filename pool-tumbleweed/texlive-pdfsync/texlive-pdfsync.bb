SUMMARY = "Provide links between source and PDF"
DESCRIPTION = "The package runs with pdfTeX or XeTeX, and creates an auxiliary \
file with geometrical information to permit references back and \
forth between source and PDF, assuming a conforming editor and \
PDF viewer."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn20373"

RPM_NAME = "texlive-pdfsync-2026.226.svn20373-58.2.noarch.rpm"
RPM_HASH = "bf836ab4aba95171e904f74b74d02ff8977d5fe858720b3c93761b8f8f12ea877a359c851332c4e74aa06fbe091b242b95c47ceb26914244ef5ccbe6ae4385ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfsync.sty \
texlive-pdfsync"

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
