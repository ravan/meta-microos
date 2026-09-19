SUMMARY = "Kernel dump file access library"
DESCRIPTION = "A library that provides an abstraction layer for reading kernel dump \
core files.  It supports different kernel dump core formats, virtual \
to physical translation, Xen mappings and more. \
 \
This package contains the libkdumpfile library."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.6"

RPM_NAME = "libkdumpfile12-0.5.6-3.5.aarch64.rpm"
RPM_HASH = "638b2ee48923a03d0e2896bb572a7ab336b3b84c3d618e0cf49a91e209698ac228c23df3e24dd778ee36e4aabe9928618c5a47ddab068dea9f01ba2b229aa4f8"

RPROVIDES:${PN} += "libkdumpfile.so.12 \
libkdumpfile12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaddrxlat.so.3 \
libc.so.6 \
liblzo2.so.2 \
libsnappy.so.1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
