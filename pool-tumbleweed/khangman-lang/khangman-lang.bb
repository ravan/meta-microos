SUMMARY = "Translations for package khangman"
DESCRIPTION = "Provides translations for the 'khangman' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "khangman-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "8981b181df06906295b43b97a00bb87ece9e159fb78ef463fd7d8516e427e3b05b43cb2bd43cfe228cdb045d2f2b718f401c0e49be63f70d4911ac9bf4406f23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "khangman-lang \
khangman-lang-all \
locale-khangman-af \
locale-khangman-ar \
locale-khangman-ast \
locale-khangman-be \
locale-khangman-bn \
locale-khangman-br \
locale-khangman-bs \
locale-khangman-ca \
locale-khangman-ca@valencia \
locale-khangman-cs \
locale-khangman-cy \
locale-khangman-da \
locale-khangman-de \
locale-khangman-el \
locale-khangman-en-GB \
locale-khangman-eo \
locale-khangman-es \
locale-khangman-et \
locale-khangman-eu \
locale-khangman-fa \
locale-khangman-fi \
locale-khangman-fr \
locale-khangman-ga \
locale-khangman-gl \
locale-khangman-gu \
locale-khangman-he \
locale-khangman-hi \
locale-khangman-hr \
locale-khangman-hu \
locale-khangman-ia \
locale-khangman-is \
locale-khangman-it \
locale-khangman-ja \
locale-khangman-ka \
locale-khangman-kk \
locale-khangman-km \
locale-khangman-ko \
locale-khangman-lt \
locale-khangman-lv \
locale-khangman-mk \
locale-khangman-ml \
locale-khangman-mr \
locale-khangman-ms \
locale-khangman-nb \
locale-khangman-nds \
locale-khangman-ne \
locale-khangman-nl \
locale-khangman-nn \
locale-khangman-oc \
locale-khangman-pa \
locale-khangman-pl \
locale-khangman-pt \
locale-khangman-pt-BR \
locale-khangman-ro \
locale-khangman-ru \
locale-khangman-si \
locale-khangman-sk \
locale-khangman-sl \
locale-khangman-sq \
locale-khangman-sv \
locale-khangman-ta \
locale-khangman-tr \
locale-khangman-ug \
locale-khangman-uk \
locale-khangman-zh-CN \
locale-khangman-zh-TW"

RDEPENDS:${PN} += "khangman"

inherit rpm
