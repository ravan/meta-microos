SUMMARY = "Translations for package tilix"
DESCRIPTION = "Provides translations for the 'tilix' package."
LICENSE = "LGPL-3.0-only & MPL-2.0"

PV = "1.9.6"

RPM_NAME = "tilix-lang-1.9.6-2.9.noarch.rpm"
RPM_HASH = "763d0f9a59a2b8fa03249f37a1279ebb88255ca5a55f4d542b2ccb26772129728697d363237dc577696fabe7f95efb4b332c255813d7042c67dff63aebae8ff2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tilix-ar \
locale-tilix-bg \
locale-tilix-ca \
locale-tilix-cs \
locale-tilix-de \
locale-tilix-el \
locale-tilix-en-GB \
locale-tilix-eo \
locale-tilix-es \
locale-tilix-eu \
locale-tilix-fi \
locale-tilix-fr \
locale-tilix-gl \
locale-tilix-he \
locale-tilix-hr \
locale-tilix-hu \
locale-tilix-id \
locale-tilix-is \
locale-tilix-it \
locale-tilix-ja \
locale-tilix-ko \
locale-tilix-lt \
locale-tilix-mr \
locale-tilix-nb-NO \
locale-tilix-ne \
locale-tilix-nl \
locale-tilix-oc \
locale-tilix-pl \
locale-tilix-pt-BR \
locale-tilix-pt-PT \
locale-tilix-ro \
locale-tilix-ru \
locale-tilix-sr \
locale-tilix-sv \
locale-tilix-tr \
locale-tilix-uk \
locale-tilix-vi \
locale-tilix-zh-CN \
locale-tilix-zh-TW \
tilix-lang \
tilix-lang-all"

RDEPENDS:${PN} += "tilix"

inherit rpm
