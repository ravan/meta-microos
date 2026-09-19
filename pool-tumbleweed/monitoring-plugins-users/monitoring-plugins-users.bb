SUMMARY = "Check number of users currently logged in"
DESCRIPTION = "This plugin checks the number of users currently logged in on the local system \
and generates an error if the number exceeds the thresholds specified."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-users-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "adbe4d03182f50c0e2f688edfdfdbeef5e62ea311b986f29417e050dc32d83f61aeab8bd50b26ba7edb8205445027c40ab9e95a3751ea59c2b50b8085cbe1d67"

RPROVIDES:${PN} += "config-monitoring-plugins-users \
monitoring-plugins-users \
nagios-plugins-users"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
