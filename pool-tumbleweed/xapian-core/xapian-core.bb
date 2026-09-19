SUMMARY = "The Xapian Probabilistic Information Retrieval Library"
DESCRIPTION = "Xapian is a Probabilistic Information Retrieval library. It offers an \
adaptable toolkit for adding indexing and search facilities to \
applications."
LICENSE = "GPL-2.0-only"

PV = "1.4.27"

RPM_NAME = "xapian-core-1.4.27-1.6.aarch64.rpm"
RPM_HASH = "0d0874e0571cef98280bcf344d84cd0ac50d3794283e3dfa531ef4e4e5420ba402737a626e93da455c49e01bc7c4d7a88ba9c4dff130e88575db2aaaa7a7e8f5"

RPROVIDES:${PN} += "xapian-core"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxapian.so.30 \
libxapian30"

inherit rpm
