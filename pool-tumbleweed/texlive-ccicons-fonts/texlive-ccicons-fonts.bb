SUMMARY = "Severed fonts for texlive-ccicons"
DESCRIPTION = "The  separated fonts package for texlive-ccicons"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-ccicons-fonts-2026.226.1.6svn77682-59.2.noarch.rpm"
RPM_HASH = "414d4f80a01b8bb0ab9f56d83de4766337eca881925480453658355b866135848d03c0844be43c64286d24820161bfc812d591b66695b4a11c1344dfde91488a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-ccicons-fonts \
font-ccicons \
texlive-ccicons-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
