SUMMARY = "Typeset Begriffschrift"
DESCRIPTION = "The package defines maths mode commands for typesetting Frege's \
Begriffschrift."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.6svn15878"

RPM_NAME = "texlive-begriff-2026.226.1.6svn15878-61.2.noarch.rpm"
RPM_HASH = "6976bde65d9a0ce28ed8cf3e4e77b8a860637854d750d456d87795ca51a8846a9488d45d3c7511010a6228a130d334f998a3482170e6711fa687ed7268b84591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-begriff.sty \
texlive-begriff"

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
