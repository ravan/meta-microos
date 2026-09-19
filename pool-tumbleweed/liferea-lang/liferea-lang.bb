SUMMARY = "Translations for package liferea"
DESCRIPTION = "Provides translations for the 'liferea' package."
LICENSE = "GPL-2.0-only"

PV = "2.0.1"

RPM_NAME = "liferea-lang-2.0.1-1.1.noarch.rpm"
RPM_HASH = "e1665b665be3a45c8a6791a483ca0249db59437c4fa799661265b43e4bda50620482cde9b81724ff40f7b6e8b86e86ddb64aa9c499fa4838a5d60c55b9a2cdc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liferea-lang \
liferea-lang-all \
locale-liferea-ar \
locale-liferea-ast \
locale-liferea-be@latin \
locale-liferea-bg \
locale-liferea-ca \
locale-liferea-cs \
locale-liferea-da \
locale-liferea-de \
locale-liferea-el \
locale-liferea-en-GB \
locale-liferea-es \
locale-liferea-eu \
locale-liferea-fi \
locale-liferea-fr \
locale-liferea-gl \
locale-liferea-he \
locale-liferea-hu \
locale-liferea-id \
locale-liferea-it \
locale-liferea-ja \
locale-liferea-ka \
locale-liferea-ko \
locale-liferea-lt \
locale-liferea-lv \
locale-liferea-mk \
locale-liferea-nl \
locale-liferea-pl \
locale-liferea-pt \
locale-liferea-pt-BR \
locale-liferea-ro \
locale-liferea-ru \
locale-liferea-sk \
locale-liferea-sq \
locale-liferea-sv \
locale-liferea-te \
locale-liferea-tr \
locale-liferea-uk \
locale-liferea-vi \
locale-liferea-zh-CN \
locale-liferea-zh-TW"

RDEPENDS:${PN} += "liferea"

inherit rpm
