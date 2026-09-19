SUMMARY = "Full-featured Telegram client library for Python 3"
DESCRIPTION = "Telethon is an asyncio Python 3 MTProto library to interact with Telegram's API \
as a user or through a bot account (bot API alternative)."
LICENSE = "MIT"

PV = "1.44.0"

RPM_NAME = "python314-Telethon-1.44.0-1.3.noarch.rpm"
RPM_HASH = "2dc3167df5183682d5e1d1f79e1b4d3f05deb5c3faec47dc6407c9b65a19f3904604a688a2c6c2e0e180de9d08c7dd69c8fdee3c097e75e2c7693d56deae3a66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-telethon \
python314-Telethon \
python3dist-telethon"

RDEPENDS:${PN} += "python-abi \
python314-pyaes \
python314-rsa"

inherit rpm
