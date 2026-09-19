SUMMARY = "Translations for package kdevelop"
DESCRIPTION = "Provides translations for the 'kdevelop' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdevelop-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "72c67105e23c14aae0e1ba16a7c1ce748c996df2b60dac84c3b5cd2fe1f18b0655df79cf75ca010b74eb76814ccdf509ef6c882767be449aa43f6e22014e9b85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdevelop-lang \
kdevelop-lang-all \
kdevelop5-plugin-clang-tidy-lang \
locale-kdevelop-af \
locale-kdevelop-ar \
locale-kdevelop-az \
locale-kdevelop-be \
locale-kdevelop-br \
locale-kdevelop-bs \
locale-kdevelop-ca \
locale-kdevelop-ca@valencia \
locale-kdevelop-cs \
locale-kdevelop-cy \
locale-kdevelop-da \
locale-kdevelop-de \
locale-kdevelop-el \
locale-kdevelop-en-GB \
locale-kdevelop-eo \
locale-kdevelop-es \
locale-kdevelop-et \
locale-kdevelop-eu \
locale-kdevelop-fa \
locale-kdevelop-fi \
locale-kdevelop-fr \
locale-kdevelop-ga \
locale-kdevelop-gl \
locale-kdevelop-he \
locale-kdevelop-hi \
locale-kdevelop-hr \
locale-kdevelop-hu \
locale-kdevelop-ia \
locale-kdevelop-is \
locale-kdevelop-it \
locale-kdevelop-ja \
locale-kdevelop-ka \
locale-kdevelop-kk \
locale-kdevelop-km \
locale-kdevelop-ko \
locale-kdevelop-lt \
locale-kdevelop-lv \
locale-kdevelop-mai \
locale-kdevelop-mr \
locale-kdevelop-ms \
locale-kdevelop-nb \
locale-kdevelop-nds \
locale-kdevelop-ne \
locale-kdevelop-nl \
locale-kdevelop-nn \
locale-kdevelop-oc \
locale-kdevelop-pa \
locale-kdevelop-pl \
locale-kdevelop-pt \
locale-kdevelop-pt-BR \
locale-kdevelop-ro \
locale-kdevelop-ru \
locale-kdevelop-sk \
locale-kdevelop-sl \
locale-kdevelop-sv \
locale-kdevelop-ta \
locale-kdevelop-th \
locale-kdevelop-tr \
locale-kdevelop-ug \
locale-kdevelop-uk \
locale-kdevelop-vi \
locale-kdevelop-zh-CN \
locale-kdevelop-zh-TW"

RDEPENDS:${PN} += "kdevelop"

inherit rpm
