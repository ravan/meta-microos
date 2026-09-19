SUMMARY = "Development files for pycxx applications"
DESCRIPTION = "PyCXX is a set of classes to help create extensions of Python in the \
C++ language. The first part encapsulates the Python C API taking care \
of exceptions and ref counting. The second part supports the building \
of Python extension modules in C++."
LICENSE = "BSD-3-Clause"

PV = "7.1.8"

RPM_NAME = "python314-pycxx-devel-7.1.8-2.5.noarch.rpm"
RPM_HASH = "048fd2e1011b569a4313966c055d8c1bfcc9d430e901e107fcf711f330deb689a5343b3181238d8720c50790070b5fc44afc8ea239a592936292f2f3e27cf818"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-CXX-devel \
python314-cxx-devel \
python314-pycxx-devel"

RDEPENDS:${PN} += "python314-pycxx"

inherit rpm
