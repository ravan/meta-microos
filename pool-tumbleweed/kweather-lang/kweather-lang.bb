SUMMARY = "Translations for package kweather"
DESCRIPTION = "Provides translations for the 'kweather' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kweather-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "da4def6443f51e9017a9798159aa5ca55a9c6a3e3b39c09f372c669a09852315c0133c9e8a08b3805c3de684a704e1fb372fd4d6e14baa0b351769f9a8a9d608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kweather-lang \
kweather-lang-all \
locale-kweather-ar \
locale-kweather-ast \
locale-kweather-az \
locale-kweather-bg \
locale-kweather-ca \
locale-kweather-ca@valencia \
locale-kweather-cs \
locale-kweather-de \
locale-kweather-el \
locale-kweather-en-GB \
locale-kweather-eo \
locale-kweather-es \
locale-kweather-et \
locale-kweather-eu \
locale-kweather-fi \
locale-kweather-fr \
locale-kweather-ga \
locale-kweather-gl \
locale-kweather-he \
locale-kweather-hi \
locale-kweather-hu \
locale-kweather-ia \
locale-kweather-is \
locale-kweather-it \
locale-kweather-ja \
locale-kweather-ka \
locale-kweather-ko \
locale-kweather-lt \
locale-kweather-lv \
locale-kweather-nb \
locale-kweather-nl \
locale-kweather-nn \
locale-kweather-pa \
locale-kweather-pl \
locale-kweather-pt \
locale-kweather-pt-BR \
locale-kweather-ru \
locale-kweather-sk \
locale-kweather-sl \
locale-kweather-sv \
locale-kweather-tr \
locale-kweather-ug \
locale-kweather-uk \
locale-kweather-zh-CN \
locale-kweather-zh-TW"

RDEPENDS:${PN} += "kweather"

inherit rpm
