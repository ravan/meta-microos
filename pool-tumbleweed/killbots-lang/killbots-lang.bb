SUMMARY = "Translations for package killbots"
DESCRIPTION = "Provides translations for the 'killbots' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "killbots-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "0f76c9fb87109b6d4dd693bd5e98e23cebcae69398b957e6a91363171ccf01a08ece3bab0afed227b6d6cac6abe80a77334b4daa7f47ed0ea55b6758168f10eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "killbots-lang \
killbots-lang-all \
locale-killbots-ar \
locale-killbots-ast \
locale-killbots-bs \
locale-killbots-ca \
locale-killbots-ca@valencia \
locale-killbots-cs \
locale-killbots-da \
locale-killbots-de \
locale-killbots-el \
locale-killbots-en-GB \
locale-killbots-eo \
locale-killbots-es \
locale-killbots-et \
locale-killbots-eu \
locale-killbots-fi \
locale-killbots-fr \
locale-killbots-ga \
locale-killbots-gl \
locale-killbots-he \
locale-killbots-hi \
locale-killbots-hr \
locale-killbots-hu \
locale-killbots-ia \
locale-killbots-id \
locale-killbots-is \
locale-killbots-it \
locale-killbots-ja \
locale-killbots-ka \
locale-killbots-kk \
locale-killbots-km \
locale-killbots-ko \
locale-killbots-lt \
locale-killbots-lv \
locale-killbots-mai \
locale-killbots-ml \
locale-killbots-mr \
locale-killbots-nb \
locale-killbots-nds \
locale-killbots-nl \
locale-killbots-nn \
locale-killbots-pl \
locale-killbots-pt \
locale-killbots-pt-BR \
locale-killbots-ro \
locale-killbots-ru \
locale-killbots-sk \
locale-killbots-sl \
locale-killbots-sr \
locale-killbots-sr@ijekavian \
locale-killbots-sr@ijekavianlatin \
locale-killbots-sr@latin \
locale-killbots-sv \
locale-killbots-tr \
locale-killbots-ug \
locale-killbots-uk \
locale-killbots-zh-CN \
locale-killbots-zh-TW"

RDEPENDS:${PN} += "killbots"

inherit rpm
