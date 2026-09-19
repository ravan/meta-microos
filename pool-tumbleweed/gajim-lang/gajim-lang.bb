SUMMARY = "Translations for package gajim"
DESCRIPTION = "Provides translations for the 'gajim' package."
LICENSE = "GPL-3.0-only"

PV = "2.4.6"

RPM_NAME = "gajim-lang-2.4.6-1.2.noarch.rpm"
RPM_HASH = "2b5f39ad976daaf0fc9dd22bb88e7d46ecb2fe240e53fd41046c032bf99c396b1de867b32a7d0057aad02ea75ff2c65c849dd821e1eadd4f66bdea2bbbafa598"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gajim-lang \
gajim-lang-all \
locale-gajim-ar \
locale-gajim-be \
locale-gajim-be@latin \
locale-gajim-bg \
locale-gajim-br \
locale-gajim-ca \
locale-gajim-cs \
locale-gajim-da \
locale-gajim-de \
locale-gajim-el \
locale-gajim-en-GB \
locale-gajim-eo \
locale-gajim-es \
locale-gajim-eu \
locale-gajim-fa \
locale-gajim-fr \
locale-gajim-gl \
locale-gajim-he \
locale-gajim-hr \
locale-gajim-hu \
locale-gajim-it \
locale-gajim-ja \
locale-gajim-kk \
locale-gajim-ko \
locale-gajim-lt \
locale-gajim-nb-NO \
locale-gajim-nl \
locale-gajim-pl \
locale-gajim-pt \
locale-gajim-pt-BR \
locale-gajim-ro \
locale-gajim-ru \
locale-gajim-sk \
locale-gajim-sr \
locale-gajim-sv \
locale-gajim-tr \
locale-gajim-uk \
locale-gajim-zh-CN \
locale-gajim-zh-TW"

RDEPENDS:${PN} += "gajim"

inherit rpm
