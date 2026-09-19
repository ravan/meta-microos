SUMMARY = "Translations for package eiciel"
DESCRIPTION = "Provides translations for the 'eiciel' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "eiciel-lang-0.10.1-1.4.noarch.rpm"
RPM_HASH = "f407abbf5ffd3b42e5774002917c44873c331b9757c5fea69970ecda5fd8363578fe769f69e2fc9c0ce2fd25fe2a3cdea18eec609f6678b40f9312d2c03a2062"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eiciel-lang \
eiciel-lang-all \
locale-eiciel-ar \
locale-eiciel-ca \
locale-eiciel-cs \
locale-eiciel-da \
locale-eiciel-de \
locale-eiciel-es \
locale-eiciel-fa \
locale-eiciel-fr \
locale-eiciel-hi \
locale-eiciel-hu \
locale-eiciel-id \
locale-eiciel-it \
locale-eiciel-ja \
locale-eiciel-ko \
locale-eiciel-nl \
locale-eiciel-nn \
locale-eiciel-pl \
locale-eiciel-pt-BR \
locale-eiciel-ru \
locale-eiciel-sv \
locale-eiciel-uk \
locale-eiciel-zh-CN \
locale-eiciel-zh-TW"

RDEPENDS:${PN} += "eiciel"

inherit rpm
