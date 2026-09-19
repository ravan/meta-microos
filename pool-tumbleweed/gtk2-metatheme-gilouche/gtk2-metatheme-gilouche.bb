SUMMARY = "openSUSE themes and metathemes for gtk2, Xfwm4 and metacity"
DESCRIPTION = "OpenSUSE themes and metathemes for gtk2, Xfwm4 and metacity contains several \
themes in openSUSE look: Gilouche, GreyGilouche and Synchonicity."
LICENSE = "GPL-2.0-or-later"

PV = "11.1.2"

RPM_NAME = "gtk2-metatheme-gilouche-11.1.2-27.19.noarch.rpm"
RPM_HASH = "4e767b148dc7430e35e71513fdb821c441d793688850ecdbbefdcf8502ca6bd2b1e02e5b448eadb62895f3607f4fd599337acb47e5b481f8e033f7a635da4dfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-gilouche \
gtk2-theme-SLED \
gtk2-theme-openSUSE \
metacity-theme-SLED \
metacity-theme-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2 \
gtk2-engine-clearlooks \
tango-icon-theme"

inherit rpm
