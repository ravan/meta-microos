SUMMARY = "Translations for package ibus"
DESCRIPTION = "Provides translations for the 'ibus' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.34"

RPM_NAME = "ibus-lang-1.5.34-2.1.noarch.rpm"
RPM_HASH = "30bdb1cea9afdad32065c71c54a49f6a7df299f633189d0095b05f51c69718e367fd4c6445e7738beba41de321c124b4a01b4e5aeb928ceb9297d912a1661d10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-lang \
ibus-lang-all \
locale-ibus-ar \
locale-ibus-as \
locale-ibus-bg \
locale-ibus-bn \
locale-ibus-bn-IN \
locale-ibus-ca \
locale-ibus-cs \
locale-ibus-da \
locale-ibus-de \
locale-ibus-el \
locale-ibus-en-GB \
locale-ibus-es \
locale-ibus-et \
locale-ibus-eu \
locale-ibus-fa \
locale-ibus-fi \
locale-ibus-fr \
locale-ibus-gu \
locale-ibus-he \
locale-ibus-hi \
locale-ibus-hu \
locale-ibus-ia \
locale-ibus-id \
locale-ibus-it \
locale-ibus-ja \
locale-ibus-ka \
locale-ibus-kk \
locale-ibus-kn \
locale-ibus-ko \
locale-ibus-lv \
locale-ibus-ml \
locale-ibus-mr \
locale-ibus-nb \
locale-ibus-nl \
locale-ibus-oc \
locale-ibus-or \
locale-ibus-pa \
locale-ibus-pl \
locale-ibus-pt \
locale-ibus-pt-BR \
locale-ibus-ro \
locale-ibus-ru \
locale-ibus-sq \
locale-ibus-sr \
locale-ibus-sr@latin \
locale-ibus-sv \
locale-ibus-ta \
locale-ibus-te \
locale-ibus-tr \
locale-ibus-uk \
locale-ibus-vi \
locale-ibus-zh-CN \
locale-ibus-zh-HK \
locale-ibus-zh-TW"

RDEPENDS:${PN} += "ibus"

inherit rpm
