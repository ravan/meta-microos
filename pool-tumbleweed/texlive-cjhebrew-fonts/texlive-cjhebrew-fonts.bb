SUMMARY = "Severed fonts for texlive-cjhebrew"
DESCRIPTION = "The  separated fonts package for texlive-cjhebrew"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2asvn43444"

RPM_NAME = "texlive-cjhebrew-fonts-2026.226.0.0.2asvn43444-60.2.noarch.rpm"
RPM_HASH = "1cdec8babfb6507c9a4dbf31f8b09f0ece99c837c5f9bdb0474f331af3af0207b65b45d8fc645935a74793491883f8057c121062deb21431154a6f1d875cdb49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-cjheblsm \
font-cjhebltx \
texlive-cjhebrew-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
