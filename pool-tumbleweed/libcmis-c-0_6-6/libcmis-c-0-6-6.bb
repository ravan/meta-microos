SUMMARY = "C wrapper for libcmis, a library for accessing CMIS-enabled servers"
DESCRIPTION = "libcmis-c is a C client library for the CMIS (Content Management \
Interoperability Services) interface. This allows C applications to \
connect to any CMIS-enabled repositories. It is only a wrapper for \
its C++ sister library libcmis."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.6.2"

RPM_NAME = "libcmis-c-0_6-6-0.6.2-3.16.aarch64.rpm"
RPM_HASH = "eb6a91c0c59d2887131cc23f9cfd31302b3fe1c741001a4cdd06e693bacfd590153c2036da6ee69475506f0d841c229a15647818bf33a8789dcd989f5879a9ad"

RPROVIDES:${PN} += "libcmis-c-0-6-6 \
libcmis-c-0.6.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcmis-0.6.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
