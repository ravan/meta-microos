SUMMARY = "Extend python requests with exponential back-off retry"
DESCRIPTION = "A Python library for HTTP requests using requests package with \
exponential back-off retry."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python314-retryrequests-0.2.0-2.5.noarch.rpm"
RPM_HASH = "a2bd4d0b03b6d9f9b8a1b12d8c30a852947063a52bd3184788ca1d97e4ee3836381eb35167770f2718b74ec9c69a6639cae29801b173fe102774eb3e2486b22f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-retryrequests \
python314-retryrequests \
python3dist-retryrequests"

RDEPENDS:${PN} += "python-abi \
python314-requests \
python314-setuptools"

inherit rpm
