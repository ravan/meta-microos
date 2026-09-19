SUMMARY = "Processing an environment's body"
DESCRIPTION = "The package offers tools for collecting and executing an \
environment's body."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn29331"

RPM_NAME = "texlive-newenviron-2026.226.1.0svn29331-61.2.noarch.rpm"
RPM_HASH = "d20afb14f57b1dff7a19c39204a5410733e0430b7dc451f17a80651992c74a5fe39c9d4cd314359348bdbed8991be67d3d35e92f1385b369aac3b9558df4ccd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newenviron.sty \
texlive-newenviron"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
