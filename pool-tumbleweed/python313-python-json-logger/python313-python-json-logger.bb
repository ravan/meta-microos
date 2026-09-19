SUMMARY = "A python library adding a json log formatter"
DESCRIPTION = "A python library adding a json log formatter."
LICENSE = "BSD-2-Clause"

PV = "4.1.0"

RPM_NAME = "python313-python-json-logger-4.1.0-1.2.noarch.rpm"
RPM_HASH = "84f6a7e25ed844776ed3d39277f1ae78df176c2a662133d59e44196fad3b92528b36028242c310d3e3ede1436c75b963128c1a056addc58ab701a3ff07af770c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-json-logger \
python3.13dist-python-json-logger \
python313-python-json-logger \
python3dist-python-json-logger"

RDEPENDS:${PN} += "python-abi"

inherit rpm
