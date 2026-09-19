SUMMARY = "GAP: Bindings for low level C library IO"
DESCRIPTION = "The IO package provides bindings for GAP to the lower levels of \
Input/Output functionality in the C library."
LICENSE = "GPL-3.0-or-later"

PV = "4.10.0"

RPM_NAME = "gap-io-4.10.0-1.2.aarch64.rpm"
RPM_HASH = "34cf95b40b9f27ce6681ddac6720fa19d0b4444e6c36548efbd20c5d84045f4c70cc78f9e2a6366fa8b24d51cd88d2d9d06f4e1fc2974c5f8d6bfe9113b73bdf"

RPROVIDES:${PN} += "gap-io"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
gap-core \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
