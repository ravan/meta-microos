SUMMARY = "FRRouting zeromq library"
DESCRIPTION = "This library contains part of the zermomq implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.6.1"

RPM_NAME = "libfrrzmq0-10.6.1-1.3.aarch64.rpm"
RPM_HASH = "69a55c9facb5c7a9d9e0a07936dee77f7ad7da239e018fcebeebfc8efa31bcffce470f034fdfd05ba3fec185ab0febc2f6bee6abf802aa96997b657c20f02628"

RPROVIDES:${PN} += "libfrrzmq.so.0 \
libfrrzmq0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libzmq.so.5"

inherit rpm
