SUMMARY = "Measure TCP/UDP transport layer throughput between hosts"
DESCRIPTION = "A tool to measure TCP/UDP transport layer throughput between hosts."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "goben-1.0.3-1.4.aarch64.rpm"
RPM_HASH = "5cf41b9dffe4d098aa880f359dbe712d748d1bb89aa73bef9419e4ebf22b036486144fc933d6c582b864beed156b58c81b2c0bf2776dc93ac3e722f9063724f2"

RPROVIDES:${PN} += "goben"

RDEPENDS:${PN} += ""

inherit rpm
