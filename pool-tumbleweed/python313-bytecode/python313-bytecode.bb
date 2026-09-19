SUMMARY = "Python module to generate and modify bytecode"
DESCRIPTION = "Python module to generate and modify bytecode"
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "python313-bytecode-0.19.0-1.1.noarch.rpm"
RPM_HASH = "f7f11ccbf22f4769130ed67b87a0dbaaf91e1c4ca1d92ae5eef223cbaa97659c771bca0c20f8d3466583fabed8fda1b2e17d3fba0ba5b14e44dcc5e250545189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bytecode \
python3.13dist-bytecode \
python313-bytecode \
python3dist-bytecode"

RDEPENDS:${PN} += "python-abi"

inherit rpm
