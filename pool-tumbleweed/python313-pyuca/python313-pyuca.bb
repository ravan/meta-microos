SUMMARY = "Python implementation of the Unicode Collation Algorithm"
DESCRIPTION = "This is a Python implementation of the Unicode Collation Algorithm (UCA). It \
passes 100% of the UCA conformances tests for Unicode 6.3.0 with a \
variable-weighting setting of Non-ignorable."
LICENSE = "MIT"

PV = "1.2"

RPM_NAME = "python313-pyuca-1.2-5.5.noarch.rpm"
RPM_HASH = "953d7a3bc066f1fbe8551c54ca6f684b7069debbd500631de5a648ff9c7cf1bb8239a6f1f7a639931e6aa34ce7d563e2f2a9809143c355d11e737e090dcfcead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyuca \
python3.13dist-pyuca \
python313-pyuca \
python3dist-pyuca"

RDEPENDS:${PN} += "python-abi"

inherit rpm
