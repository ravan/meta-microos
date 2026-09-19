SUMMARY = "Add reference labels to easylist items"
DESCRIPTION = "This package provides the \\itemLabel macro for adding \
configurable reference labels to easylist items."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn51124"

RPM_NAME = "texlive-labels4easylist-2026.226.1.0svn51124-63.2.noarch.rpm"
RPM_HASH = "c98a43b75c23a8682b134dd081da973c1a9ba5630c995ea8d2c3847a5ef00b885cd4cee20c4c460ee051e69753acd70d841fbcb22bcc692fc491077cdcbf3193"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-labels4easylist.sty \
texlive-labels4easylist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-easylist.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
