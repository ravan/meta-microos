SUMMARY = "Severed fonts for texlive-hamnosys"
DESCRIPTION = "The  separated fonts package for texlive-hamnosys"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.3svn61941"

RPM_NAME = "texlive-hamnosys-fonts-2026.226.1.0.3svn61941-60.4.noarch.rpm"
RPM_HASH = "8efc36129985862eb65217df155f533d2de8a016fe537692a47e0b8308f06084997d64f5c1cbb0d741b3fe10bba1ce99dc23ada897facc78ea3609ef52df5900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-hamnosysunicode \
texlive-hamnosys-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
