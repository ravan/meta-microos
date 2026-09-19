SUMMARY = "Standalone program using libosmo-mslookup"
DESCRIPTION = "Standalone program using libosmo-mslookup to easily integrate with programs \
that want to connect services (SIP, SMS,...) to the current location of a \
subscriber."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "osmo-mslookup-client-1.4.0-2.14.aarch64.rpm"
RPM_HASH = "9fdbf96cc0f06f8ad1aa299e3cea5b00cd90ba15066026859871536f4a2e2962f079fe30e5f46be4e15886abb1422610703778932d8326f685943d3417739c10"

RPROVIDES:${PN} += "osmo-mslookup-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libosmo-mslookup.so.0 \
libosmocore.so.22 \
libtalloc.so.2"

inherit rpm
