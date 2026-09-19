SUMMARY = "Python bindings for 0MQ"
DESCRIPTION = "PyZMQ is a lightweight and super-fast messaging library built on top of \
the ZeroMQ library (http://www.zeromq.org)."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "27.2.0"

RPM_NAME = "python314-pyzmq-27.2.0-1.1.aarch64.rpm"
RPM_HASH = "9fbb3a418fb6230b59559eaf7acee5002e95ca2ef7182ee3a6d2477a0425e30d24f8a19a8ca0703771daff3c7818cf5b060bb9f152ba1d41ee15bd5aaa2549de"

RPROVIDES:${PN} += "python3.14dist-pyzmq \
python314-pyzmq \
python3dist-pyzmq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmq.so.5 \
python-abi"

inherit rpm
