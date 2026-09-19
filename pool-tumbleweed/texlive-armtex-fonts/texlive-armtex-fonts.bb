SUMMARY = "Severed fonts for texlive-armtex"
DESCRIPTION = "The  separated fonts package for texlive-armtex"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0_beta5svn69418"

RPM_NAME = "texlive-armtex-fonts-2026.226.3.0_beta5svn69418-61.2.noarch.rpm"
RPM_HASH = "03d299c666edfbb3774afc8e0842c0f27bc27c788e559a2f93670e184c7a2eaf0c24dc7bd7c5100c1f870ba2741f255b204f274a14235797957837286dd4b615"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-arss \
font-artm \
texlive-armtex-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
