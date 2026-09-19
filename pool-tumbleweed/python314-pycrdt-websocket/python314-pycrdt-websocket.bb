SUMMARY = "WebSocket connector for pycrdt"
DESCRIPTION = "Pycrdt-websocket is a Python library for building WebSocket servers \
and clients that connect and synchronize shared documents. \
It can be used to create collaborative web applications."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "python314-pycrdt-websocket-0.16.0-1.4.noarch.rpm"
RPM_HASH = "5d03f6e4ce67343bf071c6432b6c0bb8a3708294a3a53825ff61a6c8bd6994d3bf52087fcf0f8bf8d86b65fd7d2292ae186160def01abad7e4180f3d9a4ff673"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pycrdt-websocket \
python314-pycrdt-websocket \
python3dist-pycrdt-websocket"

RDEPENDS:${PN} += "-python314-pycrdt >= 0.10.3 with python314-pycrdt < 0.13 \
-python314-sqlite-anyio >= 0.2.3 with python314-sqlite-anyio < 0.3.0 \
python-abi \
python314-anyio \
python314-pycrdt-store"

inherit rpm
