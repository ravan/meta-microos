SUMMARY = "Storage array management library"
DESCRIPTION = "The libStorageMgmt library will provide a vendor agnostic open source storage \
application programming interface (API) that will allow management of storage \
arrays.  The library includes a command line interface for interactive use and \
scripting (command lsmcli).  The library also has a daemon that is used for \
executing plug-ins in a separate process (lsmd)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.3"

RPM_NAME = "libstoragemgmt-1.10.3-1.3.aarch64.rpm"
RPM_HASH = "e10347fabbbceda32e9c02c0c64d4d5634d9bbb20dc370ba99037bb407c560dd29b89e0ff616dc4c85e922b1384a69961e28b1c71d8f5ccd0a017233da8d474d"

RPROVIDES:${PN} += "config-libstoragemgmt \
group-libstoragemgmt \
libstoragemgmt \
user-libstoragemgmt"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfig.so.15 \
libsqlite3.so.0 \
libstoragemgmt.so.1 \
python3-libstoragemgmt \
systemd \
sysuser-shadow"

inherit rpm
