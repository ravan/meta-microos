SUMMARY = "WebSocket and WAMP in Python for Twisted and asyncio"
DESCRIPTION = "WebSocket allows bidirectional real-time messaging on the Web and WAMP adds \
asynchronous Remote Procedure Calls and Publish & Subscribe on top of WebSocket."
LICENSE = "MIT"

PV = "26.6.1"

RPM_NAME = "python314-txaio-26.6.1-1.1.noarch.rpm"
RPM_HASH = "e60eba5489eac3e96a1550f60e29bb78e624c8575025fc7b0ef3abf5c6a0a3d368074b8c2c7eb56f76d56462fd5a95987f0e2df058991a41e4467ad3da1cff9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-txaio \
python314-txaio \
python3dist-txaio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
