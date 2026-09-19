SUMMARY = "Translations for package kaddressbook"
DESCRIPTION = "Provides translations for the 'kaddressbook' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kaddressbook-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "44430b82dd452f3535fcf19dd2f30b95841dd55ab3add91e967fb8b9abb838dd9682eaab1a18b58950254b97fc06f31eb2efa14bd1f6aa518ec636715243689f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kaddressbook-lang \
kaddressbook-lang-all \
locale-kaddressbook-af \
locale-kaddressbook-ar \
locale-kaddressbook-ast \
locale-kaddressbook-az \
locale-kaddressbook-be \
locale-kaddressbook-bg \
locale-kaddressbook-bn \
locale-kaddressbook-br \
locale-kaddressbook-bs \
locale-kaddressbook-ca \
locale-kaddressbook-ca@valencia \
locale-kaddressbook-cs \
locale-kaddressbook-cy \
locale-kaddressbook-da \
locale-kaddressbook-de \
locale-kaddressbook-el \
locale-kaddressbook-en-GB \
locale-kaddressbook-eo \
locale-kaddressbook-es \
locale-kaddressbook-et \
locale-kaddressbook-eu \
locale-kaddressbook-fa \
locale-kaddressbook-fi \
locale-kaddressbook-fr \
locale-kaddressbook-ga \
locale-kaddressbook-gl \
locale-kaddressbook-he \
locale-kaddressbook-hi \
locale-kaddressbook-hr \
locale-kaddressbook-hu \
locale-kaddressbook-ia \
locale-kaddressbook-is \
locale-kaddressbook-it \
locale-kaddressbook-ja \
locale-kaddressbook-ka \
locale-kaddressbook-kk \
locale-kaddressbook-km \
locale-kaddressbook-ko \
locale-kaddressbook-lt \
locale-kaddressbook-lv \
locale-kaddressbook-mai \
locale-kaddressbook-mk \
locale-kaddressbook-mr \
locale-kaddressbook-ms \
locale-kaddressbook-nb \
locale-kaddressbook-nds \
locale-kaddressbook-ne \
locale-kaddressbook-nl \
locale-kaddressbook-nn \
locale-kaddressbook-pa \
locale-kaddressbook-pl \
locale-kaddressbook-pt \
locale-kaddressbook-pt-BR \
locale-kaddressbook-ro \
locale-kaddressbook-ru \
locale-kaddressbook-sk \
locale-kaddressbook-sl \
locale-kaddressbook-sq \
locale-kaddressbook-sr \
locale-kaddressbook-sr@ijekavian \
locale-kaddressbook-sr@ijekavianlatin \
locale-kaddressbook-sr@latin \
locale-kaddressbook-sv \
locale-kaddressbook-ta \
locale-kaddressbook-th \
locale-kaddressbook-tr \
locale-kaddressbook-ug \
locale-kaddressbook-uk \
locale-kaddressbook-vi \
locale-kaddressbook-zh-CN \
locale-kaddressbook-zh-TW"

RDEPENDS:${PN} += "kaddressbook"

inherit rpm
