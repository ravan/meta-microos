SUMMARY = "Utility to check API integrity in python libraries"
DESCRIPTION = "Utility to check API integrity in Python libraries."
LICENSE = "MIT"

PV = "0.0.6"

RPM_NAME = "python314-pyux-0.0.6-2.5.noarch.rpm"
RPM_HASH = "d38abbbb39de5a62038cebb94106051e154fb5db9352972dced66e7e39905725116f64bd4be2b855aebb490dbe1784556db0c7f85f34bfc255bde4324dfcdb6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyux \
python314-pyux \
python3dist-pyux"

RDEPENDS:${PN} += "python-abi"

inherit rpm
