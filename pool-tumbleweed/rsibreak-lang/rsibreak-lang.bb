SUMMARY = "Translations for package rsibreak"
DESCRIPTION = "Provides translations for the 'rsibreak' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.0"

RPM_NAME = "rsibreak-lang-0.13.0-1.9.noarch.rpm"
RPM_HASH = "4863ba9d4ea6e35412c73509c95ce3ea5797dba4ca77743109adca2a590a999676479b27624e732dc3723c51cc66ad0d787c4629b42dd1fc3c267cfa5b17f078"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-rsibreak-ar \
locale-rsibreak-be \
locale-rsibreak-bg \
locale-rsibreak-bs \
locale-rsibreak-ca \
locale-rsibreak-ca@valencia \
locale-rsibreak-cs \
locale-rsibreak-da \
locale-rsibreak-de \
locale-rsibreak-el \
locale-rsibreak-en-GB \
locale-rsibreak-eo \
locale-rsibreak-es \
locale-rsibreak-et \
locale-rsibreak-eu \
locale-rsibreak-fi \
locale-rsibreak-fr \
locale-rsibreak-ga \
locale-rsibreak-gl \
locale-rsibreak-he \
locale-rsibreak-hi \
locale-rsibreak-hr \
locale-rsibreak-hu \
locale-rsibreak-ia \
locale-rsibreak-id \
locale-rsibreak-is \
locale-rsibreak-it \
locale-rsibreak-ja \
locale-rsibreak-ka \
locale-rsibreak-km \
locale-rsibreak-ko \
locale-rsibreak-lt \
locale-rsibreak-mai \
locale-rsibreak-nb \
locale-rsibreak-nds \
locale-rsibreak-nl \
locale-rsibreak-nn \
locale-rsibreak-oc \
locale-rsibreak-pl \
locale-rsibreak-pt \
locale-rsibreak-pt-BR \
locale-rsibreak-ro \
locale-rsibreak-ru \
locale-rsibreak-sk \
locale-rsibreak-sl \
locale-rsibreak-sv \
locale-rsibreak-ta \
locale-rsibreak-tr \
locale-rsibreak-ug \
locale-rsibreak-uk \
locale-rsibreak-zh-CN \
locale-rsibreak-zh-TW \
rsibreak-lang \
rsibreak-lang-all"

RDEPENDS:${PN} += "rsibreak"

inherit rpm
