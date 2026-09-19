SUMMARY = "Header files for the libdca library"
DESCRIPTION = "libdca is a free library for decoding DTS Coherent Acoustics \
streams. It is released under the terms of the GPL license. The DTS \
Coherent Acoustics standard is used in a variety of applications, \
including DVD, DTS audio CD and radio broadcasting. \
 \
This package contains header files and static library for the \
libdca library. Install this package if you want to compile \
programs using the library."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.7+2"

RPM_NAME = "libdca-devel-0.0.7+2-1.13.aarch64.rpm"
RPM_HASH = "6af9cb62bfb1a4aa41ffdb53bd3a62555c7cc73f8a688ed6a5236e1128189971826de1358394be0e401f29cb4012988bcfa3c7916836ded24baac221c29b205c"

RPROVIDES:${PN} += "libdca-devel \
pkgconfig-libdca \
pkgconfig-libdts"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdca0"

inherit rpm
