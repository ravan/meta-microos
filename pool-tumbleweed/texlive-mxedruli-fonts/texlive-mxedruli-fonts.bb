SUMMARY = "Severed fonts for texlive-mxedruli"
DESCRIPTION = "The  separated fonts package for texlive-mxedruli"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.3csvn71991"

RPM_NAME = "texlive-mxedruli-fonts-2026.226.3.3csvn71991-61.2.noarch.rpm"
RPM_HASH = "04d6094babc70705449ce471fabca7bdbdb1b0ece6b9169000717ba00e57c7449f2c07f3da6224cbe2e9f2c5823310a95dec434cc99c795b2d9ebf48bc252ede"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-mxed10 \
font-mxedbf10 \
font-mxedc10 \
font-mxedi10 \
font-xuc10 \
texlive-mxedruli-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
