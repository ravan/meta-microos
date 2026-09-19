SUMMARY = "Severed fonts for texlive-mathalpha"
DESCRIPTION = "The  separated fonts package for texlive-mathalpha"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.145svn77682"

RPM_NAME = "texlive-mathalpha-fonts-2026.226.1.145svn77682-59.2.noarch.rpm"
RPM_HASH = "e515c463e042911b5804e9497a570b1dbd547bdbacda6ab5379c8452b817b7b873b649cdb429536103f8a72fd561fc5d7ec4d73899b8cf5579902b6ac4993bb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-ncmbb \
font-newcmbb \
texlive-mathalpha-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
