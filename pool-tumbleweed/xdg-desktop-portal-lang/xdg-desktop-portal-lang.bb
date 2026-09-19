SUMMARY = "Translations for package xdg-desktop-portal"
DESCRIPTION = "Provides translations for the 'xdg-desktop-portal' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.1"

RPM_NAME = "xdg-desktop-portal-lang-1.22.1-1.2.noarch.rpm"
RPM_HASH = "67a3bb69462d3b86ffb42f04c21963929d7b667c6b5397db2a06fb81ed092e164996bd6c6c3e8a667ab9f7a397fcf2894f79e8f3e652708b34208a04e8abf271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xdg-desktop-portal-ar \
locale-xdg-desktop-portal-be \
locale-xdg-desktop-portal-bg \
locale-xdg-desktop-portal-ca \
locale-xdg-desktop-portal-cs \
locale-xdg-desktop-portal-da \
locale-xdg-desktop-portal-de \
locale-xdg-desktop-portal-en-GB \
locale-xdg-desktop-portal-es \
locale-xdg-desktop-portal-fr \
locale-xdg-desktop-portal-gl \
locale-xdg-desktop-portal-he \
locale-xdg-desktop-portal-hi \
locale-xdg-desktop-portal-hr \
locale-xdg-desktop-portal-hu \
locale-xdg-desktop-portal-id \
locale-xdg-desktop-portal-it \
locale-xdg-desktop-portal-ja \
locale-xdg-desktop-portal-ka \
locale-xdg-desktop-portal-kk \
locale-xdg-desktop-portal-lt \
locale-xdg-desktop-portal-nl \
locale-xdg-desktop-portal-oc \
locale-xdg-desktop-portal-pl \
locale-xdg-desktop-portal-pt \
locale-xdg-desktop-portal-pt-BR \
locale-xdg-desktop-portal-ro \
locale-xdg-desktop-portal-ru \
locale-xdg-desktop-portal-sk \
locale-xdg-desktop-portal-sl \
locale-xdg-desktop-portal-sr \
locale-xdg-desktop-portal-sr@latin \
locale-xdg-desktop-portal-sv \
locale-xdg-desktop-portal-tr \
locale-xdg-desktop-portal-uk \
locale-xdg-desktop-portal-zh-CN \
locale-xdg-desktop-portal-zh-TW \
xdg-desktop-portal-lang \
xdg-desktop-portal-lang-all"

RDEPENDS:${PN} += "xdg-desktop-portal"

inherit rpm
