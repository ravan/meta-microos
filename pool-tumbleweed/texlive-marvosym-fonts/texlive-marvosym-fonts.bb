SUMMARY = "Severed fonts for texlive-marvosym"
DESCRIPTION = "The  separated fonts package for texlive-marvosym"
LICENSE = "OFL-1.1"

PV = "2026.226.2.2asvn77682"

RPM_NAME = "texlive-marvosym-fonts-2026.226.2.2asvn77682-59.2.noarch.rpm"
RPM_HASH = "16e96c713eac3ef3c2185b34d9d78cc1b460b7e9b5cb0c9f367b0509d7ec24880758368ad6fd6adca701588e1ed9c5da67e537d6dbf0048782584122f7905e1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-marvosym-fonts \
font-marvosym \
font-marvosymwithtexsupport \
texlive-marvosym-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
