SUMMARY = "Generic floating point handling in Python"
DESCRIPTION = "Generic floating point handling in Python"
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python313-gfloat-0.4-2.2.noarch.rpm"
RPM_HASH = "14cae83e0440c73e794c77e63094b752dc4fd441370d53c8c5a0104621182509d4917c620d74d67fa297505028f9a1d3080a1f03d34864c5ccac4d80a687de75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gfloat \
python3.13dist-gfloat \
python313-gfloat \
python3dist-gfloat"

RDEPENDS:${PN} += "python-abi \
python313-more-itertools \
python313-numpy"

inherit rpm
