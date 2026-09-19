SUMMARY = "A multi-platform, multi-architecture disassembly framework"
DESCRIPTION = "Capstone is a disassembly framework."
LICENSE = "BSD-3-Clause"

PV = "5.0.6"

RPM_NAME = "libcapstone5-5.0.6-2.3.aarch64.rpm"
RPM_HASH = "88874b278b8ebe9c9351df52aa15bbfd96288bccc730aa2b20a096982b5eb0df4221f226f39a7f11b3dd5d37a804bf01e6d467078e1c48bf85c794ed809964d2"

RPROVIDES:${PN} += "libcapstone.so.5 \
libcapstone5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
