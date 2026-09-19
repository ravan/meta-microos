SUMMARY = "Severed fonts for texlive-skaknew"
DESCRIPTION = "The  separated fonts package for texlive-skaknew"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-skaknew-fonts-2026.226.svn78101-64.2.noarch.rpm"
RPM_HASH = "c366e576f82016fda6834dd0be13a1d86294a8ac6559d1dd181860e0578a195200df276ebb74b3b27abf4bd9f656df8c29d18a9afe16912a6940e4237a906824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-skaknew-fonts \
font-chessalphadiagram \
font-skaknew-diagram \
font-skaknew-diagramt \
font-skaknew-figurine \
font-skaknewfigurine \
texlive-skaknew-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
