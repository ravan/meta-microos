SUMMARY = "Python implementation of the Unicode Collation Algorithm"
DESCRIPTION = "This is a Python implementation of the Unicode Collation Algorithm (UCA). It \
passes 100% of the UCA conformances tests for Unicode 6.3.0 with a \
variable-weighting setting of Non-ignorable."
LICENSE = "MIT"

PV = "1.2"

RPM_NAME = "python314-pyuca-1.2-5.5.noarch.rpm"
RPM_HASH = "6910733a7a78c754276e84a6e0402644ad3c168559eed876a44802d8b97ce3f88377af4e109e8115cfe6723ca8feb3fb44944a685a352942cbff1707e2e9cbdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyuca \
python314-pyuca \
python3dist-pyuca"

RDEPENDS:${PN} += "python-abi"

inherit rpm
