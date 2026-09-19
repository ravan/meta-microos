SUMMARY = "Mock HTTPX with request patterns and response side effects"
DESCRIPTION = "Python library to mock httpx with request patterns and responses"
LICENSE = "BSD-3-Clause"

PV = "0.23.1"

RPM_NAME = "python313-respx-0.23.1-1.2.noarch.rpm"
RPM_HASH = "e8054cdb6dd4e1c67d508fd31e5763e58418e0a0bbcb6b263a68c49c2129181dc9fc8ec56bbe0420d4d7d69d838e7ff21091fbfb389a8de6b73e2e83da1df3eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-respx \
python3.13dist-respx \
python313-respx \
python3dist-respx"

RDEPENDS:${PN} += "python-abi \
python313-httpx"

inherit rpm
