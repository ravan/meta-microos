SUMMARY = "Python wrapper for the Cloudflare v4 API"
DESCRIPTION = "Python wrapper for the Cloudflare Client API v4. \
 \
The Cloudflare Python library provides convenient access to the Cloudflare REST \
API from any Python 3.9+ application. The library includes type definitions for \
all request params and response fields, and offers both synchronous and \
asynchronous clients powered by httpx."
LICENSE = "MIT"

PV = "4.3.1"

RPM_NAME = "python313-cloudflare-4.3.1-2.4.noarch.rpm"
RPM_HASH = "f94896ccab845755ca95d44cc6371b265983417a307758ad5574473e8c391bb6069ea7c96494bf8a48a1050f1335146d39bf80dd5dc59a6bf90c4cdd0ddf5ab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cloudflare \
python3.13dist-cloudflare \
python313-cloudflare \
python3dist-cloudflare"

RDEPENDS:${PN} += "python-abi \
python313-anyio \
python313-distro \
python313-httpx \
python313-pydantic \
python313-sniffio \
python313-typing-extensions"

inherit rpm
