SUMMARY = "Files needed for developing Python scripts which use Xapian"
DESCRIPTION = "Xapian is a probabilistic information retrieval library. It offers an \
adaptable toolkit that allows developers to add advanced indexing and \
search facilities to applications. \
This package provides the files needed for developing Python 3 scripts \
which use Xapian."
LICENSE = "GPL-2.0-only"

PV = "1.4.27"

RPM_NAME = "python314-xapian-1.4.27-1.7.aarch64.rpm"
RPM_HASH = "1e5c588da17d2d849e0579db5329cece3c3859a9e40349ea7c34b0ae0e1696d1ad1d31300b75d7b56ffbc728ba301c1a8c59c97c8ffbb56e2db8e2d1b0c8ee44"

RPROVIDES:${PN} += "python314-xapian"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxapian.so.30 \
python-abi"

inherit rpm
