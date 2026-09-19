SUMMARY = "Translations for package icewm"
DESCRIPTION = "Provides translations for the 'icewm' package."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "icewm-lang-4.1.0-1.1.noarch.rpm"
RPM_HASH = "1da74f1ff80ebb82fef1294dc4b012a44c96ce939afcb9881add8b3a8eacff0eaf1b836f9daf05f6c722d40d1584f9b3bacc1371b938f8fb25566cf4a81dd40d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icewm-lang \
icewm-lang-all \
locale-icewm-ar \
locale-icewm-ast \
locale-icewm-be \
locale-icewm-bg \
locale-icewm-ca \
locale-icewm-cs \
locale-icewm-da \
locale-icewm-de \
locale-icewm-el \
locale-icewm-en \
locale-icewm-eo \
locale-icewm-es \
locale-icewm-fa \
locale-icewm-fi \
locale-icewm-fr \
locale-icewm-he \
locale-icewm-hi \
locale-icewm-hr \
locale-icewm-hu \
locale-icewm-id \
locale-icewm-it \
locale-icewm-ja \
locale-icewm-ka \
locale-icewm-kk \
locale-icewm-ko \
locale-icewm-lt \
locale-icewm-lv \
locale-icewm-mk \
locale-icewm-nb \
locale-icewm-nl \
locale-icewm-nn \
locale-icewm-pl \
locale-icewm-pt \
locale-icewm-pt-BR \
locale-icewm-ro \
locale-icewm-ru \
locale-icewm-sk \
locale-icewm-sl \
locale-icewm-sr \
locale-icewm-sv \
locale-icewm-tr \
locale-icewm-uk \
locale-icewm-vi \
locale-icewm-zh-CN \
locale-icewm-zh-TW"

RDEPENDS:${PN} += "icewm"

inherit rpm
