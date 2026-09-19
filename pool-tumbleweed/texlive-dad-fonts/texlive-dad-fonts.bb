SUMMARY = "Severed fonts for texlive-dad"
DESCRIPTION = "The  separated fonts package for texlive-dad"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn54191"

RPM_NAME = "texlive-dad-fonts-2026.226.1.2svn54191-61.2.noarch.rpm"
RPM_HASH = "6082ca434d0d315e5cc1801da1360a7e77bb7dd6ee3010f75622c464993670527aab4265ede0e7a2c214539aaedf785ad785f382fb37a5ee908867ba5d08fdad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=ar \
font-dad \
texlive-dad-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
