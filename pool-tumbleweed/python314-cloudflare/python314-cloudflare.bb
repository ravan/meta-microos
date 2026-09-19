SUMMARY = "Python wrapper for the Cloudflare v4 API"
DESCRIPTION = "Python wrapper for the Cloudflare Client API v4. \
 \
The Cloudflare Python library provides convenient access to the Cloudflare REST \
API from any Python 3.9+ application. The library includes type definitions for \
all request params and response fields, and offers both synchronous and \
asynchronous clients powered by httpx."
LICENSE = "MIT"

PV = "4.3.1"

RPM_NAME = "python314-cloudflare-4.3.1-2.4.noarch.rpm"
RPM_HASH = "86f42b3b76f6170e0ede63c48c7254a762c788df0e676f14d501a9c1c63a8d01f5a9f698d67377d7444d049d51e24c88a2ca668b349af2f11cb415082fd34bb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cloudflare \
python314-cloudflare \
python3dist-cloudflare"

RDEPENDS:${PN} += "python-abi \
python314-anyio \
python314-distro \
python314-httpx \
python314-pydantic \
python314-sniffio \
python314-typing-extensions"

inherit rpm
