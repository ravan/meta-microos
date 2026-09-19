SUMMARY = "A way to work around problems in WINE"
DESCRIPTION = "Winetricks is a way to work around problems in Wine. \
 \
It has a menu of supported games/apps for which it can do all the \
workarounds automatically. It also allows the installation of missing \
DLLs and tweaking of various WINE settings."
LICENSE = "LGPL-2.1-or-later"

PV = "20260125"

RPM_NAME = "winetricks-20260125-1.5.noarch.rpm"
RPM_HASH = "a39066ff7b0c2a92244b0f85638864bdb1da7a10ac6f506a8a65b2ccc8ba9b7f1e4e6ea4ec8f61d1bcd92f0dd0c346007db2c71a04ab1d154a328a0a18b93e1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "winetricks"

RDEPENDS:${PN} += "/usr/bin/sh \
cabextract \
unzip \
wine"

inherit rpm
