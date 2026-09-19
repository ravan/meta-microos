SUMMARY = "Persistent storage for pycrdt"
DESCRIPTION = "Persistent storage for pycrdt. \
 \
This is a package extracted out from pycrdt-websocket"
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "python313-pycrdt-store-0.1.3-1.4.aarch64.rpm"
RPM_HASH = "4e689c8691ecfbc7ab4f58737aa0c76913b98f6cb17152ff1584283dae54776b472eb89bd2cc784a724ff114394af7d8f0b90797b4ca3da25393cd711bd7de09"

RPROVIDES:${PN} += "python3-pycrdt-store \
python3.13dist-pycrdt-store \
python313-pycrdt-store \
python3dist-pycrdt-store"

RDEPENDS:${PN} += "-python313-anyio >= 3.6.2 with python313-anyio < 5 \
-python313-pycrdt >= 0.12.13 with python313-pycrdt < 0.13 \
-python313-sqlite-anyio >= 0.2.3 with python313-sqlite-anyio < 0.3 \
python-abi"

inherit rpm
