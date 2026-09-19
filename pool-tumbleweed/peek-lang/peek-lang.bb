SUMMARY = "Translations for package peek"
DESCRIPTION = "Provides translations for the 'peek' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "peek-lang-1.5.1-2.44.noarch.rpm"
RPM_HASH = "ac77da7d8ae1350f9b84f55205d9c2da042faae729e4ea06b96fb8f9edd4ab78a7a0a1fea252f547d07693cc8e7db23951ed17babbc71d82109771d0b4ef11d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-peek-ar \
locale-peek-ca \
locale-peek-cs \
locale-peek-de \
locale-peek-el \
locale-peek-eo \
locale-peek-es \
locale-peek-eu \
locale-peek-fi \
locale-peek-fr \
locale-peek-he \
locale-peek-hr \
locale-peek-id \
locale-peek-it \
locale-peek-ja \
locale-peek-kn \
locale-peek-ko \
locale-peek-lt \
locale-peek-nb \
locale-peek-nl \
locale-peek-pl \
locale-peek-pt-BR \
locale-peek-pt-PT \
locale-peek-ru \
locale-peek-sr \
locale-peek-sv \
locale-peek-tr \
locale-peek-uk-UA \
locale-peek-zh-CN \
locale-peek-zh-TW \
peek-lang \
peek-lang-all"

RDEPENDS:${PN} += "peek"

inherit rpm
