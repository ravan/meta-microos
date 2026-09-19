SUMMARY = "Translations for package util-linux"
DESCRIPTION = "Provides translations for the 'util-linux' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.42.2"

RPM_NAME = "util-linux-lang-2.42.2-2.1.noarch.rpm"
RPM_HASH = "8143c834301b2314c0234c427ba0d2f886a3c722604a5c0042d83e445f15574914591b2fbc03409b802bd165edbdcb90fc07d21ff1479928f30136c0d8acb182"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-util-linux-ar \
locale-util-linux-ca \
locale-util-linux-cs \
locale-util-linux-da \
locale-util-linux-de \
locale-util-linux-es \
locale-util-linux-et \
locale-util-linux-eu \
locale-util-linux-fi \
locale-util-linux-fr \
locale-util-linux-gl \
locale-util-linux-hr \
locale-util-linux-hu \
locale-util-linux-id \
locale-util-linux-it \
locale-util-linux-ja \
locale-util-linux-ka \
locale-util-linux-ko \
locale-util-linux-nl \
locale-util-linux-pl \
locale-util-linux-pt \
locale-util-linux-pt-BR \
locale-util-linux-ro \
locale-util-linux-ru \
locale-util-linux-sk \
locale-util-linux-sl \
locale-util-linux-sr \
locale-util-linux-sv \
locale-util-linux-tr \
locale-util-linux-uk \
locale-util-linux-vi \
locale-util-linux-zh-CN \
locale-util-linux-zh-TW \
util-linux-lang \
util-linux-lang-all"

RDEPENDS:${PN} += "util-linux"

inherit rpm
