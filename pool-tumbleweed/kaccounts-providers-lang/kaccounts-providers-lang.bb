SUMMARY = "Translations for package kaccounts-providers"
DESCRIPTION = "Provides translations for the 'kaccounts-providers' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kaccounts-providers-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "8dd450f7a2dacdab057d3453151725595fbcd3585d76f386670f1bc903405883503f76a8879facedb011a41d03b727c672f888e1d3bea1938acfed107384179e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kaccounts-providers-lang \
kaccounts-providers-lang-all \
locale-kaccounts-providers-ar \
locale-kaccounts-providers-ast \
locale-kaccounts-providers-az \
locale-kaccounts-providers-bg \
locale-kaccounts-providers-bs \
locale-kaccounts-providers-ca \
locale-kaccounts-providers-ca@valencia \
locale-kaccounts-providers-cs \
locale-kaccounts-providers-da \
locale-kaccounts-providers-de \
locale-kaccounts-providers-el \
locale-kaccounts-providers-en-GB \
locale-kaccounts-providers-eo \
locale-kaccounts-providers-es \
locale-kaccounts-providers-et \
locale-kaccounts-providers-eu \
locale-kaccounts-providers-fi \
locale-kaccounts-providers-fr \
locale-kaccounts-providers-ga \
locale-kaccounts-providers-gl \
locale-kaccounts-providers-he \
locale-kaccounts-providers-hi \
locale-kaccounts-providers-hu \
locale-kaccounts-providers-ia \
locale-kaccounts-providers-id \
locale-kaccounts-providers-is \
locale-kaccounts-providers-it \
locale-kaccounts-providers-ja \
locale-kaccounts-providers-ka \
locale-kaccounts-providers-ko \
locale-kaccounts-providers-lt \
locale-kaccounts-providers-lv \
locale-kaccounts-providers-nl \
locale-kaccounts-providers-nn \
locale-kaccounts-providers-pa \
locale-kaccounts-providers-pl \
locale-kaccounts-providers-pt \
locale-kaccounts-providers-pt-BR \
locale-kaccounts-providers-ro \
locale-kaccounts-providers-ru \
locale-kaccounts-providers-sk \
locale-kaccounts-providers-sl \
locale-kaccounts-providers-sr \
locale-kaccounts-providers-sr@ijekavian \
locale-kaccounts-providers-sr@ijekavianlatin \
locale-kaccounts-providers-sr@latin \
locale-kaccounts-providers-sv \
locale-kaccounts-providers-ta \
locale-kaccounts-providers-tr \
locale-kaccounts-providers-ug \
locale-kaccounts-providers-uk \
locale-kaccounts-providers-zh-CN \
locale-kaccounts-providers-zh-TW"

RDEPENDS:${PN} += "kaccounts-providers"

inherit rpm
