SUMMARY = "A python CDF reader toolkit"
DESCRIPTION = "A python module to read/write CDF (Common Data Format .cdf) files without needing to install the CDF NASA library."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "python314-cdflib-1.3.6-2.2.noarch.rpm"
RPM_HASH = "4d87e48971f6eebe20a3bfa2ec748b88d346a7bc9975548a2985a31d7229c499a8fad0454573a1d74d4f441500b88ea27ed6e3815cd75ea6992c37124ebb5d96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cdflib \
python314-cdflib \
python3dist-cdflib"

RDEPENDS:${PN} += "python-abi \
python314-numpy"

inherit rpm
