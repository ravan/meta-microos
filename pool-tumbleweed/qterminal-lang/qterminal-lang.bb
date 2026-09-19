SUMMARY = "Translations for package qterminal"
DESCRIPTION = "Provides translations for the 'qterminal' package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "2.4.0"

RPM_NAME = "qterminal-lang-2.4.0-1.2.noarch.rpm"
RPM_HASH = "bd1623e19533ab1d21cb1ab8339491483b7d3aeb2a1017fbdd4c1ae6163df195ec93ae1c4ea45c793c0b854baf0428c5d3726ad8a74f23e804b59a3cfa534365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qterminal-lang \
qterminal-lang-all"

RDEPENDS:${PN} += "qterminal"

inherit rpm
