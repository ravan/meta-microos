SUMMARY = "A Python 3 asyncio Matrix framework"
DESCRIPTION = "A Python 3 asyncio Matrix framework."
LICENSE = "MPL-2.0"

PV = "0.20.3"

RPM_NAME = "python314-mautrix-0.20.3-2.2.noarch.rpm"
RPM_HASH = "9d55e6082707057567673bb9af236e419c6c9c36c7b9d0e5ed9fe8a3ecabdd18ae1cec43de18639317c04420ee4fd7744b313e0741472a7e7ffc72b961efd255"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mautrix \
python314-mautrix \
python3dist-mautrix"

RDEPENDS:${PN} += "python-abi \
python314-aiohttp \
python314-attrs \
python314-yarl"

inherit rpm
