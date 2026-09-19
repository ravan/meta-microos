SUMMARY = "Development files for libsysfs"
DESCRIPTION = "Libsysfs's purpose is to provide a library for interfacing with the \
kernel's sys filesystem mounted at /sys. The library was an attempt to \
create a stable interface to sysfs, but it failed. It is still provided \
for the current users, but no new software should use this library. \
 \
This package contains the development files for libsysfs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.1"

RPM_NAME = "sysfsutils-devel-2.1.1-1.18.aarch64.rpm"
RPM_HASH = "8525353cdd126eb5fcdc9f3c883dab4198e121924af971bdf976d33cbed332a34a21f83260a6f2e3daec3ad68f9f1a2fd4ba84cdd7cba19667e0d2f8febe3fd0"

RPROVIDES:${PN} += "pkgconfig-libsysfs \
sysfsutils-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsysfs2"

inherit rpm
