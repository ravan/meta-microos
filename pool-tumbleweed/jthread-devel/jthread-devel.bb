SUMMARY = "Development files for libjthread"
DESCRIPTION = "The JThread package provides some classes to make use of threads on \
different platforms. The classes are actually wrappers around \
existing thread implementations. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libjthread."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "jthread-devel-1.3.3-1.29.aarch64.rpm"
RPM_HASH = "36eccf78d2e3bb37979c1bf475a3fc6351cac1e5b504da64e51c74162099b343b5eb563d287f0615e15d4b8b2ade780efa8f25b6a27152c6c00f9532b9e93e79"

RPROVIDES:${PN} += "cmake-JThread \
jthread-devel \
pkgconfig-jthread"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjthread1-3-3"

inherit rpm
