SUMMARY = "wxWidgets styled text class library"
DESCRIPTION = "A wxWidgets implementation of the Scintilla source code editing component."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk2u_stc-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "108d7b18f70bf1710a6982a795216156bdff806b7978bb7eeca5f624f03e2e166ed6cec35bde79795254d2fb2b0d1527ad6bf1de5ade1abe47eecfaf8902136f"

RPROVIDES:${PN} += "libwx-gtk2u-stc-suse.so.16.0.0 \
libwx-gtk2u-stc-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0"

inherit rpm
