SUMMARY = "Translations for package cups-pk-helper"
DESCRIPTION = "Provides translations for the 'cups-pk-helper' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.7"

RPM_NAME = "cups-pk-helper-lang-0.2.7-1.14.noarch.rpm"
RPM_HASH = "a3ba7e8329a4674cd7e59558e298758184c6a69547fb61eb3c96641a9775ca57e6e4ec93cf549405dcc668a86c582997f1e86f2919ff1349cc13ea80efe9e412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cups-pk-helper-lang \
cups-pk-helper-lang-all \
locale-cups-pk-helper-af \
locale-cups-pk-helper-ast \
locale-cups-pk-helper-ca \
locale-cups-pk-helper-cs \
locale-cups-pk-helper-da \
locale-cups-pk-helper-de \
locale-cups-pk-helper-en-GB \
locale-cups-pk-helper-eo \
locale-cups-pk-helper-es \
locale-cups-pk-helper-et \
locale-cups-pk-helper-eu \
locale-cups-pk-helper-fi \
locale-cups-pk-helper-fr \
locale-cups-pk-helper-fur \
locale-cups-pk-helper-gl \
locale-cups-pk-helper-he \
locale-cups-pk-helper-hr \
locale-cups-pk-helper-hu \
locale-cups-pk-helper-ia \
locale-cups-pk-helper-id \
locale-cups-pk-helper-it \
locale-cups-pk-helper-ja \
locale-cups-pk-helper-ka \
locale-cups-pk-helper-kk \
locale-cups-pk-helper-ko \
locale-cups-pk-helper-lt \
locale-cups-pk-helper-lv \
locale-cups-pk-helper-nl \
locale-cups-pk-helper-oc \
locale-cups-pk-helper-pl \
locale-cups-pk-helper-pt \
locale-cups-pk-helper-pt-BR \
locale-cups-pk-helper-ru \
locale-cups-pk-helper-si \
locale-cups-pk-helper-sk \
locale-cups-pk-helper-sl \
locale-cups-pk-helper-sr \
locale-cups-pk-helper-sv \
locale-cups-pk-helper-tr \
locale-cups-pk-helper-uk \
locale-cups-pk-helper-zh-CN \
locale-cups-pk-helper-zh-TW"

RDEPENDS:${PN} += "cups-pk-helper"

inherit rpm
