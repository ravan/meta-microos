SUMMARY = "Severed fonts for texlive-fdsymbol"
DESCRIPTION = "The  separated fonts package for texlive-fdsymbol"
LICENSE = "OFL-1.1"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-fdsymbol-fonts-2026.226.1.0svn77682-59.2.noarch.rpm"
RPM_HASH = "adc2777d2673175367c522efe6ff75572a5aacaf58c966a5dd21ef608fdfc14b4afed7ae8097e2e7c00b5128f9db901f95f0d0c4ad1799a141e70d8ed46d37a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-fdsymbol-fonts \
font-fdsymbol \
font-fdsymbola \
font-fdsymbolb \
font-fdsymbolc \
font-fdsymbold \
font-fdsymbole \
font-fdsymbolf \
texlive-fdsymbol-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
