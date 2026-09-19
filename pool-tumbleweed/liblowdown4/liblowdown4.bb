SUMMARY = "Simple markdown translator"
DESCRIPTION = "lowdown is a fork of hoedown, although the parser and front-ends have changed \
significantly."
LICENSE = "ISC"

PV = "3.1.1"

RPM_NAME = "liblowdown4-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "6f9ebdc6d371458f299ceb92ef91145c38d2266b4ee9e250222f36170d63109141393fae03d1400dbb0a171fd6b7013ac2965802c628a0cca16a4ff66cac5edc"

RPROVIDES:${PN} += "liblowdown.so.4 \
liblowdown4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
