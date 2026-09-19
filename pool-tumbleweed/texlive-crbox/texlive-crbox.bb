SUMMARY = "Boxes with crossed corners"
DESCRIPTION = "The package implements a \\crbox command which produces boxes \
with crossing lines at the corners."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn29803"

RPM_NAME = "texlive-crbox-2026.226.0.0.1svn29803-61.2.noarch.rpm"
RPM_HASH = "dd946f116b74ff4a35c5e9027e2d32bf636c1d02c27629b49410d65fbfa93aae123298cf1ec1a7e7b6867be9023f17b4d231d51a59e3798c66c408bff3c238b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crbox.sty \
texlive-crbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
