SUMMARY = "Severed fonts for texlive-sanskrit-t1"
DESCRIPTION = "The  separated fonts package for texlive-sanskrit-t1"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn55475"

RPM_NAME = "texlive-sanskrit-t1-fonts-2026.226.svn55475-60.2.noarch.rpm"
RPM_HASH = "02a223fffb325bcfa375d12e8ef8440c86e06ae55df3c31e15176d2ba41e2c91ee479029f21c45e2d550bed24d865078870f194bcb999c79bd50d9ca66f46e25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-wiknersanskrit \
texlive-sanskrit-t1-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
