SUMMARY = "Severed fonts for texlive-doublestroke"
DESCRIPTION = "The  separated fonts package for texlive-doublestroke"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.111svn77682"

RPM_NAME = "texlive-doublestroke-fonts-2026.226.1.111svn77682-59.2.noarch.rpm"
RPM_HASH = "abd0a0b8ae8c12184f7d495eaa71ed0c95f22caf4f8df99a183806070411989ea1928f822c936a9a5e65eedb54a57f8ffba7aa05e4b8eeae40b87d0d6c494839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-dsrom10 \
font-dsrom12 \
font-dsrom8 \
font-dsss10 \
font-dsss12 \
font-dsss8 \
texlive-doublestroke-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
