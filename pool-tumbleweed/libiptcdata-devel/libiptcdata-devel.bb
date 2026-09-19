SUMMARY = "Development files for the IPTC Metadata Tag Manipulation Library"
DESCRIPTION = "libiptcdata is a library for parsing, editing, and saving IPTC \
(International Press Telecommunications Council) data. stored within \
multimedia files such as images. \
 \
This subpackage contains the header files for the library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "libiptcdata-devel-1.0.5-1.20.aarch64.rpm"
RPM_HASH = "b636525e8a210a29a7c20abe60b6b2e8454817b1dd1efc95112aa7720d20292ffbe4ea634196fdfdec6cd71eda12a5d1aa07a82fa658cc3fcdb6aeb5cd982ff6"

RPROVIDES:${PN} += "libiptcdata-devel \
pkgconfig-libiptcdata"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libiptcdata"

inherit rpm
