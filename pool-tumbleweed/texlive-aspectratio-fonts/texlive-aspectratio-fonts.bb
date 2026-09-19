SUMMARY = "Severed fonts for texlive-aspectratio"
DESCRIPTION = "The  separated fonts package for texlive-aspectratio"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn25243"

RPM_NAME = "texlive-aspectratio-fonts-2026.226.2.0svn25243-60.2.noarch.rpm"
RPM_HASH = "7600a6598021015fbe26edd452da4da9bc587523baaf9354df53008447ba8bf75329faf5c0e88ef0749bcfb41c56ef1636b74e97f97ce7201dafb3307a87126e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-amar \
font-ar10 \
font-ar12 \
font-ar5 \
font-ar6 \
font-ar7 \
font-ar8 \
font-ar9 \
font-arb10 \
font-arb12 \
font-arb5 \
font-arb6 \
font-arb7 \
font-arb8 \
font-arb9 \
font-arssbi10 \
font-arssi10 \
font-artti10 \
texlive-aspectratio-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
