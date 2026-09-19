SUMMARY = "wxWidgets HTML parser and renderer library"
DESCRIPTION = "The wxHTML library provides classes for parsing and displaying HTML. \
It is not intended to be a high-end HTML browser. wxHTML can be used \
as a generic rich text viewer – for example, to display an About Box \
or the result of a database search."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_html-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "39f2ea3019b78bac5a87641bebbf10cc615745bf3804c70289b25deae13b76c0683da1fe7ee7c74594e9b22ff82d28304ddc8b58d87cda971a4d3b0fd5ae94da"

RPROVIDES:${PN} += "libwx-gtk3u-html-suse.so.16.0.0 \
libwx-gtk3u-html-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmspack.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0"

inherit rpm
