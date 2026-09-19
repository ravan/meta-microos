SUMMARY = "Translations for package labwc"
DESCRIPTION = "Provides translations for the 'labwc' package."
LICENSE = "GPL-2.0-only"

PV = "0.20.2"

RPM_NAME = "labwc-lang-0.20.2-1.1.noarch.rpm"
RPM_HASH = "403ea72b3d83c7b33c046279f123c42bedb15c0a820152a04ea36faab3acd745290d156dc5698bfbc436f70363a74247e1d29d8e76fa4bc1e61065b192cc6bb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "labwc-lang \
labwc-lang-all \
locale-labwc-ar \
locale-labwc-ca \
locale-labwc-cs \
locale-labwc-da \
locale-labwc-de \
locale-labwc-el \
locale-labwc-es \
locale-labwc-et \
locale-labwc-eu \
locale-labwc-fa \
locale-labwc-fi \
locale-labwc-fr \
locale-labwc-gl \
locale-labwc-he \
locale-labwc-hr \
locale-labwc-hu \
locale-labwc-id \
locale-labwc-it \
locale-labwc-ja \
locale-labwc-ka \
locale-labwc-kk \
locale-labwc-ko \
locale-labwc-lt \
locale-labwc-ms \
locale-labwc-nl \
locale-labwc-pa \
locale-labwc-pl \
locale-labwc-pt \
locale-labwc-pt-BR \
locale-labwc-ru \
locale-labwc-sk \
locale-labwc-sv \
locale-labwc-te \
locale-labwc-tr \
locale-labwc-uk \
locale-labwc-vi \
locale-labwc-zh-CN \
locale-labwc-zh-TW"

RDEPENDS:${PN} += "labwc"

inherit rpm
