SUMMARY = "Translations for package krdp6"
DESCRIPTION = "Provides translations for the 'krdp6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.7.5"

RPM_NAME = "krdp6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "afb4eb04dc89f58897cfb6a2a4e6d026c8771cd7fed08a07a9ea49ff08096b17eb4a7597ec85364ee7bdcdb77292237dc6cd0c3659d8b437fa31c32332794976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krdp6-lang \
krdp6-lang-all \
locale-krdp6-ar \
locale-krdp6-az \
locale-krdp6-bg \
locale-krdp6-ca \
locale-krdp6-ca@valencia \
locale-krdp6-cs \
locale-krdp6-de \
locale-krdp6-en-GB \
locale-krdp6-eo \
locale-krdp6-es \
locale-krdp6-eu \
locale-krdp6-fi \
locale-krdp6-fr \
locale-krdp6-ga \
locale-krdp6-gl \
locale-krdp6-he \
locale-krdp6-hi \
locale-krdp6-hu \
locale-krdp6-ia \
locale-krdp6-is \
locale-krdp6-it \
locale-krdp6-ja \
locale-krdp6-ka \
locale-krdp6-ko \
locale-krdp6-lt \
locale-krdp6-lv \
locale-krdp6-nl \
locale-krdp6-nn \
locale-krdp6-pa \
locale-krdp6-pl \
locale-krdp6-pt-BR \
locale-krdp6-ro \
locale-krdp6-ru \
locale-krdp6-sk \
locale-krdp6-sl \
locale-krdp6-tr \
locale-krdp6-uk \
locale-krdp6-zh-CN \
locale-krdp6-zh-TW"

RDEPENDS:${PN} += "krdp6"

inherit rpm
