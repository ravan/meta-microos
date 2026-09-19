SUMMARY = "A base library for writing document import filters"
DESCRIPTION = "librevenge is a base library for writing document import filters. It has \
interfaces for text documents, vector graphics, spreadsheets and \
presentations."
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "0.0.5"

RPM_NAME = "librevenge-0_0-0-0.0.5-1.14.aarch64.rpm"
RPM_HASH = "38a7aac2d7f93c31f30c22b5ce2408bc038250f4b4f3bba7518cab614ed45b33297d7e918c6eaac19e1640a49c11b767387c3f4aa3659c105e6f5e67093eaf2f"

RPROVIDES:${PN} += "librevenge-0-0-0 \
librevenge-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
