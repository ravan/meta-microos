SUMMARY = "Full-featured Telegram client library for Python 3"
DESCRIPTION = "Telethon is an asyncio Python 3 MTProto library to interact with Telegram's API \
as a user or through a bot account (bot API alternative)."
LICENSE = "MIT"

PV = "1.44.0"

RPM_NAME = "python313-Telethon-1.44.0-1.3.noarch.rpm"
RPM_HASH = "976297aa13cce562ba26589c0afc3eba4fe52aa4854538697dab394ed2be89db5fca1830ccd46446ccedc416362116eff47ff456659f90b1905865554f172810"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Telethon \
python3.13dist-telethon \
python313-Telethon \
python3dist-telethon"

RDEPENDS:${PN} += "python-abi \
python313-pyaes \
python313-rsa"

inherit rpm
