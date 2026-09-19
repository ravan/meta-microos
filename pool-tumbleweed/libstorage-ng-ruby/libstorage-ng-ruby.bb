SUMMARY = "Ruby bindings for libstorage-ng"
DESCRIPTION = "This package contains Ruby bindings for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.352"

RPM_NAME = "libstorage-ng-ruby-4.5.352-1.1.aarch64.rpm"
RPM_HASH = "46863b86c303aadeeb308327b4641247d94bca9ba011723b52a4ba7ca93cae4088da5a4ad63426e28818090e65d5cb0fc6b852d44483181da8390650bc3cd225"

RPROVIDES:${PN} += "libstorage-ng-ruby \
libstorage-ng-ruby-4.0.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libruby4.0.so.4.0 \
libstdc++.so.6 \
libstorage-ng.so.1 \
libstorage-ng1"

inherit rpm
