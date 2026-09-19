SUMMARY = "Open Sound Control implementation"
DESCRIPTION = "This is an implementation of the OSC protocol \
(see http://www.cnmat.berkeley.edu/OpenSoundControl/ for details)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.36"

RPM_NAME = "liblo7-0.36-1.3.aarch64.rpm"
RPM_HASH = "edf8d9953007a15e2ddb3a3638ba6855bdbae4debbf45d06f19d06a886d1ac24e73818ceb8c3d654a433f18eb7472f5d68ae6f6077da683d092ae6b60b6a6ebf"

RPROVIDES:${PN} += "liblo.so.7 \
liblo7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
