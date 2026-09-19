SUMMARY = "Python argument design patterns in a composable interface"
DESCRIPTION = "Python argument design patterns in a composable interface."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "python313-python-args-1.0.2-2.5.noarch.rpm"
RPM_HASH = "401dc365992d482013b952b9e6079b232b78853f124b4b9d9e32d3f28bcfa992f1168b5c5ee8ffd5ec1a7e6d09658dd7f0158d16871aba234faec7f2d8167cb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-args \
python3.13dist-python-args \
python313-python-args \
python3dist-python-args"

RDEPENDS:${PN} += "python-abi"

inherit rpm
