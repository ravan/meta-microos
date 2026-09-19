SUMMARY = "wxWidgets styled text class library"
DESCRIPTION = "A wxWidgets implementation of the Scintilla source code editing component."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_stc-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "7b0be3bd913d3a6c979843416ba7a0dbecada481dea08de0c7646c2c30cd84cd327c1dac678c6a0acc8c6940d2bd92a4d9623bad2b97c9e3384b4dcce1c0c514"

RPROVIDES:${PN} += "libwx-gtk3u-stc-suse.so.16.0.0 \
libwx-gtk3u-stc-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0"

inherit rpm
