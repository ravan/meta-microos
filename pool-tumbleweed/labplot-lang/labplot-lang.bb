SUMMARY = "Translations for package labplot"
DESCRIPTION = "Provides translations for the 'labplot' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.12.1"

RPM_NAME = "labplot-lang-2.12.1-3.12.noarch.rpm"
RPM_HASH = "4763f9be3e64e51bd1d8f19874d66c5e75fdf3a0e1944a513b4575bdaf0104f5c5ca5912d50e156297282a25f7e81e8e6e4e1ec4ddff821e813552a7941feed6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "labplot-lang \
labplot-lang-all \
locale-labplot-ar \
locale-labplot-ca \
locale-labplot-ca@valencia \
locale-labplot-cs \
locale-labplot-de \
locale-labplot-es \
locale-labplot-eu \
locale-labplot-fi \
locale-labplot-fr \
locale-labplot-gl \
locale-labplot-it \
locale-labplot-ka \
locale-labplot-nl \
locale-labplot-pl \
locale-labplot-pt-BR \
locale-labplot-sl \
locale-labplot-sv \
locale-labplot-tr \
locale-labplot-uk \
locale-labplot-zh-CN"

RDEPENDS:${PN} += "labplot"

inherit rpm
