SUMMARY = "Files needed for developing Ruby scripts which use Xapian"
DESCRIPTION = "Xapian is a probabilistic information retrieval library. It offers an \
adaptable toolkit that allows developers to add advanced indexing and \
search facilities to applications. \
This package provides the files needed for developing Ruby scripts \
which use Xapian."
LICENSE = "GPL-2.0-only"

PV = "1.4.27"

RPM_NAME = "ruby-xapian-1.4.27-1.7.aarch64.rpm"
RPM_HASH = "f785082dc0ba41a7948501397779c290cbbc6181ea571438e3b5560529ab0108d2dec2102235efb163a594d8fed130854deb6631404b103fd79baa609fb35ca0"

RPROVIDES:${PN} += "ruby-xapian"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxapian.so.30 \
ruby"

inherit rpm
