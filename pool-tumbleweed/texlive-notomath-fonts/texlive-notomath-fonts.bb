SUMMARY = "Severed fonts for texlive-notomath"
DESCRIPTION = "The  separated fonts package for texlive-notomath"
LICENSE = "OFL-1.1"

PV = "2026.226.1.031svn77682"

RPM_NAME = "texlive-notomath-fonts-2026.226.1.031svn77682-61.2.noarch.rpm"
RPM_HASH = "e1cc5caa82fb2bcbb8596b9efd4bbab12f0764ed3413b319fa6759e16c39510b415c059f7b9a06d689c7c3522502f85c493d2c082d85f556908abd22561a88b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-notomath \
font-notosansmath \
texlive-notomath-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
