SUMMARY = "Library for C file functions"
DESCRIPTION = "A library for C file functions. Part of the libyal library collection."
LICENSE = "LGPL-3.0-or-later"

PV = "20260704"

RPM_NAME = "libcfile1-20260704-1.2.aarch64.rpm"
RPM_HASH = "9ee35259eae4d3c975ffd8d13d10dd334e40c45080b242353b0cd616719739c09d89616fefa4fa841addd5768bbb40478f918551a37631623f92477173681098"

RPROVIDES:${PN} += "libcfile.so.1 \
libcfile1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libuna.so.1"

inherit rpm
