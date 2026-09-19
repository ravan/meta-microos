SUMMARY = "A screenshot Python module"
DESCRIPTION = "PyScreeze is a screenshot module for Python 3."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python313-PyScreeze-1.0.1-1.2.noarch.rpm"
RPM_HASH = "b3497143ece746f9f462ddeab2b0025b89274088ac96caa07e87c296efee6f4c05e63bcce433f5df116cb32da665e61ef50551bc715cc33a853f43aee5179ec0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyScreeze \
python3.13dist-pyscreeze \
python313-PyScreeze \
python3dist-pyscreeze"

RDEPENDS:${PN} += "python-abi \
python313-Pillow"

inherit rpm
