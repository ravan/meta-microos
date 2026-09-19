SUMMARY = "Open-source Russian GOST Fonts (TrueType Format)"
DESCRIPTION = "Open-source version of the fonts by Russian standard GOST 2.304-81 \
«Letters for drawings». \
 \
This package contains fonts in TrueType format."
LICENSE = "OFL-1.1"

PV = "0.3"

RPM_NAME = "opengost-ttf-fonts-0.3-7.26.noarch.rpm"
RPM_HASH = "291f8b75c52a9a18f3dddac4848d01232e879cb358fba65addf6674a88b17097d03d3944e1717232b9301894e3ede5b83ea90054381f679cd0179eaea33e49ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opengost-ttf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
