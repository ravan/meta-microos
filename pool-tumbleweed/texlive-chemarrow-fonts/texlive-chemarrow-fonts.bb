SUMMARY = "Severed fonts for texlive-chemarrow"
DESCRIPTION = "The  separated fonts package for texlive-chemarrow"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.9svn17146"

RPM_NAME = "texlive-chemarrow-fonts-2026.226.0.0.9svn17146-60.2.noarch.rpm"
RPM_HASH = "3ccd6fdf8881f2d57998ba1eb0455efa7f029c50be1eb0d141f9c6c876b9adfff378baa92fbdc44cf0b7271eb3f9e35228dc50f589b0ca877032b9a9eab9f62e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-arrow \
texlive-chemarrow-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
