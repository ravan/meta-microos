SUMMARY = "Key exchange and control message server for Magic-Wormhole"
DESCRIPTION = "The main server for Magic-Wormhole. This server performs \
store-and-forward delivery for small key-exchange and control \
messages. Bulk data is sent over a direct TCP connection, or through \
a transit-relay."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python314-magic-wormhole-mailbox-server-0.8.0-1.1.noarch.rpm"
RPM_HASH = "cfe26227a82d2f510c55992b267dc2c8e2eff0207c9545b41bbb6fc93b50ba7f88548103c2891d4dd03711cd60052e863b01d300bd9925399650f308cf6669ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-magic-wormhole-mailbox-server \
python314-magic-wormhole-mailbox-server \
python3dist-magic-wormhole-mailbox-server"

RDEPENDS:${PN} += "python-abi \
python314-Twisted-tls \
python314-attrs \
python314-autobahn \
python314-setuptools"

inherit rpm
