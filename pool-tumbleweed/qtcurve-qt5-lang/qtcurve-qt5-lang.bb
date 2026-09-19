SUMMARY = "Translations for package qtcurve-qt5"
DESCRIPTION = "Provides translations for the 'qtcurve-qt5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.0"

RPM_NAME = "qtcurve-qt5-lang-1.9.0-8.7.noarch.rpm"
RPM_HASH = "d539f562119a731a1ba8ce6b33ac76148febfcc972198e6b931c9257ff703b2ffbad1b55e4dbad5372e5dc6ec1e1455d7a578ceca64b0e478fb57664068b9291"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-qtcurve-qt5-ast \
locale-qtcurve-qt5-bs \
locale-qtcurve-qt5-ca \
locale-qtcurve-qt5-ca@valencia \
locale-qtcurve-qt5-cs \
locale-qtcurve-qt5-de \
locale-qtcurve-qt5-el \
locale-qtcurve-qt5-en-GB \
locale-qtcurve-qt5-es \
locale-qtcurve-qt5-fi \
locale-qtcurve-qt5-fr \
locale-qtcurve-qt5-gl \
locale-qtcurve-qt5-it \
locale-qtcurve-qt5-ja \
locale-qtcurve-qt5-ko \
locale-qtcurve-qt5-nl \
locale-qtcurve-qt5-pl \
locale-qtcurve-qt5-pt \
locale-qtcurve-qt5-pt-BR \
locale-qtcurve-qt5-ru \
locale-qtcurve-qt5-sk \
locale-qtcurve-qt5-sv \
locale-qtcurve-qt5-tr \
locale-qtcurve-qt5-uk \
locale-qtcurve-qt5-zh-CN \
locale-qtcurve-qt5-zh-HK \
locale-qtcurve-qt5-zh-TW \
qtcurve-qt5-lang \
qtcurve-qt5-lang-all"

RDEPENDS:${PN} += "qtcurve-qt5"

inherit rpm
