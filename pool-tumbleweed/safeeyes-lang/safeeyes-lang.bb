SUMMARY = "Translations for package safeeyes"
DESCRIPTION = "Provides translations for the 'safeeyes' package."
LICENSE = "GPL-3.0-only"

PV = "3.5.1"

RPM_NAME = "safeeyes-lang-3.5.1-1.1.noarch.rpm"
RPM_HASH = "c29f09b5d4a938f55a8d9f993d0c853ccea38e6449de83b710f25fd4e5784f57954056b5e8b968b7c569545c57250c95ff966f952dd4e4ac0dff5cb162944fe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-safeeyes-ar \
locale-safeeyes-bg \
locale-safeeyes-bn \
locale-safeeyes-bn-IN \
locale-safeeyes-ca \
locale-safeeyes-cs \
locale-safeeyes-da \
locale-safeeyes-de \
locale-safeeyes-eo \
locale-safeeyes-es \
locale-safeeyes-et \
locale-safeeyes-eu \
locale-safeeyes-fa \
locale-safeeyes-fr \
locale-safeeyes-he \
locale-safeeyes-hi \
locale-safeeyes-hu \
locale-safeeyes-id \
locale-safeeyes-it \
locale-safeeyes-kn \
locale-safeeyes-ko \
locale-safeeyes-lt \
locale-safeeyes-lv \
locale-safeeyes-mk \
locale-safeeyes-mr \
locale-safeeyes-nb \
locale-safeeyes-nl \
locale-safeeyes-pl \
locale-safeeyes-pt \
locale-safeeyes-pt-BR \
locale-safeeyes-ru \
locale-safeeyes-sk \
locale-safeeyes-sr \
locale-safeeyes-sv \
locale-safeeyes-ta \
locale-safeeyes-tr \
locale-safeeyes-ug \
locale-safeeyes-uk \
locale-safeeyes-uz-Latn \
locale-safeeyes-vi \
locale-safeeyes-zh-CN \
locale-safeeyes-zh-TW \
safeeyes-lang \
safeeyes-lang-all"

RDEPENDS:${PN} += "safeeyes"

inherit rpm
