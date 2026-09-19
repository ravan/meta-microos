SUMMARY = "Severed fonts for texlive-mdsymbol"
DESCRIPTION = "The  separated fonts package for texlive-mdsymbol"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.5svn77682"

RPM_NAME = "texlive-mdsymbol-fonts-2026.226.0.0.5svn77682-59.2.noarch.rpm"
RPM_HASH = "bd44a0b6e954e7c6214385c4974b9d3a98155d24deeaa8707629ca1064fd021fed33817106f5d18f908270773c075c1e6b610ce90c9ef5f0b0a51701225dcb1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-mdsymbol-fonts \
font-mdsymbol \
font-mdsymbola \
font-mdsymbolb \
font-mdsymbolc \
font-mdsymbold \
font-mdsymbole \
font-mdsymbolf \
texlive-mdsymbol-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
