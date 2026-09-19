SUMMARY = "Header files for NumCpp"
DESCRIPTION = "This package provides the header files for compiling code using NumCpp."
LICENSE = "MIT"

PV = "2.16.1"

RPM_NAME = "NumCpp-devel-2.16.1-1.3.noarch.rpm"
RPM_HASH = "c5c18ff9a85a92b2fe61c756e94f1a087597b3779dc9a118605057b896dfea114f75c6e8dffcb6645dacaa6cb41130d835890b1aa7acacfb99414ec3e8d672e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NumCpp-devel"

RDEPENDS:${PN} += "libboost-date-time-devel \
libboost-headers-devel \
libboost-log-devel \
libboost-numpy3-devel \
libboost-python3-devel \
libboost-thread-devel \
python3-pybind11-devel"

inherit rpm
