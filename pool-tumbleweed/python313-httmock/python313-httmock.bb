SUMMARY = "A mocking library for requests"
DESCRIPTION = "A mocking library for requests. \
 \
You can use it to mock third-party APIs and test libraries that use \
`requests` internally, conditionally using mocked replies with the \
`urlmatch` decorator."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python313-httmock-1.4.0-2.5.noarch.rpm"
RPM_HASH = "d4c00f06652b4d8044f6c40a13ffc44946d7f6dd2c3ea2604af897217c6b36f1c3b592335e28058268c9a5d495dcd750af3794393fff9bdaeda43b308e636fd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httmock \
python3.13dist-httmock \
python313-httmock \
python3dist-httmock"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
