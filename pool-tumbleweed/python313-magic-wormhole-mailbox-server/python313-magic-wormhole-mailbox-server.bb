SUMMARY = "Key exchange and control message server for Magic-Wormhole"
DESCRIPTION = "The main server for Magic-Wormhole. This server performs \
store-and-forward delivery for small key-exchange and control \
messages. Bulk data is sent over a direct TCP connection, or through \
a transit-relay."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python313-magic-wormhole-mailbox-server-0.8.0-1.1.noarch.rpm"
RPM_HASH = "2fd8c7e8683a84b7b5736ea57bb6cc988d11d705f48a356cfb7da028905eba232d71c1339fce6fc6b66cc4ec7c3122f9695bf316add535b59aa853ee66fbe176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-magic-wormhole-mailbox-server \
python3.13dist-magic-wormhole-mailbox-server \
python313-magic-wormhole-mailbox-server \
python3dist-magic-wormhole-mailbox-server"

RDEPENDS:${PN} += "python-abi \
python313-Twisted-tls \
python313-attrs \
python313-autobahn \
python313-setuptools"

inherit rpm
