SUMMARY = "C library to make use of LV2 plugins"
DESCRIPTION = "Lilv is a C library to make use of LV2 plugins in applications."
LICENSE = "ISC"

PV = "0.28.0"

RPM_NAME = "liblilv-0-0-0.28.0-1.3.aarch64.rpm"
RPM_HASH = "4f444f649890ffdfe5c413a73a5a75baed92c01cb4a9999f5ee3dc14622ae01f044d75c517cf79b30a18143677594324d86c15667597d3232faeca18daf87be2"

RPROVIDES:${PN} += "liblilv-0-0 \
liblilv-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libserd-0-0 \
libserd-0.so.0 \
libsord-0-0 \
libsord-0.so.0 \
libsratom-0.so.0 \
libzix-0.so.0"

inherit rpm
