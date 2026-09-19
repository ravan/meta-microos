SUMMARY = "Ruby bindings for the libdnf library"
DESCRIPTION = "Ruby bindings for the libdnf library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.2.1"

RPM_NAME = "ruby-libdnf5-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "b9e0ee4baaa005b3bb6c75b2690d92e747fec8f0640795df518cabf061e08ce533c60bbe9b1f97150da844d8b310ee11a6ce0b6744abe444a040f9b008762311"

RPROVIDES:${PN} += "ruby-libdnf \
ruby-libdnf5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf5-2 \
libdnf5.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
libruby4.0.so.4.0 \
libstdc++.so.6"

inherit rpm
