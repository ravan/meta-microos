SUMMARY = "Structured Logging for Python"
DESCRIPTION = "structlog makes logging in Python less painful and more powerful by adding \
structure to your log entries. \
 \
It’s up to you whether you want structlog to take care about the output of your \
log entries or whether you prefer to forward them to an existing logging system \
like the standard library’s logging module."
LICENSE = "Apache-2.0 | MIT"

PV = "26.1.0"

RPM_NAME = "python313-structlog-26.1.0-1.3.noarch.rpm"
RPM_HASH = "a02bb304b170df2704fe046e33ebe6ccb990d9555a2acad1c34485b061ffc93e9a0bc57232c67801bca2abe68b74c06d3f56ded4cf0342914c94d3f439fa5c65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-structlog \
python3.13dist-structlog \
python313-structlog \
python3dist-structlog"

RDEPENDS:${PN} += "python-abi"

inherit rpm
