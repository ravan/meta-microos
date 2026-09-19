SUMMARY = "Translations for package kdb"
DESCRIPTION = "Provides translations for the 'kdb' package."
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kdb-lang-3.2.0-10.7.noarch.rpm"
RPM_HASH = "4c93a75085060ee337878fd120bd3bb439fb87c5806e744b956ea6e9ec43a3d5768d865f8ab08e90a47df751ecf1e13abff4f0a336063169ce4c9cb5ab9ee639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdb-lang \
kdb-lang-all \
locale-kdb-ast \
locale-kdb-ca \
locale-kdb-ca@valencia \
locale-kdb-cs \
locale-kdb-de \
locale-kdb-en \
locale-kdb-en-GB \
locale-kdb-es \
locale-kdb-fi \
locale-kdb-fr \
locale-kdb-gl \
locale-kdb-hu \
locale-kdb-ia \
locale-kdb-it \
locale-kdb-ja \
locale-kdb-ko \
locale-kdb-lt \
locale-kdb-nl \
locale-kdb-nn \
locale-kdb-pl \
locale-kdb-pt \
locale-kdb-pt-BR \
locale-kdb-ru \
locale-kdb-sk \
locale-kdb-sv \
locale-kdb-tr \
locale-kdb-uk \
locale-kdb-zh-CN \
locale-kdb-zh-TW"

RDEPENDS:${PN} += "kdb"

inherit rpm
