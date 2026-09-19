SUMMARY = "Severed fonts for texlive-mnsymbol"
DESCRIPTION = "The  separated fonts package for texlive-mnsymbol"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.4svn18651"

RPM_NAME = "texlive-mnsymbol-fonts-2026.226.1.4svn18651-61.2.noarch.rpm"
RPM_HASH = "8efa38032f1c64b0a49cf17f8c567a3b66ce8b854bbcdaa6c81d17d4225b69e5e43bc78af18d536b6bae823f095fead982c0af9467f655488939bb4d682d3de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-mnsymbol-fonts \
font-mnsymbol \
texlive-mnsymbol-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
