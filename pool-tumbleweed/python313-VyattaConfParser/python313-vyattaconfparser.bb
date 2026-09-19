SUMMARY = "A python config parser for Vyatta/VyOS"
DESCRIPTION = "Vyatta/VyOS config parser with unicode support and without dependencies."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python313-VyattaConfParser-0.5.5-2.5.noarch.rpm"
RPM_HASH = "cae232a3d0be60ee08eb28ff449d8cf3d266f62891485277fda79c2e3a421f06c5e38081f3125376e25acbbe1ebe860f96f0ec9f370f14c0b6391eb3e58090f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-VyattaConfParser \
python3.13dist-vyattaconfparser \
python313-VyattaConfParser \
python3dist-vyattaconfparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
