SUMMARY = "Translations for package kimagemapeditor"
DESCRIPTION = "Provides translations for the 'kimagemapeditor' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kimagemapeditor-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "40ae14cdc8883c595e43e42857ebf237601bc0547a3de7b8e65bc9e8d2d8fc93c5d6079d2139e5c58c58f3d685e9bf1c6fa9e2f25713fd122be6cddc938255e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kimagemapeditor-lang \
kimagemapeditor-lang-all \
locale-kimagemapeditor-ar \
locale-kimagemapeditor-be \
locale-kimagemapeditor-bg \
locale-kimagemapeditor-br \
locale-kimagemapeditor-bs \
locale-kimagemapeditor-ca \
locale-kimagemapeditor-ca@valencia \
locale-kimagemapeditor-cs \
locale-kimagemapeditor-cy \
locale-kimagemapeditor-da \
locale-kimagemapeditor-de \
locale-kimagemapeditor-el \
locale-kimagemapeditor-en-GB \
locale-kimagemapeditor-eo \
locale-kimagemapeditor-es \
locale-kimagemapeditor-et \
locale-kimagemapeditor-eu \
locale-kimagemapeditor-fa \
locale-kimagemapeditor-fi \
locale-kimagemapeditor-fr \
locale-kimagemapeditor-ga \
locale-kimagemapeditor-gl \
locale-kimagemapeditor-he \
locale-kimagemapeditor-hi \
locale-kimagemapeditor-hr \
locale-kimagemapeditor-hu \
locale-kimagemapeditor-ia \
locale-kimagemapeditor-it \
locale-kimagemapeditor-ja \
locale-kimagemapeditor-ka \
locale-kimagemapeditor-kk \
locale-kimagemapeditor-km \
locale-kimagemapeditor-ko \
locale-kimagemapeditor-lt \
locale-kimagemapeditor-lv \
locale-kimagemapeditor-mr \
locale-kimagemapeditor-ms \
locale-kimagemapeditor-nb \
locale-kimagemapeditor-nds \
locale-kimagemapeditor-ne \
locale-kimagemapeditor-nl \
locale-kimagemapeditor-nn \
locale-kimagemapeditor-oc \
locale-kimagemapeditor-pa \
locale-kimagemapeditor-pl \
locale-kimagemapeditor-pt \
locale-kimagemapeditor-pt-BR \
locale-kimagemapeditor-ro \
locale-kimagemapeditor-ru \
locale-kimagemapeditor-sk \
locale-kimagemapeditor-sl \
locale-kimagemapeditor-sv \
locale-kimagemapeditor-ta \
locale-kimagemapeditor-tr \
locale-kimagemapeditor-ug \
locale-kimagemapeditor-uk \
locale-kimagemapeditor-zh-CN \
locale-kimagemapeditor-zh-HK \
locale-kimagemapeditor-zh-TW"

RDEPENDS:${PN} += "kimagemapeditor"

inherit rpm
