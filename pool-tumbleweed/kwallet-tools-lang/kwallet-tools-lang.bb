SUMMARY = "Translations for package kwallet-tools"
DESCRIPTION = "Provides translations for the 'kwallet-tools' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kwallet-tools-lang-5.116.0-2.9.noarch.rpm"
RPM_HASH = "cce6b1345fd5929639ea00a5ae8ffbde053b198b3af4f3ddcae16ce541bf7f10e9f8481802863d33ef449d6c3b4b32355183cc89efe9f759ee431e40f9361525"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kwallet-tools-lang \
kwallet-tools-lang-all \
locale-kwallet-tools-ar \
locale-kwallet-tools-az \
locale-kwallet-tools-bg \
locale-kwallet-tools-ca \
locale-kwallet-tools-ca@valencia \
locale-kwallet-tools-cs \
locale-kwallet-tools-da \
locale-kwallet-tools-de \
locale-kwallet-tools-el \
locale-kwallet-tools-en-GB \
locale-kwallet-tools-eo \
locale-kwallet-tools-es \
locale-kwallet-tools-et \
locale-kwallet-tools-eu \
locale-kwallet-tools-fi \
locale-kwallet-tools-fr \
locale-kwallet-tools-gd \
locale-kwallet-tools-gl \
locale-kwallet-tools-he \
locale-kwallet-tools-hu \
locale-kwallet-tools-ia \
locale-kwallet-tools-id \
locale-kwallet-tools-it \
locale-kwallet-tools-ja \
locale-kwallet-tools-ka \
locale-kwallet-tools-ko \
locale-kwallet-tools-lt \
locale-kwallet-tools-ml \
locale-kwallet-tools-nl \
locale-kwallet-tools-nn \
locale-kwallet-tools-pa \
locale-kwallet-tools-pl \
locale-kwallet-tools-pt \
locale-kwallet-tools-pt-BR \
locale-kwallet-tools-ro \
locale-kwallet-tools-ru \
locale-kwallet-tools-sk \
locale-kwallet-tools-sl \
locale-kwallet-tools-sr \
locale-kwallet-tools-sr@ijekavian \
locale-kwallet-tools-sr@ijekavianlatin \
locale-kwallet-tools-sr@latin \
locale-kwallet-tools-sv \
locale-kwallet-tools-tr \
locale-kwallet-tools-uk \
locale-kwallet-tools-vi \
locale-kwallet-tools-zh-CN \
locale-kwallet-tools-zh-TW"

RDEPENDS:${PN} += "kwallet-tools"

inherit rpm
