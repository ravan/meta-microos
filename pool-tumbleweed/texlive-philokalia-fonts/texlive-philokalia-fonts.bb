SUMMARY = "Severed fonts for texlive-philokalia"
DESCRIPTION = "The  separated fonts package for texlive-philokalia"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn45356"

RPM_NAME = "texlive-philokalia-fonts-2026.226.1.2svn45356-58.2.noarch.rpm"
RPM_HASH = "3c6a363b7a822149d12e2c2d1f902eb683fe5e203e472584816e6db0eb416947acd0bf80dfff1ff599d1c8a05bb58bb04ea7541320966370c5564e81b36a7ba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=el \
font-philokalia \
texlive-philokalia-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
