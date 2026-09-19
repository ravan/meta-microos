SUMMARY = "Helper package to download Microsoft Core fonts for the Web"
DESCRIPTION = "This package contains a helper script that downloads and installs \
a number of TrueType fonts collectively known as corefonts, or the \
Core fonts for the Web. Originally made available my Micosoft under \
a non-free End-user licence agreement (EULA), they continue to be \
distributed subject to the same licence terms. The user is shown \
a copy of the licence text upon execution. \
 \
The Core fonts for the Web include: Arial, Arial Black, Andale Mono, \
Monotype, Courier New, Comic Sans MS, Georgia, Impact, Times New \
Roman, Trebuchet MS, Verdana, Webdings."
LICENSE = "GPL-2.0-or-later"

PV = "12.0"

RPM_NAME = "fetchmsttfonts-12.0-1.16.noarch.rpm"
RPM_HASH = "b3a66509b2926869dc499141362b18ccde45ec83732748179d83ae3c4b286d4a12b7aa13221e525b8c3df323d7b9d8440c13537eba1b0953d70f2f55cc64f4cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fetchmsttfonts"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/fonts-config \
cabextract \
coreutils \
curl \
fonts-config \
mktemp \
w3m"

inherit rpm
