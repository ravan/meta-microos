SUMMARY = "Industrial I/O library -- iiod"
DESCRIPTION = "Library for industrial I/O. \
 \
This sub-package contains the iiod daemon."
LICENSE = "LGPL-2.1-or-later"

PV = "0.26"

RPM_NAME = "libiio-daemon-0.26-1.10.aarch64.rpm"
RPM_HASH = "18a7e500c4502e6e1ec99c5b8a2475248cd535c16e5341a0f46dc4ec5f65b5c13a7c8273ea5f7c09935facbd2736c854a08648e29db51648e3a81dd392e5bd19"

RPROVIDES:${PN} += "libiio-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libiio.so.0"

inherit rpm
