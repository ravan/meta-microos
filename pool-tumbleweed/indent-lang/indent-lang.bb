SUMMARY = "Translations for package indent"
DESCRIPTION = "Provides translations for the 'indent' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.13"

RPM_NAME = "indent-lang-2.2.13-3.11.noarch.rpm"
RPM_HASH = "01385505eed99a0c06724bd40e6d5dcbae7bffbce2b04133bc4cb53d235ef4eed298b360ec8740a066a8216016837479350b315df4afd93069dbd797dfeee0bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "indent-lang \
indent-lang-all \
locale-indent-bg \
locale-indent-ca \
locale-indent-cs \
locale-indent-da \
locale-indent-de \
locale-indent-el \
locale-indent-eo \
locale-indent-es \
locale-indent-et \
locale-indent-eu \
locale-indent-fi \
locale-indent-fr \
locale-indent-ga \
locale-indent-gl \
locale-indent-hr \
locale-indent-hu \
locale-indent-id \
locale-indent-it \
locale-indent-ja \
locale-indent-ko \
locale-indent-nl \
locale-indent-pl \
locale-indent-pt-BR \
locale-indent-ro \
locale-indent-ru \
locale-indent-sk \
locale-indent-sr \
locale-indent-sv \
locale-indent-tr \
locale-indent-uk \
locale-indent-vi \
locale-indent-zh-CN \
locale-indent-zh-TW"

RDEPENDS:${PN} += "indent"

inherit rpm
