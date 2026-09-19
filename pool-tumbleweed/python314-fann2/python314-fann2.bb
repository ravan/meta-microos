SUMMARY = "Fast Artificial Neural Network Library (fann) bindings"
DESCRIPTION = "Python bindings for Fast Artificial Neural Networks 2.2.0 (FANN >= 2.2.0) \
that implements multilayer artificial neural networks with support for both \
fully-connected and sparsely-connected networks. It includes a framework \
for easy handling of training data sets. \
 \
These are the original python bindings included with FANN 2.1.0beta and \
updated to include support for python 2.x/3.x ."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "python314-fann2-1.2.0-2.8.aarch64.rpm"
RPM_HASH = "1305e1ea1ba65239a35d1b2490280a3d3ebe844d748c4da610b31d7425d3b2dc1e2315e325865d593dfdb61763a43f7c2b48c3c2adcefc24043bac1fe05141d0"

RPROVIDES:${PN} += "python3.14dist-fann2 \
python314-fann2 \
python3dist-fann2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdoublefann.so.2 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
