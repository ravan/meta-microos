SUMMARY = "Disk-Based Hash Library"
DESCRIPTION = "Disk-based hashes is a method to create multidimensional binary trees \
on disk. This library permits the extension of the database concept to \
a plethora of electronic data, such as graphic information. With the \
multidimensional binary tree, it is possible to mathematically prove \
that access time to any particular record is minimized (using the \
concept of critical points from calculus), which provides the means to \
construct optimized databases for particular applications."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.22"

RPM_NAME = "libdbh2-5.0.22-2.8.aarch64.rpm"
RPM_HASH = "cf327f11cddc66358c459e9dc62dea2e15033a5a3f1f3bd2fc3f6e9471e8c36ffb7b732b74f8df7bac45cfd10d05cd3f32e291af8a0a5da11bd6e11f2e70c0c4"

RPROVIDES:${PN} += "dbh \
libdbh.so.2 \
libdbh2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6"

inherit rpm
