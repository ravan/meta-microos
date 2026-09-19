SUMMARY = "Office files thumbnailer for the GNOME desktop"
DESCRIPTION = "This package provides a thumbnailer for office files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.14.58"

RPM_NAME = "gsf-office-thumbnailer-1.14.58-1.3.aarch64.rpm"
RPM_HASH = "abf2d12b67762d06d1d5af5df0cef4673ead128aa9a5c4b892174ebd415be97c498771c229ae24e99b0bafeb628f6a1f91f90ab655dead6fd6bed3adc5086f86"

RPROVIDES:${PN} += "gsf-office-thumbnailer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114"

inherit rpm
