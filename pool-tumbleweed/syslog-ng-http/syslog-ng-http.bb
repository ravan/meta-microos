SUMMARY = "HTTP destination support for syslog-ng"
DESCRIPTION = "This package provides HTTP destination support for syslog-ng by means \
of libcurl."
LICENSE = "GPL-2.0-only"

PV = "4.12.0"

RPM_NAME = "syslog-ng-http-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "689f48458e1856a02d39a0ca9f9147f065d519fc171fedc83917bad4d7c6ed682b777029e383034b934ff170da19cf42edd5aeba0108ddec15d182dd4840ee48"

RPROVIDES:${PN} += "syslog-ng-curl \
syslog-ng-http"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libsyslog-ng-4.12.so.0 \
libz.so.1 \
syslog-ng"

inherit rpm
