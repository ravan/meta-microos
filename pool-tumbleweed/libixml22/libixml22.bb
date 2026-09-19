SUMMARY = "The Portable UPnP SDK's XML library"
DESCRIPTION = "A C XML parsing library originally created for the Intel UPnP SDK for Linux."
LICENSE = "BSD-3-Clause"

PV = "22.1.0"

RPM_NAME = "libixml22-22.1.0-1.1.aarch64.rpm"
RPM_HASH = "4d30c389370393e6289d33657a323d4fa901431f6606c591c552e9fdadfc48c79cacaf49269ed773b14d66adceb7d9eef37f54d8ef7204a5c2bcceb33c431c01"

RPROVIDES:${PN} += "libixml.so.22 \
libixml22"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
