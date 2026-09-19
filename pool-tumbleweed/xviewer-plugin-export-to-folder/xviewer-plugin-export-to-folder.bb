SUMMARY = "Xviewer export to directory plugin"
DESCRIPTION = "xviewer export to directory plugin"
LICENSE = "GPL-2.0-or-later"

PV = "3.4.3"

RPM_NAME = "xviewer-plugin-export-to-folder-3.4.3-1.2.aarch64.rpm"
RPM_HASH = "ab795915eb0af9650902fd43628721a005c596c84dd28a7bbf958d6bcdf35a2e002c043a1ba763239928e8e442591e09e2ae1059c1de190d233335a20e8f105e"

RPROVIDES:${PN} += "xviewer-plugin-export-to-folder"

RDEPENDS:${PN} += "xviewer-plugins-data"

inherit rpm
