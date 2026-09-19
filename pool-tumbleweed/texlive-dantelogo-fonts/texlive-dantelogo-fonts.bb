SUMMARY = "Severed fonts for texlive-dantelogo"
DESCRIPTION = "The  separated fonts package for texlive-dantelogo"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn38599"

RPM_NAME = "texlive-dantelogo-fonts-2026.226.0.0.03svn38599-61.2.noarch.rpm"
RPM_HASH = "84483cd5e1ce86f01c7d8f7475217d51dd3154ba99e5feee156cf72bb4bfbfaccbe3678ef4636115572d517f80f415bb8559385505402897203a7734d482f193"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-dantelogo-fonts \
font-dante \
texlive-dantelogo-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
