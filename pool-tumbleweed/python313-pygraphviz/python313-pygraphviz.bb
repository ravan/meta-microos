SUMMARY = "Python interface to Graphviz"
DESCRIPTION = "A Python wrapper for the Graphviz Agraph data structure. \
PyGraphviz can be used to create and draw networks and graphs with Graphviz."
LICENSE = "BSD-3-Clause"

PV = "1.14"

RPM_NAME = "python313-pygraphviz-1.14-3.7.aarch64.rpm"
RPM_HASH = "310a72d0c264f472951de3f36311c6188f5c776319c26c3202dc951ec7d2b622b0cd4b7a1b40a293d9ffc3d05aee478d4681d40833a0e16d8e7555153025c6ba"

RPROVIDES:${PN} += "python3-pygraphviz \
python3.13dist-pygraphviz \
python313-pygraphviz \
python3dist-pygraphviz"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.8 \
libgvc.so.7 \
python-abi"

inherit rpm
