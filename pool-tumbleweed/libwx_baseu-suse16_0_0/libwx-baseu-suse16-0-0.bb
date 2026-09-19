SUMMARY = "wxWidgets base library"
DESCRIPTION = "Every wxWidgets application must link against this library. It \
contains mandatory classes that any wxWidgets code depends on (e.g. \
wxString) and portability classes that abstract differences between \
platforms. wxBase can be used to develop console-only applications."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_baseu-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "467e6777236707d47849e78833693af480f964730852781927543906229e4494e369fd114018e6db5ceab5d81b55dcda99ac7f17f361418989d7bfbbbef712b9"

RPROVIDES:${PN} += "libwx-baseu-suse.so.16.0.0 \
libwx-baseu-suse16-0-0 \
wxWidgets"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpcre2-32.so.0 \
libsecret-1.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
