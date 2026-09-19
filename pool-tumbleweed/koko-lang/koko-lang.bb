SUMMARY = "Translations for package koko"
DESCRIPTION = "Provides translations for the 'koko' package."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "koko-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "cf6f0a61a3beeb5397113b9d4b783e85258cfe411f9127baa514d70d2338e4fe678895482ecd646c15ff62da328e9c43e230b3747457eed1ffca8f7c44c72505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "koko-lang \
koko-lang-all \
locale-koko-ar \
locale-koko-ast \
locale-koko-bg \
locale-koko-ca \
locale-koko-ca@valencia \
locale-koko-cs \
locale-koko-da \
locale-koko-de \
locale-koko-el \
locale-koko-en-GB \
locale-koko-eo \
locale-koko-es \
locale-koko-eu \
locale-koko-fi \
locale-koko-fr \
locale-koko-ga \
locale-koko-gl \
locale-koko-he \
locale-koko-hi \
locale-koko-hu \
locale-koko-ia \
locale-koko-it \
locale-koko-ja \
locale-koko-ka \
locale-koko-ko \
locale-koko-lt \
locale-koko-lv \
locale-koko-nl \
locale-koko-nn \
locale-koko-pa \
locale-koko-pl \
locale-koko-pt \
locale-koko-pt-BR \
locale-koko-ru \
locale-koko-sk \
locale-koko-sl \
locale-koko-sv \
locale-koko-tr \
locale-koko-ug \
locale-koko-uk \
locale-koko-zh-CN \
locale-koko-zh-TW"

RDEPENDS:${PN} += "koko"

inherit rpm
