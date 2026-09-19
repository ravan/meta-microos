SUMMARY = "Web service for testing HTTP libraries"
DESCRIPTION = "httpbin is a web service for testing HTTP libraries. It has several \
endpoints that can test parts needed in a HTTP library. \
 \
Pytest-httpbin creates a pytest 'fixture' that is \
dependency-injected into your tests. It automatically starts up a HTTP server \
in a separate thread running httpbin and provides your test with the URL in the \
fixture."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-pytest-httpbin-2.1.0-1.5.noarch.rpm"
RPM_HASH = "69124132d2c5181da7f9d229d1ba5e51bb3226346bb5eaf23bec15dba64ed69405dd2885b1d1763e6cc98ed510be04bf464bc4259068060a40fdc4e314abe0fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-httpbin \
python314-pytest-httpbin \
python3dist-pytest-httpbin"

RDEPENDS:${PN} += "python-abi \
python314-httpbin \
python314-pytest"

inherit rpm
