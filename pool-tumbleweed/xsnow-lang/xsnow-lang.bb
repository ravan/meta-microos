SUMMARY = "Translations for package xsnow"
DESCRIPTION = "Provides translations for the 'xsnow' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.9.4"

RPM_NAME = "xsnow-lang-3.9.4-1.1.noarch.rpm"
RPM_HASH = "9a961416970c1e45aec4a2649b766d21b8a884b92096b55408967b591f96863bb0c051a1282c6de796e7a32502d651d8a6cb69dfef0ede99d9d8020592cc5909"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xsnow-cs \
locale-xsnow-da \
locale-xsnow-de \
locale-xsnow-el \
locale-xsnow-en \
locale-xsnow-es \
locale-xsnow-et \
locale-xsnow-fi \
locale-xsnow-fr \
locale-xsnow-hu \
locale-xsnow-is \
locale-xsnow-it \
locale-xsnow-ja \
locale-xsnow-lt \
locale-xsnow-lv \
locale-xsnow-nl \
locale-xsnow-pl \
locale-xsnow-pt \
locale-xsnow-ro \
locale-xsnow-ru \
locale-xsnow-sv \
locale-xsnow-uk \
xsnow-lang \
xsnow-lang-all"

RDEPENDS:${PN} += "xsnow"

inherit rpm
