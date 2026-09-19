SUMMARY = "Translations for package ktextaddons"
DESCRIPTION = "Provides translations for the 'ktextaddons' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.2"

RPM_NAME = "ktextaddons-lang-2.1.2-1.1.noarch.rpm"
RPM_HASH = "1d2e08fb1039361366b12905d0344c535f7400aa2768ec3c7af068dd5f02a1988eb7edefd7cc8aebe4359fe44e0eee87f36a97200b22f6143d07fc399bc04774"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktextaddons-lang \
ktextaddons-lang-all \
locale-ktextaddons-ar \
locale-ktextaddons-ast \
locale-ktextaddons-az \
locale-ktextaddons-bg \
locale-ktextaddons-ca \
locale-ktextaddons-ca@valencia \
locale-ktextaddons-cs \
locale-ktextaddons-da \
locale-ktextaddons-de \
locale-ktextaddons-en-GB \
locale-ktextaddons-eo \
locale-ktextaddons-es \
locale-ktextaddons-et \
locale-ktextaddons-eu \
locale-ktextaddons-fi \
locale-ktextaddons-fr \
locale-ktextaddons-ga \
locale-ktextaddons-gl \
locale-ktextaddons-he \
locale-ktextaddons-hi \
locale-ktextaddons-hu \
locale-ktextaddons-ia \
locale-ktextaddons-it \
locale-ktextaddons-ja \
locale-ktextaddons-ka \
locale-ktextaddons-ko \
locale-ktextaddons-lt \
locale-ktextaddons-nl \
locale-ktextaddons-nn \
locale-ktextaddons-pl \
locale-ktextaddons-pt \
locale-ktextaddons-pt-BR \
locale-ktextaddons-ro \
locale-ktextaddons-ru \
locale-ktextaddons-sk \
locale-ktextaddons-sl \
locale-ktextaddons-sv \
locale-ktextaddons-ta \
locale-ktextaddons-tr \
locale-ktextaddons-ug \
locale-ktextaddons-uk \
locale-ktextaddons-zh-CN \
locale-ktextaddons-zh-TW"

RDEPENDS:${PN} += "ktextaddons"

inherit rpm
