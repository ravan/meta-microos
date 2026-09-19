SUMMARY = "Translations for package gummi"
DESCRIPTION = "Provides translations for the 'gummi' package."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "gummi-lang-0.8.3-3.6.noarch.rpm"
RPM_HASH = "c5add394c5a5ecf005b161ddadd673a22abe0d658ecc218a067a0195db0baef1a3304c7721d94386cd8ba4c9a56b9ff6681d0d3f59bd50a78929e089f6d1a4e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gummi-lang \
gummi-lang-all \
locale-gummi-ar \
locale-gummi-ca \
locale-gummi-cs \
locale-gummi-da \
locale-gummi-de \
locale-gummi-el \
locale-gummi-es \
locale-gummi-fr \
locale-gummi-hu \
locale-gummi-it \
locale-gummi-nl \
locale-gummi-pl \
locale-gummi-pt \
locale-gummi-pt-BR \
locale-gummi-ro \
locale-gummi-ru \
locale-gummi-sv \
locale-gummi-zh-CN \
locale-gummi-zh-TW"

RDEPENDS:${PN} += "gummi"

inherit rpm
