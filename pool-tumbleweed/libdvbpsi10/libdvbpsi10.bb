SUMMARY = "Library for Decoding and Generating MPEG TS and DVB PSI Tables"
DESCRIPTION = "libdvbpsi is a simple library designed for decoding and generating \
MPEG TS and DVB PSI tables. Current features: * Program Association Table \
(PAT), decoder and generator."
LICENSE = "LGPL-2.1+"

PV = "1.3.3"

RPM_NAME = "libdvbpsi10-1.3.3-1.23.aarch64.rpm"
RPM_HASH = "7faa01a5ff3966fda265115c35960ad3ea3b69d6c0cc9dbe43ce8ca8ec4d48514f193b54eb93c687e799deb355370f2088640facba619f22dbad6c550859072b"

RPROVIDES:${PN} += "libdvbpsi.so.10 \
libdvbpsi10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
