SUMMARY = "wxWidgets quality assurance class library"
DESCRIPTION = "This is the library containing extra classes for quality \
assurance, containing the wxDebugReport class. wxDebugReport is \
used to generate a debug report, containing information about the \
program current state."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_qa-suse-nostl16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "e5bb9839a27662dfdb48563682b40fee904110454906c52e9c1368ba119cea6c20b5558b8bc4c6c54f7b380d088e8ac4c73efb0911a67658a4257a0ded9c4120"

RPROVIDES:${PN} += "libwx-gtk3u-qa-suse-nostl.so.16.0.0 \
libwx-gtk3u-qa-suse-nostl16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.16.0.0 \
libwx-baseu-xml-suse-nostl.so.16.0.0 \
libwx-gtk3u-core-suse-nostl.so.16.0.0"

inherit rpm
