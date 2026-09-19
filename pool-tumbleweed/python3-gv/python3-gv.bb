SUMMARY = "Python 3 Extension for Graphviz"
DESCRIPTION = "The package contains the Python extension for the \
graphviz tools."
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "python3-gv-15.0.0-2.3.aarch64.rpm"
RPM_HASH = "33d65f3bb0f73ececee2bcde582712c27be929ab7955a8fd1160c974597f1ff22d1b12eb8e477c0d37f5ef0a229cb92080ad7753e303ce2ee13c9129c126bdc4"

RPROVIDES:${PN} += "libgv-python3.so \
python3-gv"

RDEPENDS:${PN} += "graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.8 \
libgcc-s.so.1 \
libgvc.so.7 \
libstdc++.so.6 \
python-abi"

inherit rpm
