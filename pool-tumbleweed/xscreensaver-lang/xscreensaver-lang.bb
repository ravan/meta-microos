SUMMARY = "Translations for package xscreensaver"
DESCRIPTION = "Provides translations for the 'xscreensaver' package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "6.15"

RPM_NAME = "xscreensaver-lang-6.15-3.3.noarch.rpm"
RPM_HASH = "5f5aceb883ae29212cd360abc6d9a6fac4ec9a2502fb51ce3dc0a4e2839f4d66b7c43aa34021ba353fc82f19fcf8d1e2fd2d9e3eb2866b0ada2db102c7025021"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xscreensaver-da \
locale-xscreensaver-de \
locale-xscreensaver-es \
locale-xscreensaver-et \
locale-xscreensaver-fi \
locale-xscreensaver-fr \
locale-xscreensaver-hu \
locale-xscreensaver-it \
locale-xscreensaver-ja \
locale-xscreensaver-ko \
locale-xscreensaver-nb \
locale-xscreensaver-nl \
locale-xscreensaver-pl \
locale-xscreensaver-pt \
locale-xscreensaver-pt-BR \
locale-xscreensaver-ru \
locale-xscreensaver-sk \
locale-xscreensaver-sv \
locale-xscreensaver-vi \
locale-xscreensaver-wa \
locale-xscreensaver-zh-CN \
locale-xscreensaver-zh-TW \
xscreensaver-lang \
xscreensaver-lang-all"

RDEPENDS:${PN} += "xscreensaver"

inherit rpm
