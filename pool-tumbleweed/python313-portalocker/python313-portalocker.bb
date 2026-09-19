SUMMARY = "Locking library for Python"
DESCRIPTION = "Portalocker is a library to provide an API to file locking. \
 \
On Linux and Unix systems, the locks are advisory by default. By \
specifying the `-o mand` option to the mount command, it is possible \
to enable mandatory file locking on Linux. This is generally not \
recommended however."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python313-portalocker-3.0.0-2.7.noarch.rpm"
RPM_HASH = "5851150989cec6805f74983dd67bda2f5b1f2c63c896fc49661dcfb440c2c7afe0780469722e6e9e63e61734f9104e2cfce06a68fcaff1395a04b243f822c21a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-portalocker \
python3.13dist-portalocker \
python313-portalocker \
python3dist-portalocker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
