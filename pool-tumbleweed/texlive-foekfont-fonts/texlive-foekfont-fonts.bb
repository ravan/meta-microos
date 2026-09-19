SUMMARY = "Severed fonts for texlive-foekfont"
DESCRIPTION = "The  separated fonts package for texlive-foekfont"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-foekfont-fonts-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "1be9cccc58bc037ae0b7c2d289fd9e1d9328289496a159b8012541068340f24a91a8bbbe6a95257af4c1e14d964775cc4f077f8469d914e190cdfb5420cd620c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-foekfont \
texlive-foekfont-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
