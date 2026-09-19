SUMMARY = "Severed fonts for texlive-gfscomplutum"
DESCRIPTION = "The  separated fonts package for texlive-gfscomplutum"
LICENSE = "OFL-1.1"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-gfscomplutum-fonts-2026.226.1.0svn77682-60.2.noarch.rpm"
RPM_HASH = "db769cd31b8e4513bca54ba32167ee26e6aa624c47d92c4ebfc152714f40e010943659e4e507805404715b653e7af9a7a49355fafe6a560476a2544b73def53e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-gfscomplutum-fonts \
font--lang=el \
font-gfscomplutum \
texlive-gfscomplutum-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
