SUMMARY = "Development files for libfwsi"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries.  libyal is typically used in digital forensic tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfwsi."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260522"

RPM_NAME = "libfwsi-devel-20260522-1.9.aarch64.rpm"
RPM_HASH = "749798415f24b322c412270aeac039ca7a59872dce0b5c9190626184cfd100d71d8995e37f742798601a720f6570a224c45037c1c31687da5dd457b59e3f1d45"

RPROVIDES:${PN} += "libfwsi-devel \
pkgconfig-libfwsi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfwsi1"

inherit rpm
