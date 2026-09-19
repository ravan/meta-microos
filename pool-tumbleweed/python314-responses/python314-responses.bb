SUMMARY = "A utility library for mocking out the `requests` Python library"
DESCRIPTION = "A utility library for mocking out the requests Python library. \
Check https://github.com/getsentry/responses for more information \
about the library."
LICENSE = "Apache-2.0"

PV = "0.26.2"

RPM_NAME = "python314-responses-0.26.2-1.1.noarch.rpm"
RPM_HASH = "a3e74565359772b3be196efa8de209f633f60a93470b29db0d1965ff7459b53f35f733197c408e8533b8f0086e9db7514da6ec9f760a6a3c05b9199e3bae0dcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-responses \
python314-responses \
python3dist-responses"

RDEPENDS:${PN} += "-python314-requests >= 2.30.0 with python314-requests < 3 \
-python314-urllib3 >= 1.25.1 with python314-urllib3 < 3 \
python-abi \
python314-PyYAML"

inherit rpm
