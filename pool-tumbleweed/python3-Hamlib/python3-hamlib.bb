SUMMARY = "Python 3 bindings for Hamlib"
DESCRIPTION = "Hamlib provide a programming interface for controlling radios and \
other shack hardware."
LICENSE = "LGPL-2.1-only"

PV = "4.7.2"

RPM_NAME = "python3-Hamlib-4.7.2-1.3.aarch64.rpm"
RPM_HASH = "a65804b74b941149bfd1900619ff12af61dea06fdcd54ece46f42f7cd9668fee0c8e32efb7877a363c37fec1c5f57e51bd058559fe5af62a24063ca268614d5b"

RPROVIDES:${PN} += "python3-Hamlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhamlib.so.4 \
libpython3.13.so.1.0 \
python-abi"

inherit rpm
