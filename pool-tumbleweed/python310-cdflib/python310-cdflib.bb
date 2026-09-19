SUMMARY = "A python CDF reader toolkit"
DESCRIPTION = "A python module to read/write CDF (Common Data Format .cdf) files without needing to install the CDF NASA library."
LICENSE = "MIT"

PV = "0.3.20"

RPM_NAME = "python310-cdflib-0.3.20-1.11.noarch.rpm"
RPM_HASH = "73723ed0722a9dd2508b5f49856abb337e7e2c40eb99a8b84f0f5d65f850ace257bf7f2bc54f286d18fd6b330b2b349ce71814c34dd6a85e058e1cb8a92a069e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cdflib \
python310-cdflib \
python3dist-cdflib"

RDEPENDS:${PN} += "python-abi \
python310-attrs \
python310-numpy"

inherit rpm
