SUMMARY = "Python bindings for 0MQ"
DESCRIPTION = "PyZMQ is a lightweight and super-fast messaging library built on top of \
the ZeroMQ library (http://www.zeromq.org)."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "27.2.0"

RPM_NAME = "python313-pyzmq-27.2.0-1.1.aarch64.rpm"
RPM_HASH = "49213ee1c4b349e27652794a0752640ce604cf069bb1fe3bfd4385302cf322b4f5bc737efbd2bf0c0762c8b99d2ddcf98cee9f50eb71a7f927229909610cbe54"

RPROVIDES:${PN} += "python3-pyzmq \
python3.13dist-pyzmq \
python313-pyzmq \
python3dist-pyzmq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmq.so.5 \
python-abi"

inherit rpm
