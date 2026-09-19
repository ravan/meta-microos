SUMMARY = "A collection of plugins for xviewer"
DESCRIPTION = "This package contains plugins for additional features in xviewer."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.3"

RPM_NAME = "xviewer-plugins-3.4.3-1.2.aarch64.rpm"
RPM_HASH = "78f236861179705eb56b373a45f67176fc11569b528a602a5c21287c527e2d6f881c495881e1d06052ad5bba7a540bb7090096ef18611a3ecfd7f904da25d19a"

RPROVIDES:${PN} += "xviewer-plugins"

RDEPENDS:${PN} += "xviewer"

inherit rpm
