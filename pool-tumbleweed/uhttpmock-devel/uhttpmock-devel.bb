SUMMARY = "Development files for uhttpmock"
DESCRIPTION = "This package contains libraries, header files and documentation for \
developing applications that use uhttpmock."
LICENSE = "LGPL-2.1-or-later"

PV = "0.11.0"

RPM_NAME = "uhttpmock-devel-0.11.0-2.4.aarch64.rpm"
RPM_HASH = "e40ef1691567932f0ff780b0d169d992db1f7c624d794b7e37609f8b226e054857fd3838e76d1f767010ef0036b53fb67387c046a92a725daf075945eaae401c"

RPROVIDES:${PN} += "pkgconfig-libuhttpmock-1.0 \
uhttpmock-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuhttpmock-1-0-1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-libsoup-3.0 \
typelib-1-0-Uhm-1-0"

inherit rpm
