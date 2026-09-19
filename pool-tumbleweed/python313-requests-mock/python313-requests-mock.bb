SUMMARY = "Module to mock out responses from the requests package"
DESCRIPTION = "requests-mock provides a building block to stub out the HTTP requests portions of your testing code. \
You should checkout the docs for more information."
LICENSE = "Apache-2.0"

PV = "1.12.1"

RPM_NAME = "python313-requests-mock-1.12.1-4.3.noarch.rpm"
RPM_HASH = "30ae24d64a0ba3dd499b630d00ce545dba526e4e7d80da2361b39558db14792255f426bb4b039dd947415f09aceaf8534e39394937ad8fb667c4ff41fa06bf20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-mock \
python3.13dist-requests-mock \
python313-requests-mock \
python3dist-requests-mock"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
