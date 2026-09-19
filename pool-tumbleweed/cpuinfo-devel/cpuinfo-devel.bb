SUMMARY = "Headers for the cpuinfo library"
DESCRIPTION = "cpuinfo is a library to detect essential for performance optimization \
information about host CPU. \
 \
This subpackage contains development files like headers and cmake \
scripts."
LICENSE = "BSD-2-Clause"

PV = "0~git1739936485.b73ae6c"

RPM_NAME = "cpuinfo-devel-0~git1739936485.b73ae6c-2.5.aarch64.rpm"
RPM_HASH = "562e120b8c4e9fb2e4ea3d44be720cc7785fb0d1d031d426e32ac88beae28202493edc771a07e293659fd98eaeb4fa38b06aeba624e20aec25369ea4b2a1a07f"

RPROVIDES:${PN} += "cpuinfo-devel \
pkgconfig-libcpuinfo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcpuinfo-suse0"

inherit rpm
