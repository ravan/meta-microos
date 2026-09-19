SUMMARY = "Dynamic hash table library"
DESCRIPTION = "A hash table which will dynamically resize to achieve optimal storage & access \
time properties"
LICENSE = "LGPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "libdhash1-0.5.0-29.3.aarch64.rpm"
RPM_HASH = "003cdfa5455bef5e9b3fc1ca8fd6a831bb7ab7edf77b27ab9cd8f91aea0845f1c72440a477364cd64aeb8037e80fbac8e9323c3c73eb578127e420660d89dbb3"

RPROVIDES:${PN} += "libdhash.so.1 \
libdhash1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
