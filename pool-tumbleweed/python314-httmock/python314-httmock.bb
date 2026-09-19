SUMMARY = "A mocking library for requests"
DESCRIPTION = "A mocking library for requests. \
 \
You can use it to mock third-party APIs and test libraries that use \
`requests` internally, conditionally using mocked replies with the \
`urlmatch` decorator."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python314-httmock-1.4.0-2.5.noarch.rpm"
RPM_HASH = "410738a680e42cbf0645fc953117c82440a510ca69e494649f7ee7c6f4749b05cc939a28a8bebdfda35dc392f81b05fc98a7928ed8c2c9e8d31a40e662f93aad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-httmock \
python314-httmock \
python3dist-httmock"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
