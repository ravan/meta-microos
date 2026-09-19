SUMMARY = "Python destination support for syslog-ng"
DESCRIPTION = "This package provides Python destination support for syslog-ng."
LICENSE = "GPL-2.0-only"

PV = "4.12.0"

RPM_NAME = "syslog-ng-python-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "dbf31351c72881b88e945770350acfd69b12b4e9c789412d5a6e7dbc1e4d68c2d358b8f8317ebba66faa3f7a8edca8f01d8a801c0250ca60f9ce1652e42e9d31"

RPROVIDES:${PN} += "syslog-ng-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.13.so.1.0 \
libsyslog-ng-4.12.so.0 \
syslog-ng"

inherit rpm
