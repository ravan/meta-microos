SUMMARY = "Dynamic libraries for Judy"
DESCRIPTION = "Judy is a C library that provides a state-of-the-art core technology that implements \
a sparse dynamic array. Judy arrays are declared simply with a null pointer. A Judy \
array consumes memory only when it is populated, yet can grow to take advantage \
of all available memory if desired. \
 \
Judy's key benefits are scalability, high performance, and memory efficiency. A Judy \
array is extensible and can scale up to a very large number of elements, bounded \
only by machine memory. Since Judy is designed as an unbounded array, the size of \
a Judy array is not pre-allocated but grows and shrinks dynamically \
with the array population."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "libJudy1-1.0.5-11.9.aarch64.rpm"
RPM_HASH = "22adfbebb729b4c5d629ab0635e649f6db446ed5f603c1e7a3515cdca40f121189fab0e2c8896591b11efdd3bfdf8a88bdfeadfa516f9e1e38abdd21655f6cd0"

RPROVIDES:${PN} += "libJudy.so.1 \
libJudy1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
