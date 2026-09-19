SUMMARY = "Coin Binding for Python"
DESCRIPTION = "Pivy is a Coin binding for Python. Coin is a high-level 3D graphics library \
with a C++ Application Programming Interface. Coin uses scene-graph data \
structures to render real-time graphics suitable for mostly all kinds of \
scientific and engineering visualization applications. \
 \
Pivy allows: \
 \
- Development of Coin applications and extensions in Python \
- Interactive modification of Coin programs from within the Python interpreter \
  at runtime \
- Incorporation of Scripting Nodes into the scene graph which are capable of \
  executing Python code and callbacks"
LICENSE = "GPL-2.0-only & ISC"

PV = "0.6.9"

RPM_NAME = "python313-pivy-0.6.9-1.8.aarch64.rpm"
RPM_HASH = "ddaf2b4ead34f90c6232558545e523982ddd4e8269626021dc771277452451587abe643c419b84022a3608b35269231b5591fbf019eba1fb31d91e082cc926b5"

RPROVIDES:${PN} += "python3-pivy \
python3.13dist-pivy \
python313-pivy \
python3dist-pivy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libCoin.so.80 \
libSoQt.so.20 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
