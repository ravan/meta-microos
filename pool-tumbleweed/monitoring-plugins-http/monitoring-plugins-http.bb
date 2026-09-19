SUMMARY = "Test the HTTP service on the specified host"
DESCRIPTION = "This plugin tests the HTTP service on the specified host. It can test \
normal (http) and secure (https) servers, follow redirects, search for \
strings and regular expressions, check connection times, and report on \
certificate expiration times."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-http-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "7f59999b00eb9e1f004bb49a1c1f1be879c197a94317749f795a10c66e6a5c13da1ba825de9d61982d0f34021f88ee2e33cf4052d91f55f7a3fb97c57833654e"

RPROVIDES:${PN} += "monitoring-plugins-http \
nagios-plugins-http"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
