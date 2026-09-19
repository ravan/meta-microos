SUMMARY = "The python pandas[performance] extra"
DESCRIPTION = "This package provides the [performance] extra for python-pandas \
 \
It is highly recommended to install this subpackage, as its dependencies \
provide speed improvements, especially when working with large data sets."
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-performance-3.0.5-2.2.noarch.rpm"
RPM_HASH = "573887f7d6f59b2324055b7abde0e7dcac20a2e3e961d658d2684851f5d1cb182d9f5a45a1b3a1ed5051e27ec2095659faec363ee4a167c9f95dafa7369297c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-performance \
python313-pandas-performance"

RDEPENDS:${PN} += "python313-Bottleneck \
python313-numba \
python313-numexpr \
python313-pandas"

inherit rpm
