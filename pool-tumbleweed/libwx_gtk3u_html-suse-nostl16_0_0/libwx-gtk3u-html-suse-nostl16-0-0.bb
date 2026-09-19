SUMMARY = "wxWidgets HTML parser and renderer library"
DESCRIPTION = "The wxHTML library provides classes for parsing and displaying HTML. \
It is not intended to be a high-end HTML browser. wxHTML can be used \
as a generic rich text viewer – for example, to display an About Box \
or the result of a database search. \
This variant of wxWidgets is built without STL types (such as \
std::string), and is provided for old programs which fail to use e.g. \
wxString and instead rely on the wxChar pointer API."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_html-suse-nostl16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "2f474f1a7e66e7f951f5d6a30c677a148a8831159ab2c1a60272bdfb9b5241f42b6fd8153e462d32f3b80c1b3255e08a8636c95f2f1a507d48a7a8cb1c759098"

RPROVIDES:${PN} += "libwx-gtk3u-html-suse-nostl.so.16.0.0 \
libwx-gtk3u-html-suse-nostl16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmspack.so.0 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.16.0.0 \
libwx-gtk3u-core-suse-nostl.so.16.0.0"

inherit rpm
