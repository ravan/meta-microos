SUMMARY = "System Utilities Package / Libsysfs"
DESCRIPTION = "This package's purpose is to provide a library for interfacing with the \
kernel's sys filesystem mounted at /sys. The library was an attempt to \
create a stable interface to sysfs, but it failed. It is still provided \
for the current users, but no new software should use this library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.1"

RPM_NAME = "sysfsutils-2.1.1-1.18.aarch64.rpm"
RPM_HASH = "3e6b5a9dd9472a6993b0c0afbe94e70b65b307ea229a0b6030971c179bc8a1c41002870cad53bca335376d5b1dde62ecff733f5aab9a26130c104cd5373184b5"

RPROVIDES:${PN} += "libsysfs \
sysfsutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsysfs.so.2"

inherit rpm
