SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoJSON123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "4295aa5300e55cdd4b04500b67d4fe39e8daa8840d2f657d8a1c850f52281186b153d85d42d80c996a07da26291b183df0967aecacc3402017c95c49e567dfbf"

RPROVIDES:${PN} += "libPocoJSON.so.123 \
libPocoJSON123 \
poco-json"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.123 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
