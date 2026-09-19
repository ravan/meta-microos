SUMMARY = "Module to mock out responses from the requests package"
DESCRIPTION = "requests-mock provides a building block to stub out the HTTP requests portions of your testing code. \
You should checkout the docs for more information."
LICENSE = "Apache-2.0"

PV = "1.12.1"

RPM_NAME = "python314-requests-mock-1.12.1-4.3.noarch.rpm"
RPM_HASH = "95b4a37d4a93fdfc830c30b607c011bb2e729196caa4fc288f9add4bfd1d30f9dfa1b008ebd894e9cd2b415e323d0938a8a0ced7a5691f16c1577baf3c66b223"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requests-mock \
python314-requests-mock \
python3dist-requests-mock"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
