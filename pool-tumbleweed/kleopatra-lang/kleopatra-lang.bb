SUMMARY = "Translations for package kleopatra"
DESCRIPTION = "Provides translations for the 'kleopatra' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kleopatra-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "1baed1e75fda7b798cbca3140e3314cd5eb7841ce6a0917e744093f8811591e78915a68b402feb89e60f877dc63a2205c044ca730f4ff48dd266c7a69a5177a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kleopatra-lang \
kleopatra-lang-all \
locale-kleopatra-af \
locale-kleopatra-ar \
locale-kleopatra-ast \
locale-kleopatra-be \
locale-kleopatra-bg \
locale-kleopatra-br \
locale-kleopatra-bs \
locale-kleopatra-ca \
locale-kleopatra-ca@valencia \
locale-kleopatra-cs \
locale-kleopatra-cy \
locale-kleopatra-da \
locale-kleopatra-de \
locale-kleopatra-el \
locale-kleopatra-en-GB \
locale-kleopatra-eo \
locale-kleopatra-es \
locale-kleopatra-et \
locale-kleopatra-eu \
locale-kleopatra-fa \
locale-kleopatra-fi \
locale-kleopatra-fr \
locale-kleopatra-ga \
locale-kleopatra-gl \
locale-kleopatra-he \
locale-kleopatra-hi \
locale-kleopatra-hr \
locale-kleopatra-hu \
locale-kleopatra-ia \
locale-kleopatra-is \
locale-kleopatra-it \
locale-kleopatra-ja \
locale-kleopatra-ka \
locale-kleopatra-kk \
locale-kleopatra-km \
locale-kleopatra-ko \
locale-kleopatra-lt \
locale-kleopatra-lv \
locale-kleopatra-mk \
locale-kleopatra-mr \
locale-kleopatra-ms \
locale-kleopatra-nb \
locale-kleopatra-nds \
locale-kleopatra-ne \
locale-kleopatra-nl \
locale-kleopatra-nn \
locale-kleopatra-pa \
locale-kleopatra-pl \
locale-kleopatra-pt \
locale-kleopatra-pt-BR \
locale-kleopatra-ro \
locale-kleopatra-ru \
locale-kleopatra-sk \
locale-kleopatra-sl \
locale-kleopatra-sq \
locale-kleopatra-sr \
locale-kleopatra-sr@ijekavian \
locale-kleopatra-sr@ijekavianlatin \
locale-kleopatra-sr@latin \
locale-kleopatra-sv \
locale-kleopatra-ta \
locale-kleopatra-th \
locale-kleopatra-tr \
locale-kleopatra-ug \
locale-kleopatra-uk \
locale-kleopatra-zh-CN \
locale-kleopatra-zh-TW"

RDEPENDS:${PN} += "kleopatra"

inherit rpm
