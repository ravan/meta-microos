SUMMARY = "Helper to test WSGI applications"
DESCRIPTION = "This wraps any WSGI application and makes it easy to send test \
requests to that application, without starting up an HTTP server. \
 \
This provides convenient full-stack testing of applications written \
with any WSGI-compatible framework."
LICENSE = "MIT"

PV = "3.0.7"

RPM_NAME = "python314-WebTest-3.0.7-1.4.noarch.rpm"
RPM_HASH = "6eb00c23e906177cf9662403a57c17799a447abe6f94b1c25490ca96f895e917e2f2ef8a4c70f2fdb51dbd9987e9a7a4fc6af065321bcb968cc3de389b28b3e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-webtest \
python314-WebTest \
python3dist-webtest"

RDEPENDS:${PN} += "python-abi \
python314-WebOb \
python314-beautifulsoup4 \
python314-waitress"

inherit rpm
