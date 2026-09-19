SUMMARY = "Severed fonts for texlive-academicons"
DESCRIPTION = "The  separated fonts package for texlive-academicons"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9.6_2svn77682"

RPM_NAME = "texlive-academicons-fonts-2026.226.1.9.6_2svn77682-61.2.noarch.rpm"
RPM_HASH = "29b5e771d288f5e1f4c65e92e6487fbcf388ae74ea7c84244f8debdbaf93a0e242d79c8e69be8c69eb814efee085a75fffb125eb9f32e29c022f855c898b1284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-academicons-fonts \
font-academicons \
texlive-academicons-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
