SUMMARY = "Severed fonts for texlive-phaistos"
DESCRIPTION = "The  separated fonts package for texlive-phaistos"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn18651"

RPM_NAME = "texlive-phaistos-fonts-2026.226.1.0svn18651-58.2.noarch.rpm"
RPM_HASH = "a7b9dfdeb680fe289995996d961c8ec4b49570e0e41e8bfd562ca48007d6be198f09ae1bd7e784d8e3d7b9c95bac352d629ffda079ac87d18b3fddb6fb09d4fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-phaistos-fonts \
font-phaistos \
texlive-phaistos-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
