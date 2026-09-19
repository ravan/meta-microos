SUMMARY = "Translations for package kommit"
DESCRIPTION = "Provides translations for the 'kommit' package."
LICENSE = "GPL-3.0-only"

PV = "1.7.1"

RPM_NAME = "kommit-lang-1.7.1-1.4.noarch.rpm"
RPM_HASH = "c8115e61b952d7da6612012966aa1645aee325a5f26fe29b1d385b8167eab3c682128d27a718876086fb135962cc416e0d5e14c7d8a6aedfe2e008b97f30f655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kommit-lang \
kommit-lang-all \
locale-kommit-ca \
locale-kommit-ca@valencia \
locale-kommit-cs \
locale-kommit-de \
locale-kommit-en-GB \
locale-kommit-eo \
locale-kommit-es \
locale-kommit-eu \
locale-kommit-fi \
locale-kommit-fr \
locale-kommit-gl \
locale-kommit-it \
locale-kommit-ja \
locale-kommit-ka \
locale-kommit-ko \
locale-kommit-lt \
locale-kommit-nl \
locale-kommit-pl \
locale-kommit-pt \
locale-kommit-pt-BR \
locale-kommit-sk \
locale-kommit-sl \
locale-kommit-sv \
locale-kommit-tr \
locale-kommit-uk \
locale-kommit-zh-CN \
locale-kommit-zh-TW"

RDEPENDS:${PN} += "kommit"

inherit rpm
