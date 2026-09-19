SUMMARY = "Sans-io socks proxy client/server with couple io backends"
DESCRIPTION = "Sans-io (https://sans-io.readthedocs.io/) socks 4/5 client/server library/framework. \
 \
 \
* No one-shot socks servers \
* Sans-io \
* asyncio-ready twunnel3 (https://github.com/jvansteirteghem/twunnel3) is dead \
* aiosocks (https://github.com/nibrag/aiosocks) do not mimic `asyncio.open_connection` arguments (maybe dead too) \
* Fun \
 \
 \
* Only tcp connect (no bind, no udp) \
* Both client and server \
* Socks versions: 4, 4a, 5 \
* Socks5 auth: no auth, username/password \
* Couple io backends: asyncio, trio, socketserver \
* One-shot socks server (`python -m siosocks`)"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python314-siosocks-0.3.0-2.5.noarch.rpm"
RPM_HASH = "b5f337380c5227836a18ece188a056a1ed576132949d9d8430aba089fe7220d3fb3cf60111db2b6b5324c1d27994c013c39467ef9c049231ebde5186accc0814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-siosocks \
python314-siosocks \
python3dist-siosocks"

RDEPENDS:${PN} += "python-abi \
python314-trio"

inherit rpm
