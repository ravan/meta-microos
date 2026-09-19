SUMMARY = "Bindings to systemd via mcp"
DESCRIPTION = "mcp server which allows to \
* list units/services \
* start/stop/restart units/services \
* enable/disable services \
* list log"
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "mcp-server-systemd-0.3.4-2.3.aarch64.rpm"
RPM_HASH = "cad40c994d9ae27445dc8f7a8fb43d79dccd2e1aef5fac2ce51f5c34be729cd57d566239ac73d4b1b9e62dcf502250b4a294f4e35c0015628da67dac73977dd1"

RPROVIDES:${PN} += "mcp-server-systemd"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
