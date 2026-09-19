SUMMARY = "Translations for package libgnomesu"
DESCRIPTION = "Provides translations for the 'libgnomesu' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.10"

RPM_NAME = "libgnomesu-lang-2.0.10-1.5.noarch.rpm"
RPM_HASH = "f87859600dcefab4ecd03610749b7b374ee7c079896c2813b086dd42dc7e8b0a33891cbd8555e486ec038f719bbc0654e300ee415cb62365dc2f77ca8c34a7a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgnomesu-lang \
libgnomesu-lang-all \
locale-libgnomesu-ar \
locale-libgnomesu-az \
locale-libgnomesu-bg \
locale-libgnomesu-bs \
locale-libgnomesu-ca \
locale-libgnomesu-cs \
locale-libgnomesu-da \
locale-libgnomesu-de \
locale-libgnomesu-el \
locale-libgnomesu-en-CA \
locale-libgnomesu-en-GB \
locale-libgnomesu-es \
locale-libgnomesu-eu \
locale-libgnomesu-fa \
locale-libgnomesu-fi \
locale-libgnomesu-fr \
locale-libgnomesu-gu \
locale-libgnomesu-hi \
locale-libgnomesu-hr \
locale-libgnomesu-hu \
locale-libgnomesu-id \
locale-libgnomesu-it \
locale-libgnomesu-ja \
locale-libgnomesu-ka \
locale-libgnomesu-ko \
locale-libgnomesu-lt \
locale-libgnomesu-lv \
locale-libgnomesu-mk \
locale-libgnomesu-ms \
locale-libgnomesu-nb \
locale-libgnomesu-ne \
locale-libgnomesu-nl \
locale-libgnomesu-nn \
locale-libgnomesu-pa \
locale-libgnomesu-pl \
locale-libgnomesu-pt \
locale-libgnomesu-pt-BR \
locale-libgnomesu-ru \
locale-libgnomesu-si \
locale-libgnomesu-sk \
locale-libgnomesu-sq \
locale-libgnomesu-sr \
locale-libgnomesu-sr@latin \
locale-libgnomesu-sv \
locale-libgnomesu-tr \
locale-libgnomesu-uk \
locale-libgnomesu-vi \
locale-libgnomesu-zh-CN \
locale-libgnomesu-zh-TW"

RDEPENDS:${PN} += "libgnomesu"

inherit rpm
