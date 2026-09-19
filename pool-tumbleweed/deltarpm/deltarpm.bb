SUMMARY = "Tools to Create and Apply deltarpms"
DESCRIPTION = "This package contains tools to create and apply deltarpms. A deltarpm \
contains the difference between an old and a new version of an RPM, \
which makes it possible to recreate the new RPM from the deltarpm and \
the old one. You do not need to have a copy of the old RPM, because \
deltarpms can also work with installed RPMs."
LICENSE = "BSD-3-Clause"

PV = "3.6.5"

RPM_NAME = "deltarpm-3.6.5-1.10.aarch64.rpm"
RPM_HASH = "4546982cd47b45804a8b51bfeb23bf93fd1a1fe8ce7136714f29159699d2462587923e2276c0390c50baf56d9e86336d982da26f7638c8b83e76c24373ea37dd"

RPROVIDES:${PN} += "deltarpm"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
librpm.so.10 \
librpmio.so.10 \
libzstd.so.1"

inherit rpm
