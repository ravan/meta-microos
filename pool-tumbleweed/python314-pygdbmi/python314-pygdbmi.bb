SUMMARY = "Parse gdb machine interface output with Python"
DESCRIPTION = "Parse gdb machine interface output with Python"
LICENSE = "MIT"

PV = "0.11.0.0"

RPM_NAME = "python314-pygdbmi-0.11.0.0-1.11.noarch.rpm"
RPM_HASH = "ebc977525482b1cf07cee733d1bb930ab0ba3cf11a4aaafc2c27e4ecd158aea692d1615d2b19115a317666602dd5d49854844b81b2a62b784a7d7381b502b0c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pygdbmi \
python314-pygdbmi \
python3dist-pygdbmi"

RDEPENDS:${PN} += "python-abi"

inherit rpm
