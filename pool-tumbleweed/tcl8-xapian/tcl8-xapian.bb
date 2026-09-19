SUMMARY = "Files needed for developing TCL scripts which use Xapian"
DESCRIPTION = "Xapian is a probabilistic information retrieval library. It offers an \
adaptable toolkit that allows developers to add advanced indexing and \
search facilities to applications. \
This package provides the files needed for developing Tcl scripts \
which use Xapian."
LICENSE = "GPL-2.0-only"

PV = "1.4.27"

RPM_NAME = "tcl8-xapian-1.4.27-1.7.aarch64.rpm"
RPM_HASH = "8896d4fe223630b8cc28e1a67cc34862961f0e3dfcb172e52845d6587941899ba53c055ea1134ee8242e85311a5500029cf91ed92eb334680aac104fa1af30b5"

RPROVIDES:${PN} += "tcl8-xapian"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxapian.so.30 \
tcl"

inherit rpm
