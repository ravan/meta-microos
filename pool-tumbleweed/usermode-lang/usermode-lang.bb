SUMMARY = "Translations for package usermode"
DESCRIPTION = "Provides translations for the 'usermode' package."
LICENSE = "LGPL-2.0-or-later"

PV = "1.114"

RPM_NAME = "usermode-lang-1.114-1.6.noarch.rpm"
RPM_HASH = "e2288b6379cef04ee9e8ae26e05986a7115c523fbf136d08f7ccf6538f9a5e003c5945fcb54ffc0148cff25aad74e20096e831744aeecc3cdd2060ad29082633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-usermode-ar \
locale-usermode-as \
locale-usermode-ast \
locale-usermode-be \
locale-usermode-bg \
locale-usermode-bn \
locale-usermode-bn-IN \
locale-usermode-bs \
locale-usermode-ca \
locale-usermode-cs \
locale-usermode-cy \
locale-usermode-da \
locale-usermode-de \
locale-usermode-de-CH \
locale-usermode-el \
locale-usermode-en-GB \
locale-usermode-es \
locale-usermode-et \
locale-usermode-fa \
locale-usermode-fi \
locale-usermode-fr \
locale-usermode-gl \
locale-usermode-gu \
locale-usermode-he \
locale-usermode-hi \
locale-usermode-hr \
locale-usermode-hu \
locale-usermode-id \
locale-usermode-is \
locale-usermode-it \
locale-usermode-ja \
locale-usermode-ka \
locale-usermode-kn \
locale-usermode-ko \
locale-usermode-lv \
locale-usermode-mai \
locale-usermode-mk \
locale-usermode-ml \
locale-usermode-mr \
locale-usermode-ms \
locale-usermode-nb \
locale-usermode-nds \
locale-usermode-nl \
locale-usermode-or \
locale-usermode-pa \
locale-usermode-pl \
locale-usermode-pt \
locale-usermode-pt-BR \
locale-usermode-ro \
locale-usermode-ru \
locale-usermode-si \
locale-usermode-sk \
locale-usermode-sl \
locale-usermode-sr \
locale-usermode-sr@latin \
locale-usermode-sv \
locale-usermode-ta \
locale-usermode-te \
locale-usermode-tr \
locale-usermode-uk \
locale-usermode-vi \
locale-usermode-zh-CN \
locale-usermode-zh-TW \
usermode-lang \
usermode-lang-all"

RDEPENDS:${PN} += "usermode"

inherit rpm
