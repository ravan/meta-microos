SUMMARY = "Boost.Wave runtime library"
DESCRIPTION = "This package contains the Boost::Wave runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_wave1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "57bb1881b15eef67f024b94a5ebf011004d110cd23dcc2477b4a14bb4021d49972f7b76e6e2254992b57a4580b1c181a0f778b6ad595ae35d42a349cda2d5b8d"

RPROVIDES:${PN} += "libboost-wave.so.1.91.0 \
libboost-wave1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
