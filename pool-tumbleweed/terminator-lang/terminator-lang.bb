SUMMARY = "Translations for package terminator"
DESCRIPTION = "Provides translations for the 'terminator' package."
LICENSE = "GPL-2.0-only"

PV = "2.1.6"

RPM_NAME = "terminator-lang-2.1.6-1.1.noarch.rpm"
RPM_HASH = "816abe072c66c8ff6d1fcacffcb21a8384552bc1be4242a53dbe1583f7003d0646759bf1ae28b6e90d5013922f8c787992fce43e6d4f1094931c63ab08242bdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-terminator-af \
locale-terminator-ar \
locale-terminator-ast \
locale-terminator-az \
locale-terminator-be \
locale-terminator-bg \
locale-terminator-bn \
locale-terminator-bs \
locale-terminator-ca \
locale-terminator-ca@valencia \
locale-terminator-cs \
locale-terminator-da \
locale-terminator-de \
locale-terminator-el \
locale-terminator-en-AU \
locale-terminator-en-CA \
locale-terminator-en-GB \
locale-terminator-eo \
locale-terminator-es \
locale-terminator-et \
locale-terminator-eu \
locale-terminator-fa \
locale-terminator-fi \
locale-terminator-fr \
locale-terminator-ga \
locale-terminator-gl \
locale-terminator-he \
locale-terminator-hi \
locale-terminator-hr \
locale-terminator-hu \
locale-terminator-ia \
locale-terminator-id \
locale-terminator-is \
locale-terminator-it \
locale-terminator-ja \
locale-terminator-ka \
locale-terminator-kk \
locale-terminator-ko \
locale-terminator-lt \
locale-terminator-lv \
locale-terminator-mk \
locale-terminator-ml \
locale-terminator-mr \
locale-terminator-ms \
locale-terminator-nb \
locale-terminator-nl \
locale-terminator-nn \
locale-terminator-oc \
locale-terminator-pl \
locale-terminator-pt \
locale-terminator-pt-BR \
locale-terminator-ro \
locale-terminator-ru \
locale-terminator-ru-RU \
locale-terminator-si \
locale-terminator-sk \
locale-terminator-sl \
locale-terminator-sq \
locale-terminator-sr \
locale-terminator-sv \
locale-terminator-ta \
locale-terminator-te \
locale-terminator-th \
locale-terminator-tr \
locale-terminator-ug \
locale-terminator-uk \
locale-terminator-vi \
locale-terminator-wa \
locale-terminator-zh-CN \
locale-terminator-zh-HK \
locale-terminator-zh-TW \
terminator-lang \
terminator-lang-all"

RDEPENDS:${PN} += "terminator"

inherit rpm
