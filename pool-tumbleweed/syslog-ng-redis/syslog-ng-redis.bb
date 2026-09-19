SUMMARY = "Redis destination support for syslog-ng"
DESCRIPTION = "This package provides the libredis module providing support for \
logging to a redis destination."
LICENSE = "GPL-2.0-only"

PV = "4.12.0"

RPM_NAME = "syslog-ng-redis-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "b07a4e261ad8e10e7c909a17b342bcb31269f1a8c866d8527a411e2942ecb031a1df8da8bfdef8c31280b27e2c9424da0cdc095e593b5ee5bea549cc11eef22a"

RPROVIDES:${PN} += "syslog-ng-redis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhiredis.so.1.3.0 \
libsyslog-ng-4.12.so.0 \
syslog-ng"

inherit rpm
