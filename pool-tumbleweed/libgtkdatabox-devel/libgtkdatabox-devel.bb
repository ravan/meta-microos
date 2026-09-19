SUMMARY = "Development files for GtkDatabox"
DESCRIPTION = "The libgtkdatabox-devel package contains libraries, header files and \
documentation for developing applications that use libgtkdatabox."
LICENSE = "LGPL-2.1+"

PV = "0.9.3.1"

RPM_NAME = "libgtkdatabox-devel-0.9.3.1-1.18.aarch64.rpm"
RPM_HASH = "1d4cd9fd689bfa42ebf8690d4ae976a5aa1a513e7df8b65e37068585a7a1dcdb90012b24ad13adac99d9322606bbf63d79a6a572d9b81614aca0932279f2e21a"

RPROVIDES:${PN} += "libgtkdatabox-devel \
pkgconfig-gtkdatabox"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtkdatabox \
pkgconfig-cairo \
pkgconfig-gtk+-2.0 \
pkgconfig-pango"

inherit rpm
