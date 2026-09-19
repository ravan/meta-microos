SUMMARY = "Translations for package krecorder"
DESCRIPTION = "Provides translations for the 'krecorder' package."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "krecorder-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "2421f4f86c9cca535176f0addaf317a8fe597e5292f305090803a744cf35c3f4a20f204ad168fce5d6e04bc0c4ca1a87d13d91c10a253e0275a6d85f3867fa69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krecorder-lang \
krecorder-lang-all \
locale-krecorder-ar \
locale-krecorder-ast \
locale-krecorder-bg \
locale-krecorder-ca \
locale-krecorder-ca@valencia \
locale-krecorder-cs \
locale-krecorder-de \
locale-krecorder-el \
locale-krecorder-en-GB \
locale-krecorder-eo \
locale-krecorder-es \
locale-krecorder-eu \
locale-krecorder-fi \
locale-krecorder-fr \
locale-krecorder-ga \
locale-krecorder-gl \
locale-krecorder-he \
locale-krecorder-hi \
locale-krecorder-hu \
locale-krecorder-ia \
locale-krecorder-it \
locale-krecorder-ja \
locale-krecorder-ka \
locale-krecorder-ko \
locale-krecorder-lt \
locale-krecorder-lv \
locale-krecorder-nl \
locale-krecorder-nn \
locale-krecorder-pa \
locale-krecorder-pl \
locale-krecorder-pt \
locale-krecorder-pt-BR \
locale-krecorder-ro \
locale-krecorder-ru \
locale-krecorder-sk \
locale-krecorder-sl \
locale-krecorder-sv \
locale-krecorder-tr \
locale-krecorder-ug \
locale-krecorder-uk \
locale-krecorder-zh-CN \
locale-krecorder-zh-TW"

RDEPENDS:${PN} += "krecorder"

inherit rpm
