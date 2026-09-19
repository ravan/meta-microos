SUMMARY = "wxWidgets quality assurance class library"
DESCRIPTION = "This is the library containing extra classes for quality \
assurance, containing the wxDebugReport class. wxDebugReport is \
used to generate a debug report, containing information about the \
program current state."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk2u_qa-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "e5b48207b41c801b8aa8aeca2480ea2353df2d50773a6306096fee7fb55c177acb8b017852c7b4a6c1470336515698c2c5f5090c21c6b272bb0745c42d69efe9"

RPROVIDES:${PN} += "libwx-gtk2u-qa-suse.so.16.0.0 \
libwx-gtk2u-qa-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-baseu-xml-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0"

inherit rpm
