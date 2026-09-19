SUMMARY = "Translations for package plasma6-integration-plugin"
DESCRIPTION = "Provides translations for the 'plasma6-integration-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-integration-plugin-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "f77130848707238689b886e065da24c4e7cd1076060c5324e45bdc6554fd8edda662473e84d3f3276288f907c480078d827b6b2ea278c127f5b0a64eb0e62cd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma6-integration-plugin-ar \
locale-plasma6-integration-plugin-ast \
locale-plasma6-integration-plugin-az \
locale-plasma6-integration-plugin-bg \
locale-plasma6-integration-plugin-ca \
locale-plasma6-integration-plugin-ca@valencia \
locale-plasma6-integration-plugin-cs \
locale-plasma6-integration-plugin-da \
locale-plasma6-integration-plugin-de \
locale-plasma6-integration-plugin-el \
locale-plasma6-integration-plugin-en-GB \
locale-plasma6-integration-plugin-eo \
locale-plasma6-integration-plugin-es \
locale-plasma6-integration-plugin-et \
locale-plasma6-integration-plugin-eu \
locale-plasma6-integration-plugin-fi \
locale-plasma6-integration-plugin-fr \
locale-plasma6-integration-plugin-ga \
locale-plasma6-integration-plugin-gl \
locale-plasma6-integration-plugin-he \
locale-plasma6-integration-plugin-hi \
locale-plasma6-integration-plugin-hu \
locale-plasma6-integration-plugin-ia \
locale-plasma6-integration-plugin-id \
locale-plasma6-integration-plugin-is \
locale-plasma6-integration-plugin-it \
locale-plasma6-integration-plugin-ja \
locale-plasma6-integration-plugin-ka \
locale-plasma6-integration-plugin-ko \
locale-plasma6-integration-plugin-lt \
locale-plasma6-integration-plugin-lv \
locale-plasma6-integration-plugin-ml \
locale-plasma6-integration-plugin-nb \
locale-plasma6-integration-plugin-nl \
locale-plasma6-integration-plugin-nn \
locale-plasma6-integration-plugin-pa \
locale-plasma6-integration-plugin-pl \
locale-plasma6-integration-plugin-pt \
locale-plasma6-integration-plugin-pt-BR \
locale-plasma6-integration-plugin-ro \
locale-plasma6-integration-plugin-ru \
locale-plasma6-integration-plugin-sk \
locale-plasma6-integration-plugin-sl \
locale-plasma6-integration-plugin-sr \
locale-plasma6-integration-plugin-sr@ijekavian \
locale-plasma6-integration-plugin-sr@ijekavianlatin \
locale-plasma6-integration-plugin-sr@latin \
locale-plasma6-integration-plugin-sv \
locale-plasma6-integration-plugin-ta \
locale-plasma6-integration-plugin-tr \
locale-plasma6-integration-plugin-uk \
locale-plasma6-integration-plugin-vi \
locale-plasma6-integration-plugin-zh-CN \
locale-plasma6-integration-plugin-zh-TW \
plasma6-integration-plugin-lang \
plasma6-integration-plugin-lang-all"

RDEPENDS:${PN} += "plasma6-integration-plugin"

inherit rpm
