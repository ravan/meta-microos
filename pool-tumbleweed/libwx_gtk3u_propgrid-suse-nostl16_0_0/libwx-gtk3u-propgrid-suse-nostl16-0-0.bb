SUMMARY = "wxWidgets property grid class library"
DESCRIPTION = "wxPropertyGrid is a specialized grid for editing properties, in other \
words, name=value pairs."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_propgrid-suse-nostl16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "70e20990374557a917e1c12e4d53c190ada080ec1e8265711d1e25a5b63ce74604e4d31ded137ab4ac4d75c522ee2c1f9538f8cebf7a291753e37d921a81b986"

RPROVIDES:${PN} += "libwx-gtk3u-propgrid-suse-nostl.so.16.0.0 \
libwx-gtk3u-propgrid-suse-nostl16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.16.0.0 \
libwx-gtk3u-core-suse-nostl.so.16.0.0"

inherit rpm
