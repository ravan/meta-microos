SUMMARY = "A base library for writing document import filters"
DESCRIPTION = "librevenge is a base library for writing document import filters. It has \
interfaces for text documents, vector graphics, spreadsheets and \
presentations. \
This package contains classes to be used by converters that generate \
documents using librevenges APIs."
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "0.0.5"

RPM_NAME = "librevenge-generators-0_0-0-0.0.5-1.14.aarch64.rpm"
RPM_HASH = "3c4f99d083a9dcbd53d004ab39e66ccd7c6a9ff6c965497253b13ff982e73bdd34543abf8fa211ea2cb0acea8eb922e5eb034fdf80c841512961c279f3123e75"

RPROVIDES:${PN} += "librevenge-generators-0-0-0 \
librevenge-generators-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
libstdc++.so.6"

inherit rpm
