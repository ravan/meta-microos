SUMMARY = "wxWidgets XML parser library"
DESCRIPTION = "This library contains classes for parsing XML documents."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_baseu_xml-suse-nostl16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "0d4f90d51e91f79e4875dce5aa00b6e1bd55f6592732a80f9c026f1397fb98e8eda21b1cb8befa238acfc2ff56a54ecea39ee0ed2fb41af88edb5747bd1744e6"

RPROVIDES:${PN} += "libwx-baseu-xml-suse-nostl.so.16.0.0 \
libwx-baseu-xml-suse-nostl16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.16.0.0"

inherit rpm
