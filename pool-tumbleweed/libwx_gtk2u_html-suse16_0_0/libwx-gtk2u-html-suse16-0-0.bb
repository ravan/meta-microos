SUMMARY = "wxWidgets HTML parser and renderer library"
DESCRIPTION = "The wxHTML library provides classes for parsing and displaying HTML. \
It is not intended to be a high-end HTML browser. wxHTML can be used \
as a generic rich text viewer – for example, to display an About Box \
or the result of a database search."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk2u_html-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "a67e430080ffd62a2525ccc6f16d5f8fea57193e41868083f74939111050ed8cc4c38fdff5298a9303e7b08596ed56aa1387c0d846ecd8131407f0d363d004af"

RPROVIDES:${PN} += "libwx-gtk2u-html-suse.so.16.0.0 \
libwx-gtk2u-html-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmspack.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0"

inherit rpm
