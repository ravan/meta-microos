SUMMARY = "A library providing a modern C++ API for the Linux operating system"
DESCRIPTION = "A library providing a modern C++ API for the Linux operating system. \
 \
The runtime library files for libcosmos."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "libcosmos-4-0.4.5-1.4.aarch64.rpm"
RPM_HASH = "8c8bb0456a7fec5245c24bf2fcbd7203bc5bf12a2d27538d00c43b632382518dc4f2910a69479a4736a1a1ea67d45a327e1e5e827077cea588dcd6302df1f105"

RPROVIDES:${PN} += "libcosmos \
libcosmos-4 \
libcosmos.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
