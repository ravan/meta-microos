SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoUtil123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "14c31f327ef1079ab74493d71234659fd72bbee04c237e17380826e40c3d9bf7a4f293ebc1c1c07748af94795f995b19e0a92f123f305af18c3d3b624affe066"

RPROVIDES:${PN} += "libPocoUtil.so.123 \
libPocoUtil123 \
poco-util"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.123 \
libPocoJSON.so.123 \
libPocoXML.so.123 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
