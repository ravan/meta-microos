SUMMARY = "OpenBao database plugin for MySQL Legacy"
DESCRIPTION = "OpenBao database plugin for MySQL Legacy"
LICENSE = "MPL-2.0"

PV = "2.6.2"

RPM_NAME = "openbao-mysql-legacy-database-plugin-2.6.2-1.1.aarch64.rpm"
RPM_HASH = "e6f99047260dd9b2b88c79f2e0997be742e681824dc277a9649b1cd3031f2e2a759cb38abdaeedd85d4059bcbef1dda6331745e40b3fedfe4f0c77003bea369b"

RPROVIDES:${PN} += "openbao-mysql-legacy-database-plugin"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
