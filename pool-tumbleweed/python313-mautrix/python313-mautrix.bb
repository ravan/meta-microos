SUMMARY = "A Python 3 asyncio Matrix framework"
DESCRIPTION = "A Python 3 asyncio Matrix framework."
LICENSE = "MPL-2.0"

PV = "0.20.3"

RPM_NAME = "python313-mautrix-0.20.3-2.2.noarch.rpm"
RPM_HASH = "88f34ee61a3f979c5b2fbc7abea11108bdac91bf902e47e44ffcb2d39a7b33388ebc8c7a6b5807a063fb4108ce272fde2c469356406b72c9336346da8c1bb2d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mautrix \
python3.13dist-mautrix \
python313-mautrix \
python3dist-mautrix"

RDEPENDS:${PN} += "python-abi \
python313-aiohttp \
python313-attrs \
python313-yarl"

inherit rpm
