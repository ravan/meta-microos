SUMMARY = "Types for the calmjs framework"
DESCRIPTION = "A collection of types (mostly exception classes) for use with |calmjs|_."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-calmjs.types-1.0.1-4.5.noarch.rpm"
RPM_HASH = "160a2bc0115f81f94138537013e729334737eea27a90a890d04af52f0e756f90a09d04aafa2f48bb82532e78487efe53f2359d1539538a241802182121543393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-calmjs.types \
python3.13dist-calmjs.types \
python313-calmjs.types \
python3dist-calmjs.types"

RDEPENDS:${PN} += "python-abi \
python313-setuptools"

inherit rpm
