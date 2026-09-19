SUMMARY = "IBus libraries"
DESCRIPTION = "This package contains the libraries for IBus"
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.34"

RPM_NAME = "libibus-1_0-5-1.5.34-2.1.aarch64.rpm"
RPM_HASH = "e335019af36cc5623a54554e934254599b6db5709ac11c00634e8f5539de203af385daeffd4ba7cab27d301f819653101197660d2deb7e06996fec5540a2b93d"

RPROVIDES:${PN} += "libibus-1-0-5 \
libibus-1.0.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
