SUMMARY = "Network packet dissection library"
DESCRIPTION = "The libwireshark library provides the network packet dissection services \
developed by the Wireshark project."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.6.8"

RPM_NAME = "libwireshark19-4.6.8-2.1.aarch64.rpm"
RPM_HASH = "807b27afb86aae60889ecdfb4fa212868bc9e9dbc15eb5dabf91bea498ec7a3aee4acdf538f46b803738cbd2e014a41f77f8264e7990a81406a43ae610b2d5cf"

RPROVIDES:${PN} += "libwireshark.so.19 \
libwireshark19"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libc.so.6 \
libcares.so.2 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libk5crypto.so.3 \
libkrb5.so.3 \
liblua5.4.so.5 \
liblz4.so.1 \
libm.so.6 \
libnghttp2.so.14 \
libpcre2-8.so.0 \
libsmi.so.2 \
libsnappy.so.1 \
libwiretap.so.16 \
libwsutil.so.17 \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1"

inherit rpm
