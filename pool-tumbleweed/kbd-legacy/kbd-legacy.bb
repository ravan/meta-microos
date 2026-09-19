SUMMARY = "Legacy data for kbd package"
DESCRIPTION = "The kbd-legacy package contains original keymaps for kbd package. \
Please note that kbd-legacy is not helpful without kbd."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.10.0"

RPM_NAME = "kbd-legacy-2.10.0-1.1.noarch.rpm"
RPM_HASH = "f243111a44415939dc1ff69c1ebbedc5eaefe121b4261f78fb7ead885b05234a4d092dfc121dddd9e776279c0c3977c9096eb73f5dde7b26786cf0d7a58f0033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbd-legacy"

RDEPENDS:${PN} += ""

inherit rpm
