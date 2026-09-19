SUMMARY = "Environment substitution helper binary"
DESCRIPTION = "This package contains the envsubst helper binary to replace values from the \
environment."
LICENSE = "GPL-3.0-or-later & LGPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "envsubst-1.0-2.4.aarch64.rpm"
RPM_HASH = "c897601ccd076c891d45df4783383087cc6ee78b47b231327b084b87cbc658552b9c300523da75801fab336ea3f6cd9327c0ad3c407b5c018920c2484ca87d62"

RPROVIDES:${PN} += "envsubst"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
