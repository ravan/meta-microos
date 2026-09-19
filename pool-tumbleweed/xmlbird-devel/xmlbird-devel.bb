SUMMARY = "Development files for xmlbird"
DESCRIPTION = "XML parser with support for Vala iterators. \
 \
This package contains the pkgconfig, header files and libraries needed to \
develop application that use xmlbird."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.14"

RPM_NAME = "xmlbird-devel-1.2.14-1.12.aarch64.rpm"
RPM_HASH = "9cbceb7e601189fcc4db85866663c07571e8408d08f0cfa1fd7d4f59f4a361f974eabf19f704cb3329ad378724de6d77c295fe404c84a3ad59ad08c1ed84ce55"

RPROVIDES:${PN} += "pkgconfig-xmlbird \
xmlbird-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxmlbird1 \
pkgconfig-glib-2.0"

inherit rpm
