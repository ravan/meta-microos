SUMMARY = "Constants used in Chinese text processing"
DESCRIPTION = "Zhon provides constants used in Chinese text processing."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python314-zhon-2.1.1-1.9.noarch.rpm"
RPM_HASH = "627a2937f87dfc067829f87935e81f432c82359190ba870b417b652a4a97181bf94bae849eb68bf334122b193a7562bfec0a484cbc3bc4cb30f26da739bd1338"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zhon \
python314-zhon \
python3dist-zhon"

RDEPENDS:${PN} += "python-abi"

inherit rpm
