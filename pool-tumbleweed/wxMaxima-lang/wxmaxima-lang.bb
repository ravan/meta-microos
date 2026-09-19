SUMMARY = "Translations for package wxMaxima"
DESCRIPTION = "Provides translations for the 'wxMaxima' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.0"

RPM_NAME = "wxMaxima-lang-26.08.0-1.1.noarch.rpm"
RPM_HASH = "6d937b9b404ea92a295cb8fd4f7a82f9d640066cdc1479d55adcaa91cf8cf6926a93c1d2da1ac2915b5b37fb40c0ae0e8f0bc4ce0efee1f1fb350b4f6251da9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-wxMaxima-af \
locale-wxMaxima-ar \
locale-wxMaxima-ca \
locale-wxMaxima-cs \
locale-wxMaxima-da \
locale-wxMaxima-de \
locale-wxMaxima-el \
locale-wxMaxima-en \
locale-wxMaxima-es \
locale-wxMaxima-eu \
locale-wxMaxima-fa \
locale-wxMaxima-fi \
locale-wxMaxima-fr \
locale-wxMaxima-gl \
locale-wxMaxima-he \
locale-wxMaxima-hi \
locale-wxMaxima-hr \
locale-wxMaxima-hu \
locale-wxMaxima-id \
locale-wxMaxima-it \
locale-wxMaxima-ja \
locale-wxMaxima-ka \
locale-wxMaxima-ko \
locale-wxMaxima-lt \
locale-wxMaxima-lv \
locale-wxMaxima-ms \
locale-wxMaxima-nb \
locale-wxMaxima-ne \
locale-wxMaxima-nl \
locale-wxMaxima-pl \
locale-wxMaxima-pt \
locale-wxMaxima-pt-BR \
locale-wxMaxima-ro \
locale-wxMaxima-ru \
locale-wxMaxima-sk \
locale-wxMaxima-sl \
locale-wxMaxima-sq \
locale-wxMaxima-sr \
locale-wxMaxima-sv \
locale-wxMaxima-ta \
locale-wxMaxima-tr \
locale-wxMaxima-uk \
locale-wxMaxima-vi \
locale-wxMaxima-zh \
locale-wxMaxima-zh-CN \
locale-wxMaxima-zh-TW \
wxMaxima-lang \
wxMaxima-lang-all"

RDEPENDS:${PN} += "wxMaxima"

inherit rpm
