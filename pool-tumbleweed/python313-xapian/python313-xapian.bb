SUMMARY = "Files needed for developing Python scripts which use Xapian"
DESCRIPTION = "Xapian is a probabilistic information retrieval library. It offers an \
adaptable toolkit that allows developers to add advanced indexing and \
search facilities to applications. \
This package provides the files needed for developing Python 3 scripts \
which use Xapian."
LICENSE = "GPL-2.0-only"

PV = "1.4.27"

RPM_NAME = "python313-xapian-1.4.27-1.7.aarch64.rpm"
RPM_HASH = "b8c9bfebe1c7c8a4d8920819fc7f867b8590fbbc000d33d88454c6416fbc5d89170640f67c02938036cb140825ed209bc435ad212f006063fd47fd57b4fa08df"

RPROVIDES:${PN} += "python3-xapian \
python313-xapian"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxapian.so.30 \
python-abi"

inherit rpm
