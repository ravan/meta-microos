SUMMARY = "A python CDF reader toolkit"
DESCRIPTION = "A python module to read/write CDF (Common Data Format .cdf) files without needing to install the CDF NASA library."
LICENSE = "MIT"

PV = "0.3.20"

RPM_NAME = "python311-cdflib-0.3.20-1.11.noarch.rpm"
RPM_HASH = "9cab0c12c707b9cb2e661485d0c3144a5f4b7497d336dd9a0974c087183200ed7e955e3ec2384879925ad24044d9d0bbc2b399be658cfd1d2e923e608cc4188d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cdflib \
python3.11dist-cdflib \
python311-cdflib \
python3dist-cdflib"

RDEPENDS:${PN} += "python-abi \
python311-attrs \
python311-numpy"

inherit rpm
