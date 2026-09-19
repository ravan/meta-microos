SUMMARY = "Translations for package akonadiconsole"
DESCRIPTION = "Provides translations for the 'akonadiconsole' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadiconsole-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "207870a7122346c91590e7e3803e09c13cd7d8ca19d020528d79e3382d25ed36ea608182b77465573a7ce10410df8a8a9acba48adfafa94614f12282f1922638"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akonadiconsole-lang \
akonadiconsole-lang-all \
locale-akonadiconsole-ar \
locale-akonadiconsole-ast \
locale-akonadiconsole-bg \
locale-akonadiconsole-ca \
locale-akonadiconsole-ca@valencia \
locale-akonadiconsole-cs \
locale-akonadiconsole-de \
locale-akonadiconsole-el \
locale-akonadiconsole-en-GB \
locale-akonadiconsole-eo \
locale-akonadiconsole-es \
locale-akonadiconsole-eu \
locale-akonadiconsole-fi \
locale-akonadiconsole-fr \
locale-akonadiconsole-ga \
locale-akonadiconsole-gl \
locale-akonadiconsole-he \
locale-akonadiconsole-hi \
locale-akonadiconsole-hu \
locale-akonadiconsole-ia \
locale-akonadiconsole-it \
locale-akonadiconsole-ja \
locale-akonadiconsole-ka \
locale-akonadiconsole-ko \
locale-akonadiconsole-lt \
locale-akonadiconsole-lv \
locale-akonadiconsole-nl \
locale-akonadiconsole-pl \
locale-akonadiconsole-pt \
locale-akonadiconsole-pt-BR \
locale-akonadiconsole-ro \
locale-akonadiconsole-ru \
locale-akonadiconsole-sk \
locale-akonadiconsole-sl \
locale-akonadiconsole-sv \
locale-akonadiconsole-ta \
locale-akonadiconsole-tr \
locale-akonadiconsole-ug \
locale-akonadiconsole-uk \
locale-akonadiconsole-zh-CN \
locale-akonadiconsole-zh-TW"

RDEPENDS:${PN} += "akonadiconsole"

inherit rpm
