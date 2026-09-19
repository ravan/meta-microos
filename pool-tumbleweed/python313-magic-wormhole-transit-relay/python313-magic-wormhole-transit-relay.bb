SUMMARY = "Transit Relay server for Magic-Wormhole"
DESCRIPTION = "Transit Relay server for Magic-Wormhole"
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python313-magic-wormhole-transit-relay-0.5.0-1.2.noarch.rpm"
RPM_HASH = "c91856e69bf17873211eeb878d11e0f1e1c4f4de90a432099ad226df69187bf7d756fe0f6a4e7e1d727750e0913927a78a5b9b6c44d8163704c772dfbe344ef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-magic-wormhole-transit-relay \
python3.13dist-magic-wormhole-transit-relay \
python313-magic-wormhole-transit-relay \
python3dist-magic-wormhole-transit-relay"

RDEPENDS:${PN} += "python-abi \
python313-Twisted \
python313-autobahn"

inherit rpm
