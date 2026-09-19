SUMMARY = "Severed fonts for texlive-mpchess"
DESCRIPTION = "The  separated fonts package for texlive-mpchess"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn78101"

RPM_NAME = "texlive-mpchess-fonts-2026.226.0.0.9svn78101-61.2.noarch.rpm"
RPM_HASH = "15024afcfd3f31d0c0b0f8cb04beeb28ebd7893182f293e933dbd92ecc2866fba48629da90a07c6dd82281d6f95405df0ed1b0c3024aff62173bd9dc8ad54d9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-mpchessfont \
texlive-mpchess-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
