SUMMARY = "Translations for package gitg"
DESCRIPTION = "Provides translations for the 'gitg' package."
LICENSE = "GPL-2.0-or-later"

PV = "50"

RPM_NAME = "gitg-lang-50-1.1.noarch.rpm"
RPM_HASH = "0672a9d53b7b5fad29a2eb65b992a597bb60c4941e17781f81f3c971b31feaec391d585854ef98c490bb7c04d11ee40d8bb157a82e402a46a731820bc146e5a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gitg-lang \
gitg-lang-all \
locale-gitg-as \
locale-gitg-bg \
locale-gitg-bs \
locale-gitg-ca \
locale-gitg-ca@valencia \
locale-gitg-cs \
locale-gitg-da \
locale-gitg-de \
locale-gitg-el \
locale-gitg-en-GB \
locale-gitg-eo \
locale-gitg-es \
locale-gitg-eu \
locale-gitg-fi \
locale-gitg-fr \
locale-gitg-fur \
locale-gitg-gl \
locale-gitg-he \
locale-gitg-hi \
locale-gitg-hr \
locale-gitg-hu \
locale-gitg-id \
locale-gitg-it \
locale-gitg-ja \
locale-gitg-ka \
locale-gitg-kk \
locale-gitg-ko \
locale-gitg-lt \
locale-gitg-lv \
locale-gitg-ml \
locale-gitg-ms \
locale-gitg-nb \
locale-gitg-ne \
locale-gitg-nl \
locale-gitg-oc \
locale-gitg-pa \
locale-gitg-pl \
locale-gitg-pt \
locale-gitg-pt-BR \
locale-gitg-ro \
locale-gitg-ru \
locale-gitg-sk \
locale-gitg-sl \
locale-gitg-sr \
locale-gitg-sr@latin \
locale-gitg-sv \
locale-gitg-ta \
locale-gitg-tr \
locale-gitg-uk \
locale-gitg-vi \
locale-gitg-zh-CN \
locale-gitg-zh-HK \
locale-gitg-zh-TW"

RDEPENDS:${PN} += "gitg"

inherit rpm
