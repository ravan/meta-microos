SUMMARY = "Translations for package mate-applet-softupd"
DESCRIPTION = "Provides translations for the 'mate-applet-softupd' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.8"

RPM_NAME = "mate-applet-softupd-lang-0.4.8-1.20.noarch.rpm"
RPM_HASH = "f262eabc70e8c96eeb2fcf3d014502665e5354d4420887d046bc19d9ef67a731d6dfb58cdf4bfa73ed7ea8646af5cb8530d9a9c53f4b7885ed5cdf6adad966cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mate-applet-softupd-en-GB \
locale-mate-applet-softupd-en-US \
locale-mate-applet-softupd-fr-FR \
locale-mate-applet-softupd-pt-BR \
locale-mate-applet-softupd-pt-PT \
locale-mate-applet-softupd-ru-RU \
locale-mate-applet-softupd-zh-CN \
mate-applet-softupd-lang \
mate-applet-softupd-lang-all"

RDEPENDS:${PN} += "mate-applet-softupd"

inherit rpm
