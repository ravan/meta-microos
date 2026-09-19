SUMMARY = "OpenHPI base libraries"
DESCRIPTION = "OpenHPI implements the SA Forum's Hardware Platform Interface (HPI). \
 \
This subpackage contains the OpenHPI base libraries."
LICENSE = "BSD-3-Clause"

PV = "3.8.0.ge4631e8a"

RPM_NAME = "libopenhpi4-3.8.0.ge4631e8a-3.20.aarch64.rpm"
RPM_HASH = "41de5ea379a814fe9b7b8f9ba6d65c64496281df0e02bcdc902e04d9af05e32c556a3c127e523ec48775b11e5147c0f7bf3ee1545b371585acbb0abd7382573c"

RPROVIDES:${PN} += "libopenhpi-ssl.so.4 \
libopenhpi.so.4 \
libopenhpi4 \
libopenhpimarshal.so.4 \
libopenhpitransport.so.4 \
libopenhpiutils.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
