SUMMARY = "Translations for package optiimage"
DESCRIPTION = "Provides translations for the 'optiimage' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0"

RPM_NAME = "optiimage-lang-1.0.0-1.11.noarch.rpm"
RPM_HASH = "dd0fbcb9e743013a528d7d8e480484ba9aae8b987cbee64862418c2d3dd86c88d66f314242c6997fd9da6af1fe72a448958a8c92a819dccd6cdfd0a7b528ee21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-optiimage-ast \
locale-optiimage-ca \
locale-optiimage-ca@valencia \
locale-optiimage-cs \
locale-optiimage-de \
locale-optiimage-en-GB \
locale-optiimage-eo \
locale-optiimage-es \
locale-optiimage-eu \
locale-optiimage-fi \
locale-optiimage-fr \
locale-optiimage-gl \
locale-optiimage-he \
locale-optiimage-ia \
locale-optiimage-it \
locale-optiimage-ka \
locale-optiimage-ko \
locale-optiimage-lv \
locale-optiimage-nl \
locale-optiimage-pl \
locale-optiimage-sk \
locale-optiimage-sl \
locale-optiimage-sv \
locale-optiimage-tr \
locale-optiimage-uk \
locale-optiimage-zh-CN \
locale-optiimage-zh-TW \
optiimage-lang \
optiimage-lang-all"

RDEPENDS:${PN} += "optiimage"

inherit rpm
