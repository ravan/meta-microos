SUMMARY = "Translations for package calindori"
DESCRIPTION = "Provides translations for the 'calindori' package."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "calindori-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "691e773b6df6d2ebc8471e7502eb1ef529b47804126dc9f391f3a5a8c90ae4a7426ec5d7ab97089a9d527110eda262483d65c0a04092c7f6ce82545643815584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calindori-lang \
calindori-lang-all \
locale-calindori-ar \
locale-calindori-ca \
locale-calindori-ca@valencia \
locale-calindori-cs \
locale-calindori-da \
locale-calindori-de \
locale-calindori-el \
locale-calindori-en-GB \
locale-calindori-eo \
locale-calindori-es \
locale-calindori-et \
locale-calindori-eu \
locale-calindori-fi \
locale-calindori-fr \
locale-calindori-ga \
locale-calindori-gl \
locale-calindori-he \
locale-calindori-hi \
locale-calindori-hu \
locale-calindori-ia \
locale-calindori-it \
locale-calindori-ja \
locale-calindori-ka \
locale-calindori-ko \
locale-calindori-lt \
locale-calindori-lv \
locale-calindori-nl \
locale-calindori-nn \
locale-calindori-pa \
locale-calindori-pl \
locale-calindori-pt \
locale-calindori-pt-BR \
locale-calindori-ru \
locale-calindori-sk \
locale-calindori-sl \
locale-calindori-sv \
locale-calindori-tr \
locale-calindori-ug \
locale-calindori-uk \
locale-calindori-zh-CN \
locale-calindori-zh-TW"

RDEPENDS:${PN} += "calindori"

inherit rpm
