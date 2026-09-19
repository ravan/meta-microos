SUMMARY = "Generic floating point handling in Python"
DESCRIPTION = "Generic floating point handling in Python"
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python314-gfloat-0.4-2.2.noarch.rpm"
RPM_HASH = "8065123be0a3e5373cfdf4bf77d75fcddfb39c74139cffefcdb180cea2d3480c1ca39d134ea4a3314329649ae355faf2c1e1e05342bf3a7d226a710c7ec47ecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gfloat \
python314-gfloat \
python3dist-gfloat"

RDEPENDS:${PN} += "python-abi \
python314-more-itertools \
python314-numpy"

inherit rpm
