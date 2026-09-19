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

RPM_NAME = "python314-pivy-0.6.9-1.8.aarch64.rpm"
RPM_HASH = "566742a152dc89bfdea57d721c30f5318f47a48f9a4396bc792c1310e31b1f5f5b4a9a76261e9a7fb7e69bb9b57d88fc536d2c383406c27726767f97bce22698"

RPROVIDES:${PN} += "python3.14dist-pivy \
python314-pivy \
python3dist-pivy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
ld-linux-aarch64.so.1 \
libCoin.so.80 \
libSoQt.so.20 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
