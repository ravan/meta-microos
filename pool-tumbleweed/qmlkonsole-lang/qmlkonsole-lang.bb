SUMMARY = "Translations for package qmlkonsole"
DESCRIPTION = "Provides translations for the 'qmlkonsole' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "qmlkonsole-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "1f9977209a91980e8767240fda70fba30b4ce361bfbaf854281fa90d7a22993c31cb45b9345720ad4ae3b91b60a755c0da3e2fb175d825927af13181250652e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-qmlkonsole-ar \
locale-qmlkonsole-ast \
locale-qmlkonsole-ca \
locale-qmlkonsole-ca@valencia \
locale-qmlkonsole-cs \
locale-qmlkonsole-de \
locale-qmlkonsole-en-GB \
locale-qmlkonsole-eo \
locale-qmlkonsole-es \
locale-qmlkonsole-eu \
locale-qmlkonsole-fi \
locale-qmlkonsole-fr \
locale-qmlkonsole-ga \
locale-qmlkonsole-gl \
locale-qmlkonsole-he \
locale-qmlkonsole-hi \
locale-qmlkonsole-hu \
locale-qmlkonsole-ia \
locale-qmlkonsole-it \
locale-qmlkonsole-ja \
locale-qmlkonsole-ka \
locale-qmlkonsole-ko \
locale-qmlkonsole-lt \
locale-qmlkonsole-nl \
locale-qmlkonsole-nn \
locale-qmlkonsole-pa \
locale-qmlkonsole-pl \
locale-qmlkonsole-pt \
locale-qmlkonsole-pt-BR \
locale-qmlkonsole-ro \
locale-qmlkonsole-ru \
locale-qmlkonsole-sk \
locale-qmlkonsole-sl \
locale-qmlkonsole-sv \
locale-qmlkonsole-ta \
locale-qmlkonsole-tr \
locale-qmlkonsole-ug \
locale-qmlkonsole-uk \
locale-qmlkonsole-zh-CN \
locale-qmlkonsole-zh-TW \
qmlkonsole-lang \
qmlkonsole-lang-all"

RDEPENDS:${PN} += "qmlkonsole"

inherit rpm
