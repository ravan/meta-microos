SUMMARY = "Translations for package sysprof"
DESCRIPTION = "Provides translations for the 'sysprof' package."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "sysprof-lang-50.0-1.3.noarch.rpm"
RPM_HASH = "ed44ed7376498164b127af21163dbd3b62f00e180255ccb16fbdf11bfb8970e7bf737c932506263d7875e5c75c10644f60f71213d9e613ced4ecfcf2f1fff0b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-sysprof-bg \
locale-sysprof-ca \
locale-sysprof-cs \
locale-sysprof-da \
locale-sysprof-de \
locale-sysprof-el \
locale-sysprof-en-GB \
locale-sysprof-eo \
locale-sysprof-es \
locale-sysprof-eu \
locale-sysprof-fa \
locale-sysprof-fi \
locale-sysprof-fr \
locale-sysprof-fur \
locale-sysprof-gl \
locale-sysprof-he \
locale-sysprof-hi \
locale-sysprof-hu \
locale-sysprof-id \
locale-sysprof-it \
locale-sysprof-ja \
locale-sysprof-ka \
locale-sysprof-kk \
locale-sysprof-ko \
locale-sysprof-lt \
locale-sysprof-ne \
locale-sysprof-nl \
locale-sysprof-oc \
locale-sysprof-pa \
locale-sysprof-pl \
locale-sysprof-pt \
locale-sysprof-pt-BR \
locale-sysprof-ro \
locale-sysprof-ru \
locale-sysprof-sk \
locale-sysprof-sl \
locale-sysprof-sr \
locale-sysprof-sr@latin \
locale-sysprof-sv \
locale-sysprof-tr \
locale-sysprof-ug \
locale-sysprof-uk \
locale-sysprof-zh-CN \
locale-sysprof-zh-TW \
sysprof-lang \
sysprof-lang-all"

RDEPENDS:${PN} += "sysprof"

inherit rpm
