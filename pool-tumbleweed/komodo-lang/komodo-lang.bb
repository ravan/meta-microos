SUMMARY = "Translations for package komodo"
DESCRIPTION = "Provides translations for the 'komodo' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.0"

RPM_NAME = "komodo-lang-1.5.0-1.9.noarch.rpm"
RPM_HASH = "f052fccf5a2d458e99c976b3a4ec6346ac55a8a1b436f5208b2b3a02a959a569a98aa4899273ba985e9ea6f40b5d059da828dcf8e35de90df170b999ed04626a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "komodo-lang \
komodo-lang-all \
locale-komodo-ca \
locale-komodo-ca@valencia \
locale-komodo-de \
locale-komodo-es \
locale-komodo-eu \
locale-komodo-fi \
locale-komodo-fr \
locale-komodo-he \
locale-komodo-it \
locale-komodo-ka \
locale-komodo-lt \
locale-komodo-nl \
locale-komodo-pt-BR \
locale-komodo-sl \
locale-komodo-sv \
locale-komodo-tr \
locale-komodo-uk \
locale-komodo-zh-CN"

RDEPENDS:${PN} += "komodo"

inherit rpm
