SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoData123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "ffeaa1a76aeadeacac5c27f675cbe3ec1017b4923b3c6d69f5d586480635da8bcb9a63d9147fee57696021b61f32faf23190c05ca9628e223498494b33f4a4dc"

RPROVIDES:${PN} += "libPocoData.so.123 \
libPocoData123 \
poco-data"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.123 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
