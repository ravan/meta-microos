SUMMARY = "A number of utilities for manipulating HTML and XML files"
DESCRIPTION = "HTML-XML-utils provides a number of utilities for manipulating and \
converting HTML and XML files in various ways."
LICENSE = "W3C"

PV = "8.7"

RPM_NAME = "html-xml-utils-8.7-2.6.aarch64.rpm"
RPM_HASH = "5c662cc3c3faa89980309d813f4a39c22648fd347fe82d69caf50208d22cd9142af699f684248cee57a9a08e6ab5e8c948d07b0775de73e863773766324737cb"

RPROVIDES:${PN} += "html-xml-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libidn2.so.0"

inherit rpm
