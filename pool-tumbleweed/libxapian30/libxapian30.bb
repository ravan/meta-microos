SUMMARY = "Xapian search engine libraries"
DESCRIPTION = "Xapian is a Probabilistic Information Retrieval library. It offers an \
adaptable toolkit for adding indexing and search facilities to \
applications."
LICENSE = "GPL-2.0-only"

PV = "1.4.27"

RPM_NAME = "libxapian30-1.4.27-1.6.aarch64.rpm"
RPM_HASH = "2e34b636f33589fa457be2e8a08b86884e11ab106b90328000ab8cb39ebb1e4b50219544142db4456d6d2568374ae8b17a6465f48db6e051a09645929340be2a"

RPROVIDES:${PN} += "libxapian.so.30 \
libxapian30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libuuid.so.1 \
libz.so.1"

inherit rpm
