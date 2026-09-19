SUMMARY = "Severed fonts for texlive-yinit-otf"
DESCRIPTION = "The  separated fonts package for texlive-yinit-otf"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn40207"

RPM_NAME = "texlive-yinit-otf-fonts-2026.226.1.0svn40207-59.4.noarch.rpm"
RPM_HASH = "83fbd553f460cff51c2da16432170cb2fe2f69d59cea3e7a85ccdce7276914b5de7645ca662e6d6af86baca983e8630df388659bc7571c5ea41c33703ca7f091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-yinit \
texlive-yinit-otf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
