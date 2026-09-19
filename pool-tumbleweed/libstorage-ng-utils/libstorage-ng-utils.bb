SUMMARY = "Utils for libstorage-ng"
DESCRIPTION = "This package contains utils for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.352"

RPM_NAME = "libstorage-ng-utils-4.5.352-1.1.aarch64.rpm"
RPM_HASH = "58986837ef0e84269a69d7cd6256b8c9e2920de78850e041cf4204c7aba25ec8fb8a2bb64ae38a02ff0ac4eccbca444046655b666523964f27fa7371f2777552"

RPROVIDES:${PN} += "libstorage-ng-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libstorage-ng.so.1"

inherit rpm
