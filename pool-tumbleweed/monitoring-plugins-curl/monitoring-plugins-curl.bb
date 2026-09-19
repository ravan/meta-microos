SUMMARY = "Test the HTTP service on the specified host, via libcurl"
DESCRIPTION = "This plugin tests the HTTP service on the specified host. It can test \
normal (http) and secure (https) servers, follow redirects, search for \
strings and regular expressions, check connection times, and report on \
certificate expiration times. \
 \
It makes use of libcurl to do so. It tries to be as compatible to check_http \
as possible."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-curl-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "d8fd8d622c13ba3062265b309b6c4a921d59a2049bbba492fe767ccb2bca2d9a3c50f42d0c431aa812cdf7851a4c08e08913826bfecde2b9f5cb78de7d032821"

RPROVIDES:${PN} += "monitoring-plugins-curl \
nagios-plugins-curl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libssl.so.3 \
liburiparser.so.1"

inherit rpm
