SUMMARY = "Translations for package xkeyboard-config"
DESCRIPTION = "Provides translations for the 'xkeyboard-config' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "2.48"

RPM_NAME = "xkeyboard-config-lang-2.48-1.2.noarch.rpm"
RPM_HASH = "aab36a9011627628478071451d1406496529ef6e1e2cde16fab304ce5f51175cee874a124d0e6a4e728c39a27633c3caa69e76a5099ae4b377e59fa8fd797ed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xkeyboard-config-af \
locale-xkeyboard-config-ar \
locale-xkeyboard-config-az \
locale-xkeyboard-config-bg \
locale-xkeyboard-config-ca \
locale-xkeyboard-config-cs \
locale-xkeyboard-config-da \
locale-xkeyboard-config-de \
locale-xkeyboard-config-el \
locale-xkeyboard-config-en-GB \
locale-xkeyboard-config-eo \
locale-xkeyboard-config-es \
locale-xkeyboard-config-fa \
locale-xkeyboard-config-fi \
locale-xkeyboard-config-fr \
locale-xkeyboard-config-fur \
locale-xkeyboard-config-gl \
locale-xkeyboard-config-he \
locale-xkeyboard-config-hr \
locale-xkeyboard-config-hu \
locale-xkeyboard-config-id \
locale-xkeyboard-config-it \
locale-xkeyboard-config-ja \
locale-xkeyboard-config-ka \
locale-xkeyboard-config-ko \
locale-xkeyboard-config-lt \
locale-xkeyboard-config-nb \
locale-xkeyboard-config-nl \
locale-xkeyboard-config-pl \
locale-xkeyboard-config-pt \
locale-xkeyboard-config-pt-BR \
locale-xkeyboard-config-ro \
locale-xkeyboard-config-ru \
locale-xkeyboard-config-sk \
locale-xkeyboard-config-sl \
locale-xkeyboard-config-sq \
locale-xkeyboard-config-sr \
locale-xkeyboard-config-sv \
locale-xkeyboard-config-tr \
locale-xkeyboard-config-uk \
locale-xkeyboard-config-vi \
locale-xkeyboard-config-zh-CN \
locale-xkeyboard-config-zh-TW \
xkeyboard-config-lang \
xkeyboard-config-lang-all"

RDEPENDS:${PN} += "xkeyboard-config"

inherit rpm
