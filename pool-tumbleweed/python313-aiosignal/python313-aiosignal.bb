SUMMARY = "a list of registered asynchronous callbacks"
DESCRIPTION = "A project to manage callbacks in asyncio projects. \
Signal is a list of registered asynchronous callbacks."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python313-aiosignal-1.4.0-1.5.noarch.rpm"
RPM_HASH = "4049a409e963f346368b03b2e83394275874de2346c19c493029b092602c1894211935a3c905e11b5de5a3873f94246b899ea2a574aafc839f1b7de9ff21d94d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiosignal \
python3.13dist-aiosignal \
python313-aiosignal \
python3dist-aiosignal"

RDEPENDS:${PN} += "python-abi \
python313-frozenlist"

inherit rpm
