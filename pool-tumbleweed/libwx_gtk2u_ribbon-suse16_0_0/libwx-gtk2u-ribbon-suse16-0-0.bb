SUMMARY = "wxWidgets's ribbon user interface library"
DESCRIPTION = "The wxRibbon library is a set of classes for writing a ribbon user \
interface."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk2u_ribbon-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "1c216a9a3f9afc6b7aaa0910aff27d8e67bbffec7c143edaad044020e9c73aecfd5ca86074eacc43fa8e01da5e28fdf61a3868d6aad5379e70f659b06e9adc0c"

RPROVIDES:${PN} += "libwx-gtk2u-ribbon-suse.so.16.0.0 \
libwx-gtk2u-ribbon-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0"

inherit rpm
