SUMMARY = "Nimbus Metatheme for GNOME"
DESCRIPTION = "Nimbus is the name of a look-and-feel designed by Sun for the Java \
Desktop System."
LICENSE = "LGPL-2.0-or-later"

PV = "0.1.7"

RPM_NAME = "gtk2-metatheme-nimbus-0.1.7-15.4.aarch64.rpm"
RPM_HASH = "38855516d99e132737f27ae85480c633219e524b32903f0074a9ffc43c4594923b68ade7d63bb9474c86c193f2daad9c30da1675bff4ddfc13ba0effb8d53f6b"

RPROVIDES:${PN} += "gtk2-metatheme-nimbus"

RDEPENDS:${PN} += "gtk2-engine-nimbus \
nimbus-icon-theme"

inherit rpm
