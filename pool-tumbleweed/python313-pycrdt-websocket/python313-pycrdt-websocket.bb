SUMMARY = "WebSocket connector for pycrdt"
DESCRIPTION = "Pycrdt-websocket is a Python library for building WebSocket servers \
and clients that connect and synchronize shared documents. \
It can be used to create collaborative web applications."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "python313-pycrdt-websocket-0.16.0-1.4.noarch.rpm"
RPM_HASH = "97cddc5181e436a9dc397d56cd69ddc245090bce03dd6b3b5082d1554217eeca952a71d5b21eb692fe1af0ff855b4585a1542c4ce615ab3f8bcf3bd07a5a4570"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycrdt-websocket \
python3.13dist-pycrdt-websocket \
python313-pycrdt-websocket \
python3dist-pycrdt-websocket"

RDEPENDS:${PN} += "-python313-pycrdt >= 0.10.3 with python313-pycrdt < 0.13 \
-python313-sqlite-anyio >= 0.2.3 with python313-sqlite-anyio < 0.3.0 \
python-abi \
python313-anyio \
python313-pycrdt-store"

inherit rpm
