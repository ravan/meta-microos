SUMMARY = "Helper to test WSGI applications"
DESCRIPTION = "This wraps any WSGI application and makes it easy to send test \
requests to that application, without starting up an HTTP server. \
 \
This provides convenient full-stack testing of applications written \
with any WSGI-compatible framework."
LICENSE = "MIT"

PV = "3.0.7"

RPM_NAME = "python313-WebTest-3.0.7-1.4.noarch.rpm"
RPM_HASH = "f14b96c2189d93449d83214d33f9111c678310fce7a8030b4148a0cf765caf6602c93b5c360405de9cce9aefee56b3d82da086e4946f5a2fbea16fa3a440c165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WebTest \
python3.13dist-webtest \
python313-WebTest \
python3dist-webtest"

RDEPENDS:${PN} += "python-abi \
python313-WebOb \
python313-beautifulsoup4 \
python313-waitress"

inherit rpm
