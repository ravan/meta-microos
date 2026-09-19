SUMMARY = "Header files for libtraceevent"
DESCRIPTION = "The package provides header and other needed development files for the library libtraceevent"
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.9.0"

RPM_NAME = "libtraceevent-devel-1.9.0-1.3.aarch64.rpm"
RPM_HASH = "a728f67de45ee5237a42f1ce4225c918371174e4f56e6ecf0989cfc95e262cb3e4a10c1943c98543884648e110db451f06917e336d2a78093ebbc9ea2e451d93"

RPROVIDES:${PN} += "libtraceevent-devel \
pkgconfig-libtraceevent"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtraceevent1"

inherit rpm
