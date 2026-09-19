SUMMARY = "Development files for libpsl"
DESCRIPTION = "libpsl is a C library to handle the Public Suffix List. A 'public suffix' is a \
domain name under which Internet users can directly register own names. \
 \
HTTP user agents can use it to avoid privacy-leaking 'supercookies' and 'super \
domain' certificates. It is also use do highlight domain parts in a user interface \
and sorting domain lists by site. \
 \
This package contains libraries and header files. \
Developer documentation is in /usr/share/doc/packages/libpsl-devel/html ."
LICENSE = "MIT"

PV = "0.23.3"

RPM_NAME = "libpsl-devel-0.23.3-1.1.aarch64.rpm"
RPM_HASH = "79272ad5cd919113961fa1141a8ba91195d992d80aeacaf90039325674310167df23cf7f58460c53034e731a01a2db67b37e50e0b912950bddfaba63278a4b0a"

RPROVIDES:${PN} += "libpsl-devel \
pkgconfig-libpsl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpsl5 \
pkgconfig-libidn2"

inherit rpm
