SUMMARY = "Library for working with ISO 9660 filesystems"
DESCRIPTION = "A library for working with ISO 9660 filesystems, which are mainly used on CDs. \
This subpackage contains the C++ API library for cdio."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.0"

RPM_NAME = "libiso9660++1-2.2.0-1.7.aarch64.rpm"
RPM_HASH = "df2f9f56e06bd1a21c9129e3bb88c413a6451dfbb966673184784507bf7f32eb8d88e58770bff6fac4be31ad33516864325d86865cbcaccfd586d0620a68553b"

RPROVIDES:${PN} += "libiso9660++.so.1 \
libiso9660++1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio.so.19 \
libgcc-s.so.1 \
libiso9660.so.12 \
libstdc++.so.6"

inherit rpm
