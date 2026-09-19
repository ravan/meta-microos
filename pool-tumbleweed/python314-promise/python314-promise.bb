SUMMARY = "Promises/A+ implementation for Python"
DESCRIPTION = "This is an implementation of Promises in Python"
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python314-promise-2.3.0-7.5.noarch.rpm"
RPM_HASH = "7e0c8c66ecb0711ac288d5d67740b8a35efe545a06be445567ca84dedd2695d85dd5193af786995d750665e3ace3bf63f3b97a0eaf019905322becdd0e3ed432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-promise \
python314-promise \
python3dist-promise"

RDEPENDS:${PN} += "python-abi"

inherit rpm
