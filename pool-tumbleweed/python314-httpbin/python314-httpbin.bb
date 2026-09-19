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

RPM_NAME = "python314-httpbin-0.10.4-1.1.noarch.rpm"
RPM_HASH = "d301b04d8de74f184d3f7445c973b88f8702a62dd4f40843e4a37f5e986898c32f2f0c9bd7d190f6dc03e0b1ff2c97795845febefcc2f6871a41d4b615b1b8dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-httpbin \
python314-httpbin \
python3dist-httpbin"

RDEPENDS:${PN} += "python-abi \
python314-Brotli \
python314-Flask \
python314-Werkzeug \
python314-decorator \
python314-flasgger \
python314-gevent \
python314-greenlet"

inherit rpm
