SUMMARY = "A Python module to bypass Cloudflare's anti-bot page"
DESCRIPTION = "A Python module to bypass Cloudflare's anti-bot page."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python313-cloudscraper-3.0.0-1.2.noarch.rpm"
RPM_HASH = "ab6c0a2aabc99c06809f81314334c31af738bf5f49898698dfd35423a3bb6f0ca9b30174d504d1758faaabd6c4dc3e1b94f1e7e2533cb42cae80c601f42bfbd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cloudscraper \
python3.13dist-cloudscraper \
python313-cloudscraper \
python3dist-cloudscraper"

RDEPENDS:${PN} += "nodejs-default \
python-abi \
python313-Brotli \
python313-Js2Py \
python313-certifi \
python313-pyOpenSSL \
python313-pycryptodome \
python313-pyparsing \
python313-requests \
python313-requests-toolbelt \
python313-websocket-client"

inherit rpm
