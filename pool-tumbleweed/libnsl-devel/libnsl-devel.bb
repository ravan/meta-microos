SUMMARY = "Development package for Network Support Library (NIS)"
DESCRIPTION = "The Network Support Library for NIS was formerly part of glibc and \
is now a standalone library. The big difference is, that this library \
has support for IPv6. \
This package contains all files to develop and link against libnsl."
LICENSE = "LGPL-2.1-only"

PV = "2.0.0"

RPM_NAME = "libnsl-devel-2.0.0-1.24.aarch64.rpm"
RPM_HASH = "e4754e365ec05148261026d05fe33f5d1694d0e72149d618c5d548f4936e71f418e8e1141a7f4ec6b4c18b9fb81c3d9b52887cd30247f2ef0691a6bdbc0232cc"

RPROVIDES:${PN} += "libnsl-devel \
pkgconfig-libnsl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnsl3 \
pkgconfig-libtirpc"

inherit rpm
