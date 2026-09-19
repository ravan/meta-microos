SUMMARY = "C++ library containing a set of high level classes for threads management"
DESCRIPTION = "libthreadar is a C++ library containing a set of high level classes for threads management. \
 \
This package contains the shared library"
LICENSE = "LGPL-3.0-or-later"

PV = "1.6.1"

RPM_NAME = "libthreadar1000-1.6.1-1.3.aarch64.rpm"
RPM_HASH = "a75148454475c2358ffb8ed4910cef137903829e4354ba260a8b2be702ac6f8b3be0ae72114af9d4c3effd1f9bcc4c234c26b7b188af597c49601ef6047fc87a"

RPROVIDES:${PN} += "libthreadar.so.1000 \
libthreadar1000"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
