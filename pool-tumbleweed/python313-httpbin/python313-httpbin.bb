SUMMARY = "HTTP Request and Response Service"
DESCRIPTION = "httpbin(1): HTTP Request & Response Service \
 \
Testing an HTTP Library can become difficult sometimes. \
RequestBin is fantastic for testing POST requests, but doesn't let \
you control the response. This exists to cover \
all kinds of HTTP scenarios. Additional endpoints are being considered. \
 \
All endpoint responses are JSON-encoded."
LICENSE = "MIT"

PV = "0.10.4"

RPM_NAME = "python313-httpbin-0.10.4-1.1.noarch.rpm"
RPM_HASH = "1491e4eb064408f24a450bc22e0bd095e0b3081fab7b52dc6cbf461a6f7c96ae171d6e16502dc2c8172176d147b0fa0b2784c2cf98f854c6c7380a54b3c8a956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpbin \
python3.13dist-httpbin \
python313-httpbin \
python3dist-httpbin"

RDEPENDS:${PN} += "python-abi \
python313-Brotli \
python313-Flask \
python313-Werkzeug \
python313-decorator \
python313-flasgger \
python313-gevent \
python313-greenlet"

inherit rpm
