SUMMARY = "Locking library for Python"
DESCRIPTION = "Portalocker is a library to provide an API to file locking. \
 \
On Linux and Unix systems, the locks are advisory by default. By \
specifying the `-o mand` option to the mount command, it is possible \
to enable mandatory file locking on Linux. This is generally not \
recommended however."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python314-portalocker-3.0.0-2.7.noarch.rpm"
RPM_HASH = "bad9f3664e3d5ae4a8a9a59a1094a9fb23123bb7922cefa9cd25f0b55f4c7a1da6737d47882147e63dfd4cf00401c31972dd38d0f072599704fd20471f0e2128"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-portalocker \
python314-portalocker \
python3dist-portalocker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
