SUMMARY = "Extracting and Converting Microsoft Icon and Cursor Files"
DESCRIPTION = "The icoutils are a set of programs for extracting and converting images \
in Microsoft Windows icon and cursor files. These files usually have the \
extension .ico or .cur, but they can also be embedded in executables or \
libraries (.dll-files)."
LICENSE = "GPL-3.0-or-later"

PV = "0.32.3"

RPM_NAME = "icoutils-0.32.3-3.9.aarch64.rpm"
RPM_HASH = "5f2ebb3d5cbe6c1fd64a111d3b253f9172a0601fb25f1b1104834ff8cb9d53213ed8e5f0cc96b381c9f535916cd5eb5c9be5a4c71c5923f42ccf2ea7efb2630e"

RPROVIDES:${PN} += "icoutils"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpng16.so.16"

inherit rpm
