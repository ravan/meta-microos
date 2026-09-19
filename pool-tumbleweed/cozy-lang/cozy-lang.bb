SUMMARY = "Translations for package cozy"
DESCRIPTION = "Provides translations for the 'cozy' package."
LICENSE = "GPL-3.0-only"

PV = "1.3.0"

RPM_NAME = "cozy-lang-1.3.0-1.5.noarch.rpm"
RPM_HASH = "647b69e72c2f5aa9e6eb6c4c8a63c3f1990e042d279c8d6927f1a64e95050c142d639691b4e4c076acbc1370d94b0b912cfca1dc16bbe42309605919e9d6c31f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cozy-lang \
cozy-lang-all \
locale-cozy-bg \
locale-cozy-cs \
locale-cozy-da \
locale-cozy-de \
locale-cozy-el \
locale-cozy-eo \
locale-cozy-es \
locale-cozy-fi \
locale-cozy-fr \
locale-cozy-gl \
locale-cozy-he \
locale-cozy-hi \
locale-cozy-hr \
locale-cozy-hu \
locale-cozy-it \
locale-cozy-nl \
locale-cozy-oc \
locale-cozy-pl \
locale-cozy-pt \
locale-cozy-pt-BR \
locale-cozy-ru \
locale-cozy-sv \
locale-cozy-tr \
locale-cozy-uk \
locale-cozy-zh"

RDEPENDS:${PN} += "cozy"

inherit rpm
