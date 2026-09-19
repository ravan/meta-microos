SUMMARY = "Translations for package kdevelop-plugin-python3"
DESCRIPTION = "Provides translations to the package kdevelop-plugin-python3"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdevelop-plugin-python3-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "99bd8c82df818707df247a6936df2f8a55298c74fa03bc59d3064a8473e73897a4cb421945ca7faff930bc9e4f9953ab40f30a762d9ce4e5cc4d2dc902995ed7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdevelop-plugin-python3-lang \
kdevelop-plugin-python3-lang-all \
locale-kdevelop-plugin-python3-ar \
locale-kdevelop-plugin-python3-bs \
locale-kdevelop-plugin-python3-ca \
locale-kdevelop-plugin-python3-ca@valencia \
locale-kdevelop-plugin-python3-cs \
locale-kdevelop-plugin-python3-da \
locale-kdevelop-plugin-python3-de \
locale-kdevelop-plugin-python3-en-GB \
locale-kdevelop-plugin-python3-eo \
locale-kdevelop-plugin-python3-es \
locale-kdevelop-plugin-python3-et \
locale-kdevelop-plugin-python3-eu \
locale-kdevelop-plugin-python3-fi \
locale-kdevelop-plugin-python3-fr \
locale-kdevelop-plugin-python3-ga \
locale-kdevelop-plugin-python3-gl \
locale-kdevelop-plugin-python3-he \
locale-kdevelop-plugin-python3-hi \
locale-kdevelop-plugin-python3-hu \
locale-kdevelop-plugin-python3-ia \
locale-kdevelop-plugin-python3-it \
locale-kdevelop-plugin-python3-ja \
locale-kdevelop-plugin-python3-ka \
locale-kdevelop-plugin-python3-kk \
locale-kdevelop-plugin-python3-ko \
locale-kdevelop-plugin-python3-lt \
locale-kdevelop-plugin-python3-mai \
locale-kdevelop-plugin-python3-mr \
locale-kdevelop-plugin-python3-nds \
locale-kdevelop-plugin-python3-nl \
locale-kdevelop-plugin-python3-nn \
locale-kdevelop-plugin-python3-pl \
locale-kdevelop-plugin-python3-pt \
locale-kdevelop-plugin-python3-pt-BR \
locale-kdevelop-plugin-python3-ro \
locale-kdevelop-plugin-python3-ru \
locale-kdevelop-plugin-python3-sk \
locale-kdevelop-plugin-python3-sl \
locale-kdevelop-plugin-python3-sv \
locale-kdevelop-plugin-python3-th \
locale-kdevelop-plugin-python3-tr \
locale-kdevelop-plugin-python3-ug \
locale-kdevelop-plugin-python3-uk \
locale-kdevelop-plugin-python3-zh-CN \
locale-kdevelop-plugin-python3-zh-TW"

RDEPENDS:${PN} += "kdevelop-plugin-python3"

inherit rpm
