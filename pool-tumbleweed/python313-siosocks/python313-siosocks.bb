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

RPM_NAME = "python313-siosocks-0.3.0-2.5.noarch.rpm"
RPM_HASH = "0ea221377ea7baa6a4b4628122b96268727f259781a8826023b78b0dae06aebd16893406bc24f07efac2ae75f27304ad8675cbb19b3e55f456f2e9d4e38f4641"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-siosocks \
python3.13dist-siosocks \
python313-siosocks \
python3dist-siosocks"

RDEPENDS:${PN} += "python-abi \
python313-trio"

inherit rpm
