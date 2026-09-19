SUMMARY = "Header files for libuninameslist"
DESCRIPTION = "This package contains header files for libuninameslist."
LICENSE = "BSD-3-Clause"

PV = "20260107"

RPM_NAME = "libuninameslist-devel-20260107-1.3.aarch64.rpm"
RPM_HASH = "a82a4a1b54834b846de5bb0a490951d6917cc6a32880e267d5d28a9d82488fc54c27bc47d284d71526fa48578492b1b4044cde4d35f47452c493b53bcf41a6dd"

RPROVIDES:${PN} += "libuninameslist-devel \
pkgconfig-libuninameslist"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuninameslist1"

inherit rpm
