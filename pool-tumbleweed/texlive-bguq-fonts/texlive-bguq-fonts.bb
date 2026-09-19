SUMMARY = "Severed fonts for texlive-bguq"
DESCRIPTION = "The  separated fonts package for texlive-bguq"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn27401"

RPM_NAME = "texlive-bguq-fonts-2026.226.0.0.4svn27401-61.2.noarch.rpm"
RPM_HASH = "65e892c5e79ce0dc15081da2df5d662518a842e4af14e78acd77c9c3bb00be91fbcef4be75fb6e992ce305cade83693f6cf4f98fb0678118bbbb282e77e67966"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-bguq10t04 \
font-bguq10t05 \
font-bguq10t06 \
font-bguq10t07 \
font-bguq10t08 \
font-bguq10t09 \
font-bguq10t10 \
font-bguq10t11 \
font-bguq10t12 \
texlive-bguq-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
