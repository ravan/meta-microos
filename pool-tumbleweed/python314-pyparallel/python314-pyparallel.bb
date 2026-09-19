SUMMARY = "Python Parallel Port Extension"
DESCRIPTION = "This module encapsulates the access for the parallel port. It provides \
backends for Python running on Windows and Linux."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python314-pyparallel-0.2.2-4.5.noarch.rpm"
RPM_HASH = "85f8e558fcbc734556f15b0d0c7c7f0b726d44afb8be03f08022691df906b087c321d86fbc39810360deb6aa7f1cf8a2b95d226d0488887111595becd81fc49d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyparallel \
python314-pyparallel \
python3dist-pyparallel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
