SUMMARY = "Translations for package ibus-m17n"
DESCRIPTION = "Provides translations for the 'ibus-m17n' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.37"

RPM_NAME = "ibus-m17n-lang-1.4.37-1.4.noarch.rpm"
RPM_HASH = "148cba48dfaf819e6e49a388bc536c3a22adf5ebb9a005a85b882e964aa6ff3bff73c90ffa2ce82293da6b5a772c2f7dd2300151d9bba588d884520800002f57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-m17n-lang \
ibus-m17n-lang-all \
locale-ibus-m17n-ar \
locale-ibus-m17n-bn \
locale-ibus-m17n-cs \
locale-ibus-m17n-de \
locale-ibus-m17n-el \
locale-ibus-m17n-es \
locale-ibus-m17n-fa \
locale-ibus-m17n-fi \
locale-ibus-m17n-fr \
locale-ibus-m17n-hi \
locale-ibus-m17n-id \
locale-ibus-m17n-ja \
locale-ibus-m17n-ka \
locale-ibus-m17n-lt \
locale-ibus-m17n-ml \
locale-ibus-m17n-pt-BR \
locale-ibus-m17n-ro \
locale-ibus-m17n-ru \
locale-ibus-m17n-si \
locale-ibus-m17n-sv \
locale-ibus-m17n-tr \
locale-ibus-m17n-uk \
locale-ibus-m17n-zh-CN \
locale-ibus-m17n-zh-TW"

RDEPENDS:${PN} += "ibus-m17n"

inherit rpm
