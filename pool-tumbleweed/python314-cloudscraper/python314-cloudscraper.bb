SUMMARY = "A Python module to bypass Cloudflare's anti-bot page"
DESCRIPTION = "A Python module to bypass Cloudflare's anti-bot page."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python314-cloudscraper-3.0.0-1.2.noarch.rpm"
RPM_HASH = "b2cb107e92433e6510985506696b02e67dc378a68731e2c60c9a8a0bc3046a58f97a416107d049e5fbf38acd5ebea3c7db7b5142e5e52990d35e4142339b009b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cloudscraper \
python314-cloudscraper \
python3dist-cloudscraper"

RDEPENDS:${PN} += "nodejs-default \
python-abi \
python314-Brotli \
python314-Js2Py \
python314-certifi \
python314-pyOpenSSL \
python314-pycryptodome \
python314-pyparsing \
python314-requests \
python314-requests-toolbelt \
python314-websocket-client"

inherit rpm
