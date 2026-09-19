SUMMARY = "Translations for package xapp-common"
DESCRIPTION = "Provides translations for the 'xapp-common' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.2"

RPM_NAME = "xapp-common-lang-3.2.2-1.4.noarch.rpm"
RPM_HASH = "3f601ddfe74668e7b58279a900a45bccd8e0c3a7b1963e20cbcba68dd4116189c0664f5bcc76ba4e631b2f9edce998dd2ebe8df6955d27a4f275b58ec398bf3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xapp-common-af \
locale-xapp-common-ar \
locale-xapp-common-ast \
locale-xapp-common-az \
locale-xapp-common-be \
locale-xapp-common-bg \
locale-xapp-common-bn \
locale-xapp-common-br \
locale-xapp-common-ca \
locale-xapp-common-ca@valencia \
locale-xapp-common-cs \
locale-xapp-common-cy \
locale-xapp-common-da \
locale-xapp-common-de \
locale-xapp-common-el \
locale-xapp-common-en-CA \
locale-xapp-common-en-GB \
locale-xapp-common-eo \
locale-xapp-common-es \
locale-xapp-common-et \
locale-xapp-common-eu \
locale-xapp-common-fa \
locale-xapp-common-fi \
locale-xapp-common-fr \
locale-xapp-common-fr-CA \
locale-xapp-common-he \
locale-xapp-common-hi \
locale-xapp-common-hr \
locale-xapp-common-hu \
locale-xapp-common-ia \
locale-xapp-common-id \
locale-xapp-common-is \
locale-xapp-common-it \
locale-xapp-common-ja \
locale-xapp-common-ka \
locale-xapp-common-kk \
locale-xapp-common-ko \
locale-xapp-common-lt \
locale-xapp-common-lv \
locale-xapp-common-mai \
locale-xapp-common-mk \
locale-xapp-common-ms \
locale-xapp-common-nb \
locale-xapp-common-nl \
locale-xapp-common-nn \
locale-xapp-common-oc \
locale-xapp-common-pl \
locale-xapp-common-pt \
locale-xapp-common-pt-BR \
locale-xapp-common-ro \
locale-xapp-common-ru \
locale-xapp-common-sk \
locale-xapp-common-sl \
locale-xapp-common-sq \
locale-xapp-common-sr \
locale-xapp-common-sr@latin \
locale-xapp-common-sv \
locale-xapp-common-te \
locale-xapp-common-th \
locale-xapp-common-tr \
locale-xapp-common-uk \
locale-xapp-common-vi \
locale-xapp-common-zh-CN \
locale-xapp-common-zh-HK \
locale-xapp-common-zh-TW \
xapp-common-lang \
xapp-common-lang-all"

RDEPENDS:${PN} += "xapp-common"

inherit rpm
