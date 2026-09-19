SUMMARY = "Translations for package kgoldrunner"
DESCRIPTION = "Provides translations for the 'kgoldrunner' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kgoldrunner-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "534a620102bc84460a81170b8c8a1dce7e82868804f57b927bad41a7aafff8707a53d8b2a727d2ae752e5f1817b70a3bf1bed484a78d76ef837152da44fa98cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kgoldrunner-lang \
kgoldrunner-lang-all \
locale-kgoldrunner-ar \
locale-kgoldrunner-ast \
locale-kgoldrunner-be \
locale-kgoldrunner-bn \
locale-kgoldrunner-br \
locale-kgoldrunner-bs \
locale-kgoldrunner-ca \
locale-kgoldrunner-ca@valencia \
locale-kgoldrunner-cs \
locale-kgoldrunner-cy \
locale-kgoldrunner-da \
locale-kgoldrunner-de \
locale-kgoldrunner-el \
locale-kgoldrunner-en-GB \
locale-kgoldrunner-eo \
locale-kgoldrunner-es \
locale-kgoldrunner-et \
locale-kgoldrunner-eu \
locale-kgoldrunner-fa \
locale-kgoldrunner-fi \
locale-kgoldrunner-fr \
locale-kgoldrunner-ga \
locale-kgoldrunner-gl \
locale-kgoldrunner-hi \
locale-kgoldrunner-hr \
locale-kgoldrunner-hu \
locale-kgoldrunner-ia \
locale-kgoldrunner-id \
locale-kgoldrunner-is \
locale-kgoldrunner-it \
locale-kgoldrunner-ja \
locale-kgoldrunner-ka \
locale-kgoldrunner-kk \
locale-kgoldrunner-km \
locale-kgoldrunner-ko \
locale-kgoldrunner-lt \
locale-kgoldrunner-lv \
locale-kgoldrunner-mai \
locale-kgoldrunner-mk \
locale-kgoldrunner-ml \
locale-kgoldrunner-mr \
locale-kgoldrunner-nb \
locale-kgoldrunner-nds \
locale-kgoldrunner-ne \
locale-kgoldrunner-nl \
locale-kgoldrunner-nn \
locale-kgoldrunner-oc \
locale-kgoldrunner-pa \
locale-kgoldrunner-pl \
locale-kgoldrunner-pt \
locale-kgoldrunner-pt-BR \
locale-kgoldrunner-ro \
locale-kgoldrunner-ru \
locale-kgoldrunner-sk \
locale-kgoldrunner-sl \
locale-kgoldrunner-sq \
locale-kgoldrunner-sr \
locale-kgoldrunner-sr@ijekavian \
locale-kgoldrunner-sr@ijekavianlatin \
locale-kgoldrunner-sr@latin \
locale-kgoldrunner-sv \
locale-kgoldrunner-ta \
locale-kgoldrunner-te \
locale-kgoldrunner-tr \
locale-kgoldrunner-ug \
locale-kgoldrunner-uk \
locale-kgoldrunner-zh-CN \
locale-kgoldrunner-zh-TW"

RDEPENDS:${PN} += "kgoldrunner"

inherit rpm
