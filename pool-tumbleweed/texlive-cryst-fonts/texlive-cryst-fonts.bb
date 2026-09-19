SUMMARY = "Severed fonts for texlive-cryst"
DESCRIPTION = "The  separated fonts package for texlive-cryst"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-cryst-fonts-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "fff416f3845e3956d4f348e8da67546760b5284392bda4e930c04c5ff508303b27fb4420df6ed353224933902884c76565d252f400c5fba8f69ee024b9161b35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-cryst1 \
texlive-cryst-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
