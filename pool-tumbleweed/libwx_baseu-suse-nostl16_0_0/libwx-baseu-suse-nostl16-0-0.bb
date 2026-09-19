SUMMARY = "wxWidgets base library"
DESCRIPTION = "Every wxWidgets application must link against this library. It \
contains mandatory classes that any wxWidgets code depends on (e.g. \
wxString) and portability classes that abstract differences between \
platforms. wxBase can be used to develop console-only applications. \
This variant of wxWidgets is built without STL types (such as \
std::string), and is provided for old programs which fail to use e.g. \
wxString and instead rely on the wxChar pointer API."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_baseu-suse-nostl16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "e164baed2460150440e64e5ee9b258f734c46573af427f089d09e6b9b57efe158034f87f59be1d7f71afea5d6e4e44e067580f0b3a24b1a0adb7a2a4db37dda8"

RPROVIDES:${PN} += "libwx-baseu-suse-nostl.so.16.0.0 \
libwx-baseu-suse-nostl16-0-0 \
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
