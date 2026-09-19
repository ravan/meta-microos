SUMMARY = "wxWidgets styled text class library"
DESCRIPTION = "A wxWidgets implementation of the Scintilla source code editing component."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_stc-suse-nostl16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "b27a302ded797d84135f59655bd7fd86ab6abb610f635a00291b5d647fe136a9a1ce043e40a28a935d1dcb16774f85f4e1be73663cecce538a42e225f7dd1fb2"

RPROVIDES:${PN} += "libwx-gtk3u-stc-suse-nostl.so.16.0.0 \
libwx-gtk3u-stc-suse-nostl16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.16.0.0 \
libwx-gtk3u-core-suse-nostl.so.16.0.0"

inherit rpm
