SUMMARY = "Translations for package virtui-manager"
DESCRIPTION = "Provides translations for the 'virtui-manager' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "virtui-manager-lang-3.2.1-1.1.noarch.rpm"
RPM_HASH = "728ef5207a1633ea6d1f7462b65e131bd8be950e8cbf59a39071b50fcfa370e3811b58795efbda49846ecc35632a9ba9b184416615cc439f5f1e8e95e6bb4b61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-virtui-manager-de \
locale-virtui-manager-fr \
locale-virtui-manager-it \
virtui-manager-lang \
virtui-manager-lang-all"

RDEPENDS:${PN} += "virtui-manager"

inherit rpm
