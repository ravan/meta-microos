SUMMARY = "Severed fonts for texlive-ascmac"
DESCRIPTION = "The  separated fonts package for texlive-ascmac"
LICENSE = "BSD-3-Clause"

PV = "2026.226.2.1svn53411"

RPM_NAME = "texlive-ascmac-fonts-2026.226.2.1svn53411-60.2.noarch.rpm"
RPM_HASH = "52cdce92357592e33401a9be02880e690feca2056de071718373008cfa52dd251de8fad02c8061c866e615ad16d75a3d05f3087244011d7b62dee6b0665e35fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-tex\040ascgrp \
font-tex\040ascii10 \
font-tex\040ascii36 \
texlive-ascmac-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
