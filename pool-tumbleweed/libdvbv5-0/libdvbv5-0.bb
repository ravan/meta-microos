SUMMARY = "Library that provides access to DVB adapter cards"
DESCRIPTION = "libdvbv5 is a library meant to be used by digital TV applications that need to \
talk with media hardware. \
 \
This package contains shared lib for packages that use libdvbv5."
LICENSE = "GPL-2.0-only"

PV = "1.32.0"

RPM_NAME = "libdvbv5-0-1.32.0-2.4.aarch64.rpm"
RPM_HASH = "05908c631c056b868192dd7a699d6d33b579540d82b5679f079a1613b81d431a367684b19b037ceb7977c014723ef0ae8d7e15f8d88b9996f289c98bd24f6d1b"

RPROVIDES:${PN} += "libdvbv5-0 \
libdvbv5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libudev.so.1"

inherit rpm
