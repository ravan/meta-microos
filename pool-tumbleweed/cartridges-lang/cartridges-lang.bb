SUMMARY = "Translations for package cartridges"
DESCRIPTION = "Provides translations for the 'cartridges' package."
LICENSE = "GPL-3.0-only"

PV = "2.13.1"

RPM_NAME = "cartridges-lang-2.13.1-1.3.noarch.rpm"
RPM_HASH = "2cf662996cbf7403e095757578f3a1161d2f57920dea865bbf621854469623ea940f80d63b9b48d580482d6753e3449f7b41b371bf0287cbb600f1644d169e35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cartridges-lang \
cartridges-lang-all \
locale-cartridges-ar \
locale-cartridges-be \
locale-cartridges-ca \
locale-cartridges-cs \
locale-cartridges-de \
locale-cartridges-el \
locale-cartridges-en-GB \
locale-cartridges-es \
locale-cartridges-fa \
locale-cartridges-fi \
locale-cartridges-fr \
locale-cartridges-hi \
locale-cartridges-hr \
locale-cartridges-hu \
locale-cartridges-ia \
locale-cartridges-it \
locale-cartridges-ja \
locale-cartridges-ko \
locale-cartridges-nb-NO \
locale-cartridges-nl \
locale-cartridges-nn \
locale-cartridges-pl \
locale-cartridges-pt \
locale-cartridges-pt-BR \
locale-cartridges-ro \
locale-cartridges-ru \
locale-cartridges-sv \
locale-cartridges-ta \
locale-cartridges-te \
locale-cartridges-tr \
locale-cartridges-uk"

RDEPENDS:${PN} += "cartridges"

inherit rpm
