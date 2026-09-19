SUMMARY = "Development files for pycxx applications"
DESCRIPTION = "PyCXX is a set of classes to help create extensions of Python in the \
C++ language. The first part encapsulates the Python C API taking care \
of exceptions and ref counting. The second part supports the building \
of Python extension modules in C++."
LICENSE = "BSD-3-Clause"

PV = "7.1.8"

RPM_NAME = "python313-pycxx-devel-7.1.8-2.5.noarch.rpm"
RPM_HASH = "5bc2996718049fc6e9386fda30b59bc054f267cc517a925ab7686807a282e3c34108fd791dac619f474581d040b16bcbaff947fffa945ad11ba452eea113d948"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-CXX-devel \
python3-cxx-devel \
python3-pycxx-devel \
python313-CXX-devel \
python313-cxx-devel \
python313-pycxx-devel"

RDEPENDS:${PN} += "python313-pycxx"

inherit rpm
