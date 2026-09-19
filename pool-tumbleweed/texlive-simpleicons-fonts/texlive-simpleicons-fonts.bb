SUMMARY = "Severed fonts for texlive-simpleicons"
DESCRIPTION = "The  separated fonts package for texlive-simpleicons"
LICENSE = "LPPL-1.0"

PV = "2026.226.16.9.0svn78009"

RPM_NAME = "texlive-simpleicons-fonts-2026.226.16.9.0svn78009-60.2.noarch.rpm"
RPM_HASH = "28e5efdab97305f8fcc25796aa99681f0f390e2382c7769f132513b60d74468ad3aa2afcc6872a60e6f5dea53f64509e75b8fe0fe1fce6b0b920fb8109da2e8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-simpleicons-fonts \
font-simpleicons \
texlive-simpleicons-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
