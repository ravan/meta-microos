SUMMARY = "SNMP support for syslog-ng"
DESCRIPTION = "This package provides SNMP support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.12.0"

RPM_NAME = "syslog-ng-snmp-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "6068c661e7e51c210a6e7735db5f4212c85d5d38c54d1f8ab4b387e20824ae7bfe642033a1be5d64f5aae8c3f49a0171a82cc028e256c52985685f3233a18e2b"

RPROVIDES:${PN} += "syslog-ng-snmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.45 \
libsyslog-ng-4.12.so.0 \
syslog-ng"

inherit rpm
