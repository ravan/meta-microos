SUMMARY = "Shadow boxes"
DESCRIPTION = "Defines a command \\shabox (analgous to \\fbox), and supporting \
mechanisms."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-shadow-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "5e54a22a3d64c207aa719e39cb03fe582a89ec71375d81c62b1910b18d108e209ee1a99d864181c3a652eafa2801d4ec6a4f23535225e293f5e99b72c7769998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-shadow.sty \
texlive-shadow"

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
