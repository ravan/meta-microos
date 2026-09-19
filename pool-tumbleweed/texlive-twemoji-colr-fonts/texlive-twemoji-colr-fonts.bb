SUMMARY = "Severed fonts for texlive-twemoji-colr"
DESCRIPTION = "The  separated fonts package for texlive-twemoji-colr"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7.0svn75301"

RPM_NAME = "texlive-twemoji-colr-fonts-2026.226.0.0.7.0svn75301-59.2.noarch.rpm"
RPM_HASH = "f61e51f0d27c9fe31d19a130506a308cc4462d04be97053021c44d228604b306bef0b785e3c8ef7e163cd069363192771f0b30902bc6d6cd0a17cd72045560ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=und-zsye \
font-twemojimozilla \
texlive-twemoji-colr-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
