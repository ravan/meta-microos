SUMMARY = "Translations for package modem-manager-gui"
DESCRIPTION = "Provides translations for the 'modem-manager-gui' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.20"

RPM_NAME = "modem-manager-gui-lang-0.0.20-5.10.noarch.rpm"
RPM_HASH = "9dcca6d5896b1e0aff05b4c1f7c745c24b4e970d0a8470dab4efa3722a9d406422789967ea56f0e1f3026ae366ef0d9d1195274a78a2d524b113dca650765316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-modem-manager-gui-ar \
locale-modem-manager-gui-de \
locale-modem-manager-gui-es \
locale-modem-manager-gui-fr \
locale-modem-manager-gui-hu \
locale-modem-manager-gui-id \
locale-modem-manager-gui-it \
locale-modem-manager-gui-lt \
locale-modem-manager-gui-pl \
locale-modem-manager-gui-pl-PL \
locale-modem-manager-gui-pt-BR \
locale-modem-manager-gui-ru \
locale-modem-manager-gui-tr \
locale-modem-manager-gui-uk \
locale-modem-manager-gui-zh-CN \
modem-manager-gui-lang \
modem-manager-gui-lang-all"

RDEPENDS:${PN} += "modem-manager-gui"

inherit rpm
