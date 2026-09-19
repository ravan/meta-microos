SUMMARY = "wxWidgets networking library"
DESCRIPTION = "Classes for network access with wxWidgets."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_baseu_net-suse-nostl16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "67618fce075df5ccb95f78c14a2fde5f083f5410d6c8553e3f847c93e9e8ab3ca00336c8fce240cef7c00dda55c28df633a49530e85945e05108bd7c01cbfba2"

RPROVIDES:${PN} += "libwx-baseu-net-suse-nostl.so.16.0.0 \
libwx-baseu-net-suse-nostl16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.16.0.0"

inherit rpm
