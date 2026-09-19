SUMMARY = "Library to create, manipulate and render SVG files"
DESCRIPTION = "WxSVG is a C++ library to create, manipulate and render SVG files."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "1.5.25"

RPM_NAME = "wxsvg-1.5.25-2.6.aarch64.rpm"
RPM_HASH = "ed662c3eac74ea215c1c9f0eae32753050838bebe3e54c691bb77919757b91f13c5294d64003175e20e2bdd1ce1891013ee89a7a57329f589bf81463b5d4527c"

RPROVIDES:${PN} += "wxsvg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwxsvg.so.3"

inherit rpm
