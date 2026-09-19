SUMMARY = "Python extensions in C++"
DESCRIPTION = "PyCXX is a set of classes to help create extensions of Python in the \
C++ language. The first part encapsulates the Python C API taking care \
of exceptions and ref counting. The second part supports the building \
of Python extension modules in C++."
LICENSE = "BSD-3-Clause"

PV = "7.1.8"

RPM_NAME = "python313-pycxx-7.1.8-2.5.noarch.rpm"
RPM_HASH = "612f67a34f61a9742cc997944a07e83951b33bbdf452f577cbc8f116ca29e26707eb6e8d4a64a465e8e635876db6ff74c690c940970e2f6d4013ba3cd46e9d6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-CXX \
python3-cxx \
python3-pycxx \
python3.13dist-cxx \
python313-CXX \
python313-cxx \
python313-pycxx \
python3dist-cxx"

RDEPENDS:${PN} += "python-abi"

inherit rpm
