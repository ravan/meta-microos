SUMMARY = "Severed fonts for texlive-pigpen"
DESCRIPTION = "The  separated fonts package for texlive-pigpen"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-pigpen-fonts-2026.226.0.0.3svn77682-58.2.noarch.rpm"
RPM_HASH = "f289487ce40bc0f1a3dfaa57acd8048e2d93e8c5fc8c34329c492088f33c5888fc4f98635bfeebb2b97b790bac8a6ee75dc5756ca8a5cc5ae33d7f754a6f232a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-pigpen \
texlive-pigpen-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
