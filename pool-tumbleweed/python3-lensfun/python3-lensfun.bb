SUMMARY = "Python3 lensfun bindings"
DESCRIPTION = "Lensfun bindings for Python 3"
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.4"

RPM_NAME = "python3-lensfun-0.3.4-7.5.noarch.rpm"
RPM_HASH = "6e732851b0a513beac3f813643547c530a5afc6fa8e1a7a798319774fe724dc129bf45b79e5d7b094e98ed8d82dabcedf04c5bae563dd44cd2ba4747ecc195a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lensfun \
python3.13dist-lensfun \
python3dist-lensfun"

RDEPENDS:${PN} += "liblensfun1 \
python-abi"

inherit rpm
