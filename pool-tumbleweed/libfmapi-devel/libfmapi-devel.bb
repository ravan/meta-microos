SUMMARY = "Development files for libfmapi, a library for MAPI data types"
DESCRIPTION = "A library for MAPI data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfmapi."
LICENSE = "LGPL-3.0-or-later"

PV = "20260521"

RPM_NAME = "libfmapi-devel-20260521-1.8.aarch64.rpm"
RPM_HASH = "9f1cd39e6eeb37f44d3961596a8a767ff1ab6f861734feb39209932ce21958b94be1f857e8c11e8ee2ec8834e5f49d5b3b94754f9cd61c893997586fe3f2b2c0"

RPROVIDES:${PN} += "libfmapi-devel \
pkgconfig-libfmapi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfmapi1"

inherit rpm
