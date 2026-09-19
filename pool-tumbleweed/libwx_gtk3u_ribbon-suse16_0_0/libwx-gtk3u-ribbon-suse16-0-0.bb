SUMMARY = "wxWidgets's ribbon user interface library"
DESCRIPTION = "The wxRibbon library is a set of classes for writing a ribbon user \
interface."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_ribbon-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "2dd92918cd78346465dca681f8535292cfda4cd24ed34de0f18096de97a4f1b2dbf66856a10ca6243841462ebbd8115b140a09e99eb8bf94529bf4a3a7347736"

RPROVIDES:${PN} += "libwx-gtk3u-ribbon-suse.so.16.0.0 \
libwx-gtk3u-ribbon-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0"

inherit rpm
