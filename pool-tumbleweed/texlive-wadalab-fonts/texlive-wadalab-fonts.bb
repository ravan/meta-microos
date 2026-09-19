SUMMARY = "Severed fonts for texlive-wadalab"
DESCRIPTION = "The  separated fonts package for texlive-wadalab"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn42428"

RPM_NAME = "texlive-wadalab-fonts-2026.226.svn42428-60.2.noarch.rpm"
RPM_HASH = "526d6a660ffa934e03d816fd5ca66741632870967965dcbbf0ad2250b443c54f8e71a9a7d0889dccb4f116d2932543fe13f15d819b244e27b7978eb1ea0219d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=bg \
font--lang=kum \
font--lang=mhr \
font--lang=os \
font--lang=ru \
font--lang=sel \
font-dg \
font-dgjhw \
font-dm \
font-mc \
font-mc2 \
font-mr \
font-mr2 \
texlive-wadalab-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
