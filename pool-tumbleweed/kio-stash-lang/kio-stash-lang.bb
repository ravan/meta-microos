SUMMARY = "Translations for package kio-stash"
DESCRIPTION = "Provides translations for the 'kio-stash' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.0git.20250301T021103~51f07b6"

RPM_NAME = "kio-stash-lang-1.0git.20250301T021103~51f07b6-1.5.noarch.rpm"
RPM_HASH = "9610a3e54a52635a98076be31f70d97e48cea3af7d7bd9e8a2040dfae8f7a7e89baf9e733cc1c49a449cd65f597433f805fb371d518513f1fd1e4a8b477bfde6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kio-stash-lang \
kio-stash-lang-all \
locale-kio-stash-ar \
locale-kio-stash-be \
locale-kio-stash-ca \
locale-kio-stash-ca@valencia \
locale-kio-stash-cs \
locale-kio-stash-da \
locale-kio-stash-de \
locale-kio-stash-el \
locale-kio-stash-en-GB \
locale-kio-stash-eo \
locale-kio-stash-es \
locale-kio-stash-et \
locale-kio-stash-eu \
locale-kio-stash-fi \
locale-kio-stash-fr \
locale-kio-stash-gl \
locale-kio-stash-hi \
locale-kio-stash-it \
locale-kio-stash-ja \
locale-kio-stash-ka \
locale-kio-stash-ko \
locale-kio-stash-lt \
locale-kio-stash-nl \
locale-kio-stash-nn \
locale-kio-stash-pl \
locale-kio-stash-pt \
locale-kio-stash-pt-BR \
locale-kio-stash-ro \
locale-kio-stash-ru \
locale-kio-stash-sk \
locale-kio-stash-sl \
locale-kio-stash-sv \
locale-kio-stash-ta \
locale-kio-stash-tr \
locale-kio-stash-uk \
locale-kio-stash-zh-CN \
locale-kio-stash-zh-TW"

RDEPENDS:${PN} += "kio-stash"

inherit rpm
