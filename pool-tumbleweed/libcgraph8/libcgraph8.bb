SUMMARY = "Library for graph programming"
DESCRIPTION = "Libcgraph supports graph programming by maintaining graphs in memory and \
reading and writing graph files. Graphs are composed of nodes, edges, and \
nested subgraphs. These graph objects may be attributed with string \
name-value pairs and programmer-defined records."
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "libcgraph8-15.0.0-2.2.aarch64.rpm"
RPM_HASH = "0fe89068781efac8e009375b64e188995c68cd7017a44614ddc8ee9a98b061c576004c53678c81a13ab924340da176be24e0b98f9f262cf1e09d9973693ff51b"

RPROVIDES:${PN} += "libcgraph.so.8 \
libcgraph8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdt.so.6"

inherit rpm
