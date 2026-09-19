SUMMARY = "Python extensions in C++"
DESCRIPTION = "PyCXX is a set of classes to help create extensions of Python in the \
C++ language. The first part encapsulates the Python C API taking care \
of exceptions and ref counting. The second part supports the building \
of Python extension modules in C++."
LICENSE = "BSD-3-Clause"

PV = "7.1.8"

RPM_NAME = "python314-pycxx-7.1.8-2.5.noarch.rpm"
RPM_HASH = "60f6cf298aa2d6ca579db3bc600fd2cb6875edf557402ed973fbce070c6c233636ee610f3be2906fbf0b492f9a0e6a160b7effd93f4a5e4c71205e5e408fd6f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cxx \
python314-CXX \
python314-cxx \
python314-pycxx \
python3dist-cxx"

RDEPENDS:${PN} += "python-abi"

inherit rpm
