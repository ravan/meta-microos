SUMMARY = "Small Fast S-Expression Library"
DESCRIPTION = "This library supports manipulation of symbolic expressions 's-expressions'. \
S-expressions are able to represent complex, structured data without requiring \
additional meta-data describing the structure. \
 \
This package contains the shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "libsexp1-1.4.1-1.5.aarch64.rpm"
RPM_HASH = "bb65c3b73cbd96111dd39de38417a902beea94c04a25c19ad7691480f4056723a942dd97e43ecb7c041890c00c5524dcf5930bed8d9185482d82a8dde7f9d731"

RPROVIDES:${PN} += "libsexp.so.1 \
libsexp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
