SUMMARY = "Severed fonts for texlive-cmll"
DESCRIPTION = "The  separated fonts package for texlive-cmll"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-cmll-fonts-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "69c5750e1cb091dbc866d7c51321e55b5d2098034cfe37eff3f7ac72abcd349111894fb053cf4789cbae3876d71092071f1c84406dadfea7caf99132b8c1adc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-cmll \
font-cmllsans \
font-eull \
texlive-cmll-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
