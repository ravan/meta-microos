SUMMARY = "Libraries for coeurl"
DESCRIPTION = "Libraries for coeurl."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "libcoeurl0_3-0.3.1-5.7.aarch64.rpm"
RPM_HASH = "48bf7740952432e77e5c5454ef24cabe62dbaa9a2a64b9459255ef2feecddebe32fcd1cc0b17c64befb6577d26a1d788834380468fa304ef459cc606682c2f09"

RPROVIDES:${PN} += "libcoeurl.so.0.3 \
libcoeurl0-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libevent-core-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libfmt.so.12 \
libgcc-s.so.1 \
libspdlog.so.1.17 \
libstdc++.so.6"

inherit rpm
