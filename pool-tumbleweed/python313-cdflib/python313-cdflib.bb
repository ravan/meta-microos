SUMMARY = "A python CDF reader toolkit"
DESCRIPTION = "A python module to read/write CDF (Common Data Format .cdf) files without needing to install the CDF NASA library."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "python313-cdflib-1.3.6-2.2.noarch.rpm"
RPM_HASH = "3a22b4157e7cf4e84ada804934d2c7b5c7da8f24c10acb23ae28257da0a779dd122c9f2117a6522dab17b3fb4a82b59574be8b4736235c0b1bf08d49782c1b75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cdflib \
python3.13dist-cdflib \
python313-cdflib \
python3dist-cdflib"

RDEPENDS:${PN} += "python-abi \
python313-numpy"

inherit rpm
