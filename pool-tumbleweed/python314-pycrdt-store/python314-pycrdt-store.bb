SUMMARY = "Persistent storage for pycrdt"
DESCRIPTION = "Persistent storage for pycrdt. \
 \
This is a package extracted out from pycrdt-websocket"
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "python314-pycrdt-store-0.1.3-1.4.aarch64.rpm"
RPM_HASH = "ec54d2bca6bb138ddf74912414c9811b824f6200912bd889f68f71064c1d227e1f75b7bc6442db6d608b86783b841b452c1e3cf8012299becc52cb4b07c95818"

RPROVIDES:${PN} += "python3.14dist-pycrdt-store \
python314-pycrdt-store \
python3dist-pycrdt-store"

RDEPENDS:${PN} += "-python314-anyio >= 3.6.2 with python314-anyio < 5 \
-python314-pycrdt >= 0.12.13 with python314-pycrdt < 0.13 \
-python314-sqlite-anyio >= 0.2.3 with python314-sqlite-anyio < 0.3 \
python-abi"

inherit rpm
