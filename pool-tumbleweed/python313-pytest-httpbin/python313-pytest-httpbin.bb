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

RPM_NAME = "python313-pytest-httpbin-2.1.0-1.5.noarch.rpm"
RPM_HASH = "2ac7616f617b0a735c45fca643984bdbe54d10040893b61922498b6b7c89e591aeaa60f7b452ac8471089dc6ec7058daecf9eea56eda583b86b1570ebda7f34b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-httpbin \
python3.13dist-pytest-httpbin \
python313-pytest-httpbin \
python3dist-pytest-httpbin"

RDEPENDS:${PN} += "python-abi \
python313-httpbin \
python313-pytest"

inherit rpm
