SUMMARY = "Converts python exception instance to human-readable error messages"
DESCRIPTION = "A Python library for convert Exception instance to a human-readable \
error message."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python314-msgfy-0.2.1-1.7.noarch.rpm"
RPM_HASH = "12b67003f40ca885a07d0d5ecd2ed2ea707f2b463d03cc266a6f16b5f835595b3894aeb979bafa1678507ae088a3e7ce761295eb856d61d091f44216004cbe1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-msgfy \
python314-msgfy \
python3dist-msgfy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
