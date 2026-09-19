SUMMARY = "Translations for package plasma6-bigscreen"
DESCRIPTION = "Provides translations for the 'plasma6-bigscreen' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-bigscreen-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "26076f02f7c3f467c3c29dd92b035a781a3d9278b25851994fac2afe9cc87d538a5a53c0d9b5883bd6e808dc428beabee983953fd4d32bad8cafa84415c6094e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma6-bigscreen-ar \
locale-plasma6-bigscreen-ast \
locale-plasma6-bigscreen-az \
locale-plasma6-bigscreen-bg \
locale-plasma6-bigscreen-ca \
locale-plasma6-bigscreen-ca@valencia \
locale-plasma6-bigscreen-cs \
locale-plasma6-bigscreen-da \
locale-plasma6-bigscreen-de \
locale-plasma6-bigscreen-el \
locale-plasma6-bigscreen-en-GB \
locale-plasma6-bigscreen-eo \
locale-plasma6-bigscreen-es \
locale-plasma6-bigscreen-et \
locale-plasma6-bigscreen-eu \
locale-plasma6-bigscreen-fi \
locale-plasma6-bigscreen-fr \
locale-plasma6-bigscreen-ga \
locale-plasma6-bigscreen-gl \
locale-plasma6-bigscreen-he \
locale-plasma6-bigscreen-hi \
locale-plasma6-bigscreen-hu \
locale-plasma6-bigscreen-ia \
locale-plasma6-bigscreen-id \
locale-plasma6-bigscreen-is \
locale-plasma6-bigscreen-it \
locale-plasma6-bigscreen-ja \
locale-plasma6-bigscreen-ka \
locale-plasma6-bigscreen-ko \
locale-plasma6-bigscreen-lt \
locale-plasma6-bigscreen-lv \
locale-plasma6-bigscreen-nl \
locale-plasma6-bigscreen-nn \
locale-plasma6-bigscreen-pa \
locale-plasma6-bigscreen-pl \
locale-plasma6-bigscreen-pt \
locale-plasma6-bigscreen-pt-BR \
locale-plasma6-bigscreen-ro \
locale-plasma6-bigscreen-ru \
locale-plasma6-bigscreen-sk \
locale-plasma6-bigscreen-sl \
locale-plasma6-bigscreen-sv \
locale-plasma6-bigscreen-ta \
locale-plasma6-bigscreen-tr \
locale-plasma6-bigscreen-uk \
locale-plasma6-bigscreen-zh-CN \
locale-plasma6-bigscreen-zh-TW \
plasma6-bigscreen-lang \
plasma6-bigscreen-lang-all"

RDEPENDS:${PN} += "plasma6-bigscreen"

inherit rpm
