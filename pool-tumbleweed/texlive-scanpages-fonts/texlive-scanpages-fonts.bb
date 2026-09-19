SUMMARY = "Severed fonts for texlive-scanpages"
DESCRIPTION = "The  separated fonts package for texlive-scanpages"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.05asvn42633"

RPM_NAME = "texlive-scanpages-fonts-2026.226.1.05asvn42633-60.2.noarch.rpm"
RPM_HASH = "df9aa4e1bf4ae1d2f0d6fa6aa59d8733a6a756b7df038799c3dd8128f2e42ccacbf16975b438fd200205858adda53d342e3814d62240b0c6eb30e9513616d09b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-scanwipe \
texlive-scanpages-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
