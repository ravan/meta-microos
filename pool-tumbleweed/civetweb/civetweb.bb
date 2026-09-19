SUMMARY = "A C/C++ web server"
DESCRIPTION = "civetweb is a C/C++ embeddable web server with optional CGI, SSL and Lua support."
LICENSE = "MIT"

PV = "1.16+git1776611085.588860e3"

RPM_NAME = "civetweb-1.16+git1776611085.588860e3-1.1.aarch64.rpm"
RPM_HASH = "fb0db3159d0b6703ebb8f779f0fb56051e784780361ac8815d4de8eef2559c2badba115b745dab5f07a25528899e12d321b53db868cf487e306dd2926ad15d9c"

RPROVIDES:${PN} += "civetweb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcivetweb.so.1.16.0"

inherit rpm
