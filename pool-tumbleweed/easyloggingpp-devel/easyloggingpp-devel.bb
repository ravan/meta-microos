SUMMARY = "Single header C++ logging library"
DESCRIPTION = "Single header C++ logging library. It is thread-aware and type safe, \
it provides ability to write logs in a customized format, and support \
for logging classes, third-party libraries, STL and third-party \
containers."
LICENSE = "MIT"

PV = "9.97.1"

RPM_NAME = "easyloggingpp-devel-9.97.1-1.7.aarch64.rpm"
RPM_HASH = "bd004a4383958be41fd3dc8b7c0118e26eb71db602d928ea9ce92027ac872ab391e804361d01554bc4a8c4664aab6166ce71f76bbc56a783d4a5d65221a1dec7"

RPROVIDES:${PN} += "easyloggingpp-devel \
pkgconfig-easyloggingpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
