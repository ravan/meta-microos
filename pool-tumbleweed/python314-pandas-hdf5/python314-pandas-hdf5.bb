SUMMARY = "The python pandas[hdf5] extra"
DESCRIPTION = "This package provides the [hdf5] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-hdf5-3.0.5-2.2.noarch.rpm"
RPM_HASH = "be3d98937b878b518cd5165451cc1f86430c1699a5a8dfc76697ea70ddf09d3d14a313f34e3311fc6ff0f6c052dc35ff4d15aa72b689284bfc14de1b8e5de127"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pandas-hdf5"

RDEPENDS:${PN} += "python314-blosc \
python314-pandas \
python314-tables"

inherit rpm
