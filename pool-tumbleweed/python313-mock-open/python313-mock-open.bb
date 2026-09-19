SUMMARY = "A better mock for file I/O"
DESCRIPTION = "A better mock for file I/O"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python313-mock-open-1.4.0-3.12.noarch.rpm"
RPM_HASH = "9f17ef7574aaa41a26d8d9800c2be5f82b3f55f3c52658c3c4530bbddb1c789a158ec9ef75477528674ac12d988878a8eba23a2a97af47f9a65c5e6c69fd6524"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mock-open \
python3.13dist-mock-open \
python313-mock-open \
python3dist-mock-open"

RDEPENDS:${PN} += "python-abi"

inherit rpm
