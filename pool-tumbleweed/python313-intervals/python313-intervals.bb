SUMMARY = "Python tools for handling intervals"
DESCRIPTION = "Python tools for handling intervals (ranges of comparable objects)."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "python313-intervals-0.9.2-3.5.noarch.rpm"
RPM_HASH = "b51cd31d44a160dee3a785dc6cc479139444adf3b4320c3e623ea603a7156421f621d64c0cce27bc91b38a3ba71476c1d2267452c4282041bd7b0c33c5e7df0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-intervals \
python3.13dist-intervals \
python313-intervals \
python3dist-intervals"

RDEPENDS:${PN} += "python-abi \
python313-infinity"

inherit rpm
