SUMMARY = "Translations for package eiskaltdcpp-common"
DESCRIPTION = "Provides translations for the 'eiskaltdcpp-common' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "eiskaltdcpp-common-lang-2.4.2-6.2.noarch.rpm"
RPM_HASH = "c85617c854d6238c65282c513825fc653da4725240cce5ef741ba509ac3b60a114742c919b213e87c1f7611e3d41b81fa593a33377f49798a0c6507a26f9ac93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eiskaltdcpp-common-lang \
eiskaltdcpp-common-lang-all \
locale-eiskaltdcpp-common-be \
locale-eiskaltdcpp-common-bg \
locale-eiskaltdcpp-common-cs \
locale-eiskaltdcpp-common-da \
locale-eiskaltdcpp-common-de \
locale-eiskaltdcpp-common-el \
locale-eiskaltdcpp-common-en \
locale-eiskaltdcpp-common-es \
locale-eiskaltdcpp-common-eu \
locale-eiskaltdcpp-common-fr \
locale-eiskaltdcpp-common-hu \
locale-eiskaltdcpp-common-it \
locale-eiskaltdcpp-common-pl \
locale-eiskaltdcpp-common-pt-BR \
locale-eiskaltdcpp-common-ru \
locale-eiskaltdcpp-common-sk \
locale-eiskaltdcpp-common-sr \
locale-eiskaltdcpp-common-sr@latin \
locale-eiskaltdcpp-common-tr \
locale-eiskaltdcpp-common-uk \
locale-eiskaltdcpp-common-vi \
locale-eiskaltdcpp-common-zh-CN"

RDEPENDS:${PN} += "eiskaltdcpp-common"

inherit rpm
