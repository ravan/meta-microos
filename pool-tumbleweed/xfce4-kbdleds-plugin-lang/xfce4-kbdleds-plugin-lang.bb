SUMMARY = "Translations for package xfce4-kbdleds-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-kbdleds-plugin' package."
LICENSE = "GPL-2.0-only"

PV = "0.3.0"

RPM_NAME = "xfce4-kbdleds-plugin-lang-0.3.0-1.9.noarch.rpm"
RPM_HASH = "ea0e847c2cf731541c0f4f6cc197cf4fbce2ee78e9e7bd80b4b42c43bf5f34a31eab4b85fb699f3724eba31437d37e8c148f33a307181952f9861e4a696c31dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-kbdleds-plugin-ru \
locale-xfce4-kbdleds-plugin-uk \
xfce4-kbdleds-plugin-lang \
xfce4-kbdleds-plugin-lang-all"

RDEPENDS:${PN} += "xfce4-kbdleds-plugin"

inherit rpm
