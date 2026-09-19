SUMMARY = "Translations for package kasts"
DESCRIPTION = "Provides translations for the 'kasts' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kasts-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "bb6f069687d863ed7f006b4a63bcf5b3723cba256a7c03e021def10bfebf73f41248e871cb3cbd39705a17bbe6b96e574c43f0c8fed211937e1acdf406e59ba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kasts-lang \
kasts-lang-all \
locale-kasts-ar \
locale-kasts-ast \
locale-kasts-ca \
locale-kasts-ca@valencia \
locale-kasts-cs \
locale-kasts-da \
locale-kasts-de \
locale-kasts-en-GB \
locale-kasts-eo \
locale-kasts-es \
locale-kasts-eu \
locale-kasts-fi \
locale-kasts-fr \
locale-kasts-ga \
locale-kasts-gl \
locale-kasts-he \
locale-kasts-hi \
locale-kasts-ia \
locale-kasts-is \
locale-kasts-it \
locale-kasts-ja \
locale-kasts-ka \
locale-kasts-ko \
locale-kasts-lt \
locale-kasts-nl \
locale-kasts-pa \
locale-kasts-pl \
locale-kasts-pt \
locale-kasts-pt-BR \
locale-kasts-ru \
locale-kasts-sk \
locale-kasts-sl \
locale-kasts-sv \
locale-kasts-tr \
locale-kasts-ug \
locale-kasts-uk \
locale-kasts-zh-CN \
locale-kasts-zh-TW"

RDEPENDS:${PN} += "kasts"

inherit rpm
