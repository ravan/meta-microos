SUMMARY = "Osmocom VTY interface library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
The libosmovty library implements the interactive command-line on the \
VTY (Virtual TTY), as well as configuration file parsing."
LICENSE = "GPL-2.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmovty13-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "caea4bda1ebc7b0d8a0deb335e9262434b14ed826a107503f50d4b1049dabb6eebdc898bb238e4cf2894e0fef874ee97939939bc353f37fda198b52358832d4b"

RPROVIDES:${PN} += "libosmovty.so.13 \
libosmovty13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.22 \
libtalloc.so.2"

inherit rpm
