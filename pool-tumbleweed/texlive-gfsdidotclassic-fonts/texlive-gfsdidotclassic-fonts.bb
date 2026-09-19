SUMMARY = "Severed fonts for texlive-gfsdidotclassic"
DESCRIPTION = "The  separated fonts package for texlive-gfsdidotclassic"
LICENSE = "OFL-1.1"

PV = "2026.226.001.001svn52778"

RPM_NAME = "texlive-gfsdidotclassic-fonts-2026.226.001.001svn52778-60.2.noarch.rpm"
RPM_HASH = "f159bd5fc0206534469321042000e63c28bfb9bcdca8312f0627ca860e5e6f0ebae07c7f0c322eed20eb3bfadff941f2396512a63a7be820737789f00a4dcad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=el \
font-gfsdidotclassic \
texlive-gfsdidotclassic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
