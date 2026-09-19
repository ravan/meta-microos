SUMMARY = "Python interface to Graphviz"
DESCRIPTION = "A Python wrapper for the Graphviz Agraph data structure. \
PyGraphviz can be used to create and draw networks and graphs with Graphviz."
LICENSE = "BSD-3-Clause"

PV = "1.14"

RPM_NAME = "python314-pygraphviz-1.14-3.7.aarch64.rpm"
RPM_HASH = "43b586dae255c5ce5caaf98cc8ca459027764ea351ff7c7a9f56ab63847fd180dc78691067edbc06c5cb47067a57c5970691cab2d7c8d56ffc936ac6b8ff6a56"

RPROVIDES:${PN} += "python3.14dist-pygraphviz \
python314-pygraphviz \
python3dist-pygraphviz"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.8 \
libgvc.so.7 \
python-abi"

inherit rpm
