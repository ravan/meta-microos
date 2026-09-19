SUMMARY = "Severed fonts for texlive-gfssolomos"
DESCRIPTION = "The  separated fonts package for texlive-gfssolomos"
LICENSE = "OFL-1.1"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-gfssolomos-fonts-2026.226.1.0svn77682-60.2.noarch.rpm"
RPM_HASH = "3f001fdf038f5977844fc24894a7104b84a9454151adba7a48bfe743ec6733862917025d830cd661e46f9a2ce5746cc39fe7b61bba36a298b36ddd497f8ccd11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-gfssolomos-fonts \
font--lang=el \
font-gfssolomos \
texlive-gfssolomos-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
