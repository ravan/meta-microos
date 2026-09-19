SUMMARY = "Headers and shared development libraries for hwloc"
DESCRIPTION = "This package contains the headers and shared object symbolic links \
for the hwloc."
LICENSE = "BSD-3-Clause"

PV = "2.13.0"

RPM_NAME = "hwloc-devel-2.13.0-1.3.aarch64.rpm"
RPM_HASH = "b3d740b6849e6c7bdac3cdd33198c5487d0a4fe5e0a73121ad7c92a21db1dae81804876fcc577a73a55b7a7b151dafb220f2af09aab4285013e5bc87d209d267"

RPROVIDES:${PN} += "hwloc-devel \
libhwloc-devel \
pkgconfig-hwloc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhwloc15 \
pkgconfig-libxml-2.0 \
pkgconfig-pciaccess"

inherit rpm
