SUMMARY = "A python CDF reader toolkit"
DESCRIPTION = "A python module to read/write CDF (Common Data Format .cdf) files without needing to install the CDF NASA library."
LICENSE = "MIT"

PV = "0.3.20"

RPM_NAME = "python312-cdflib-0.3.20-1.11.noarch.rpm"
RPM_HASH = "8337fb7f609690344a9c94cc1414d6d9313abf2f4004c1167c834bc2028416da702e17b7a550577d51d1b860cbd3b3dc8ba5cf736bd778edf89ad2285916d1b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-cdflib \
python312-cdflib \
python3dist-cdflib"

RDEPENDS:${PN} += "python-abi \
python312-attrs \
python312-numpy"

inherit rpm
