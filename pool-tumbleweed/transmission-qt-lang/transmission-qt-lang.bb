SUMMARY = "Translations for package transmission-qt"
DESCRIPTION = "Provides translations for the 'transmission-qt' package."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.1.3"

RPM_NAME = "transmission-qt-lang-4.1.3-1.2.noarch.rpm"
RPM_HASH = "66a081c274a609ea43fbebf57057a5eaff5aa87a7c4e0476a1b062edafab9ec79a993cfb9f36877d1c2c0e790c632bb0fe4880634a3fbd33c8e5741811efe663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "transmission-qt-lang \
transmission-qt-lang-all"

RDEPENDS:${PN} += "transmission-qt"

inherit rpm
