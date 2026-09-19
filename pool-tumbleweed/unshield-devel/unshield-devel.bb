SUMMARY = "Header files, libraries and development documentation for libunshield1"
DESCRIPTION = "This package contains the header files, static libraries and development \
documentation for libunshield1. If you like to develop programs using libunshield1, \
you will need to install unshield-devel."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "unshield-devel-1.6.2-1.4.aarch64.rpm"
RPM_HASH = "a4681d4217e64faccbf20e0ca70e9f6d10335fd6eefa94eaef63038825bfca7254ac433cde8cb3d260a8869924a0fe8633bdd0a2369e729bfcebd2e5a92516b4"

RPROVIDES:${PN} += "cmake-unshield \
libunshield \
pkgconfig-libunshield \
unshield-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libunshield1"

inherit rpm
