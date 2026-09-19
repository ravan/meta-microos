SUMMARY = "Header-only C++ binding for libzmq"
DESCRIPTION = "cppzmq is a header-only C++ binding for libzmq."
LICENSE = "MIT"

PV = "4.11.0"

RPM_NAME = "cppzmq-devel-4.11.0-1.4.aarch64.rpm"
RPM_HASH = "e9d0915812986087409ae9ef70f6a0a396e2f9c0079ddfa7eaeedc44776786ce24721ebddbc4cab2093243598a592001d2103ef24561ad5aa681a0fd0fb87821"

RPROVIDES:${PN} += "cmake-cppzmq \
cppzmq-devel \
pkgconfig-cppzmq"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-libzmq"

inherit rpm
