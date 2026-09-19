SUMMARY = "Development Package for Festival"
DESCRIPTION = "Files needed for developing software that uses Festival."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "festival-devel-2.5.0-16.1.aarch64.rpm"
RPM_HASH = "f037f9d33083aa43c8df48b7520684f9e5a55220676bd161f12b2173dfb3ae67a5b8b9df35dbadf88319f6ca119e01cc2db4961538f63f0b224c08b48771c7dc"

RPROVIDES:${PN} += "festival-devel"

RDEPENDS:${PN} += "festival"

inherit rpm
