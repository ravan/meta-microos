SUMMARY = "Translations for package dnf-plugins-core"
DESCRIPTION = "Provides translations for the 'dnf-plugins-core' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.10.1"

RPM_NAME = "dnf-plugins-core-lang-4.10.1-1.6.noarch.rpm"
RPM_HASH = "cddeeb4eecb2f4b62fc3d1e5dca4fb8f6f69711d6d21dd0b6753076b5bb01c2de99b3e4e241c310f90ec631af3b70745bc2c286ab3ca6c4ab93b567fe3411c37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-plugins-core-lang \
dnf-plugins-core-lang-all \
locale-dnf-plugins-core-bg \
locale-dnf-plugins-core-ca \
locale-dnf-plugins-core-cs \
locale-dnf-plugins-core-da \
locale-dnf-plugins-core-de \
locale-dnf-plugins-core-es \
locale-dnf-plugins-core-eu \
locale-dnf-plugins-core-fi \
locale-dnf-plugins-core-fr \
locale-dnf-plugins-core-fur \
locale-dnf-plugins-core-hu \
locale-dnf-plugins-core-id \
locale-dnf-plugins-core-it \
locale-dnf-plugins-core-ja \
locale-dnf-plugins-core-ka \
locale-dnf-plugins-core-ko \
locale-dnf-plugins-core-mr \
locale-dnf-plugins-core-nl \
locale-dnf-plugins-core-pa \
locale-dnf-plugins-core-pl \
locale-dnf-plugins-core-pt \
locale-dnf-plugins-core-pt-BR \
locale-dnf-plugins-core-ru \
locale-dnf-plugins-core-si \
locale-dnf-plugins-core-sk \
locale-dnf-plugins-core-sq \
locale-dnf-plugins-core-sr \
locale-dnf-plugins-core-sv \
locale-dnf-plugins-core-tr \
locale-dnf-plugins-core-uk \
locale-dnf-plugins-core-zh-CN \
locale-dnf-plugins-core-zh-TW"

RDEPENDS:${PN} += "dnf-plugins-core"

inherit rpm
