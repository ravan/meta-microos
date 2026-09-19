SUMMARY = "Translations for package kalk"
DESCRIPTION = "Provides translations for the 'kalk' package."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "kalk-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "ac4236b5dbbf8bcf567d90199726bcc77b752764b346d8364e36b200fee8f20c94422cd4a392f7b2667ceba4fc7c7f930ba02036a865e4f0d16472e5faef0480"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalk-lang \
kalk-lang-all \
locale-kalk-ar \
locale-kalk-ast \
locale-kalk-az \
locale-kalk-ca \
locale-kalk-ca@valencia \
locale-kalk-cs \
locale-kalk-da \
locale-kalk-de \
locale-kalk-el \
locale-kalk-en-GB \
locale-kalk-eo \
locale-kalk-es \
locale-kalk-eu \
locale-kalk-fi \
locale-kalk-fr \
locale-kalk-ga \
locale-kalk-gl \
locale-kalk-he \
locale-kalk-hi \
locale-kalk-hu \
locale-kalk-ia \
locale-kalk-it \
locale-kalk-ja \
locale-kalk-ka \
locale-kalk-ko \
locale-kalk-lt \
locale-kalk-lv \
locale-kalk-nl \
locale-kalk-nn \
locale-kalk-pa \
locale-kalk-pl \
locale-kalk-pt \
locale-kalk-pt-BR \
locale-kalk-ru \
locale-kalk-sk \
locale-kalk-sl \
locale-kalk-sv \
locale-kalk-tr \
locale-kalk-ug \
locale-kalk-uk \
locale-kalk-zh-CN \
locale-kalk-zh-TW"

RDEPENDS:${PN} += "kalk"

inherit rpm
