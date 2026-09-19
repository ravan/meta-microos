SUMMARY = "wxWidgets property grid class library"
DESCRIPTION = "wxPropertyGrid is a specialized grid for editing properties, in other \
words, name=value pairs."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk2u_propgrid-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "7c04c7386aa5a38009320e6ce9f2c50e9ca6fb3714c8f574c1f270ba29d0103b4b9dc3c7098d62199903da2c9e6eb81b891e0619e8afff37d79f5d275788cb45"

RPROVIDES:${PN} += "libwx-gtk2u-propgrid-suse.so.16.0.0 \
libwx-gtk2u-propgrid-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0"

inherit rpm
