SUMMARY = "Severed fonts for texlive-metsymb"
DESCRIPTION = "The  separated fonts package for texlive-metsymb"
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.2.0svn68175"

RPM_NAME = "texlive-metsymb-fonts-2026.226.1.2.0svn68175-61.2.noarch.rpm"
RPM_HASH = "4656331c4d4869f0de941202a29b1137104dd1a473dccb174e71ab98b3b1c1567b3dae3f59f5900f15b1d02e1d83f751f994fc6bb1d291666a67ce7142f517c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-metsymb-fonts \
font-metsymb \
texlive-metsymb-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
