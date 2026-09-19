SUMMARY = "The python pandas[feather] extra"
DESCRIPTION = "This package provides the [feather] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-feather-3.0.5-2.2.noarch.rpm"
RPM_HASH = "78923161db852595fbae3b2aa532a61cc83461a95810e7603c30c1c381177c3f6cffb084c4e4f48ee0f7bc9e8761f4c906e4814f38fa9fab5d74fe0eb4192874"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pandas-feather"

RDEPENDS:${PN} += "python314-pandas \
python314-pyarrow"

inherit rpm
