SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoFoundation123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "903c2e4a75ae9ab8375c48f76a64c3ae33cc758e8549b68c845cb038c59adb9aa1f0d7e42c4c61f7103cdd5b0f873ca79e7c231bf63783bc21ce7f1671740141"

RPROVIDES:${PN} += "libPocoFoundation.so.123 \
libPocoFoundation123 \
poco-foundation"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcre2-8.so.0 \
libstdc++.so.6 \
libutf8proc.so.3 \
libz.so.1"

inherit rpm
