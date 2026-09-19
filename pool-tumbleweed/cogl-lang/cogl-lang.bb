SUMMARY = "Translations for package cogl"
DESCRIPTION = "Provides translations for the 'cogl' package."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "cogl-lang-1.22.8-3.7.noarch.rpm"
RPM_HASH = "febf15c63257b54f9c0dcd655b5399a6af680cb7be9cec386bc1b9c17523e4ba078549c53e3df5643d139bbe8cffd834480eb9e8c3f172369987f6bd3fd0501c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cogl-lang \
cogl-lang-all \
locale-cogl-ar \
locale-cogl-as \
locale-cogl-ast \
locale-cogl-be \
locale-cogl-bg \
locale-cogl-bs \
locale-cogl-ca \
locale-cogl-ca@valencia \
locale-cogl-cs \
locale-cogl-da \
locale-cogl-de \
locale-cogl-el \
locale-cogl-en-CA \
locale-cogl-en-GB \
locale-cogl-eo \
locale-cogl-es \
locale-cogl-eu \
locale-cogl-fa \
locale-cogl-fi \
locale-cogl-fr \
locale-cogl-fur \
locale-cogl-gl \
locale-cogl-he \
locale-cogl-hi \
locale-cogl-hr \
locale-cogl-hu \
locale-cogl-id \
locale-cogl-it \
locale-cogl-ja \
locale-cogl-km \
locale-cogl-kn \
locale-cogl-ko \
locale-cogl-lt \
locale-cogl-lv \
locale-cogl-ml \
locale-cogl-ms \
locale-cogl-nb \
locale-cogl-ne \
locale-cogl-nl \
locale-cogl-oc \
locale-cogl-or \
locale-cogl-pa \
locale-cogl-pl \
locale-cogl-pt \
locale-cogl-pt-BR \
locale-cogl-ro \
locale-cogl-ru \
locale-cogl-sk \
locale-cogl-sl \
locale-cogl-sr \
locale-cogl-sr@latin \
locale-cogl-sv \
locale-cogl-ta \
locale-cogl-te \
locale-cogl-th \
locale-cogl-tr \
locale-cogl-ug \
locale-cogl-uk \
locale-cogl-vi \
locale-cogl-zh-CN \
locale-cogl-zh-HK \
locale-cogl-zh-TW"

RDEPENDS:${PN} += "cogl"

inherit rpm
