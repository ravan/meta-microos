SUMMARY = "Transit Relay server for Magic-Wormhole"
DESCRIPTION = "Transit Relay server for Magic-Wormhole"
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python314-magic-wormhole-transit-relay-0.5.0-1.2.noarch.rpm"
RPM_HASH = "b460badccb3b1a3136c968a591ea1e9f738a9478b0384e98e1aa977a72942f0515c42945ab36c84d82cd8fded1b9c5fa4b0121f55ee33573106e4ce3092faaee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-magic-wormhole-transit-relay \
python314-magic-wormhole-transit-relay \
python3dist-magic-wormhole-transit-relay"

RDEPENDS:${PN} += "python-abi \
python314-Twisted \
python314-autobahn"

inherit rpm
