SUMMARY = "Netconfig configuration file for TI-RPC Library"
DESCRIPTION = "This RPM contains the netconfig configuration file and manual page for \
the TI-RPC Library."
LICENSE = "BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "libtirpc-netconfig-1.3.7-1.5.aarch64.rpm"
RPM_HASH = "ebe61e1aca79a3b01a109bb31d52a11d5893b7fd66c384aaa937587d2a96fd432dcd297d0d1370abb4737b9181f395fc7c798feb5e3885b81a3a97f259446632"

RPROVIDES:${PN} += "config-libtirpc-netconfig \
libtirpc-netconfig"

RDEPENDS:${PN} += ""

inherit rpm
