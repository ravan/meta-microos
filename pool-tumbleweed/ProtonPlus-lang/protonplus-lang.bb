SUMMARY = "Translations for package ProtonPlus"
DESCRIPTION = "Provides translations for the 'ProtonPlus' package."
LICENSE = "GPL-3.0-only"

PV = "0.6.4"

RPM_NAME = "ProtonPlus-lang-0.6.4-1.1.noarch.rpm"
RPM_HASH = "9b4d8608dc1a9428c04b195e5e3e6576ba5a6730d4233f22c51598a2a7f1544d15a0fa158037737ec5ba6d35bca3a83ab2e3a11a38a8c8d0fe9df3dab370be70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ProtonPlus-lang \
ProtonPlus-lang-all \
locale-ProtonPlus-ar \
locale-ProtonPlus-be \
locale-ProtonPlus-bs \
locale-ProtonPlus-cs \
locale-ProtonPlus-de \
locale-ProtonPlus-el \
locale-ProtonPlus-es \
locale-ProtonPlus-fi \
locale-ProtonPlus-fr \
locale-ProtonPlus-hr \
locale-ProtonPlus-id \
locale-ProtonPlus-it \
locale-ProtonPlus-ja \
locale-ProtonPlus-ka \
locale-ProtonPlus-nl \
locale-ProtonPlus-pl \
locale-ProtonPlus-pt \
locale-ProtonPlus-ru \
locale-ProtonPlus-sk \
locale-ProtonPlus-sr@latin \
locale-ProtonPlus-sv \
locale-ProtonPlus-uk \
locale-ProtonPlus-vi \
locale-ProtonPlus-zh-CN \
locale-ProtonPlus-zh-TW"

RDEPENDS:${PN} += "ProtonPlus"

inherit rpm
