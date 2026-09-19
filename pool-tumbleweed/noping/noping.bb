SUMMARY = "Multiple Host Ping that supports ICMPv4 and ICMPv6"
DESCRIPTION = "noping continuously pings lists of hosts, displays ping statistics 'live' \
and highlights aberrant round-trip times."
LICENSE = "GPL-2.0-only"

PV = "1.10.0"

RPM_NAME = "noping-1.10.0-2.15.aarch64.rpm"
RPM_HASH = "e23a490b51ca3f6ae75278a35ab2a3eb32852dfbb2e4961c9dff5db4503b460504fb73223e5607bab2a0aed491546849f45e7168ca27322804f8b4d887fa403f"

RPROVIDES:${PN} += "noping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
liboping \
liboping.so.0 \
libtinfo.so.6"

inherit rpm
