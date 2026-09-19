SUMMARY = "wxWidgets property grid class library"
DESCRIPTION = "wxPropertyGrid is a specialized grid for editing properties, in other \
words, name=value pairs."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_propgrid-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "c5539591106ff252e073ef5287f23a737750dac48c4009995594baa8c8a7ac035af79d15a1a229ae70b5bcd833848586738002b07a9368ffcd8507aa90a1753b"

RPROVIDES:${PN} += "libwx-gtk3u-propgrid-suse.so.16.0.0 \
libwx-gtk3u-propgrid-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0"

inherit rpm
