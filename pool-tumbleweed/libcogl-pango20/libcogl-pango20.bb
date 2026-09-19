SUMMARY = "Pango integration for the cogl GL/GLES abstraction/utility layer"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "libcogl-pango20-1.22.8-3.7.aarch64.rpm"
RPM_HASH = "48f8c23469c2f4f61e6b0fe96c67d4f289ae7b003fd75f9262ee0aa3b51f9c3e29818f679a7ebf2e02c34c8359c0c3acaa3da858e1fe63938a8adc5defde0311"

RPROVIDES:${PN} += "libcogl-pango.so.20 \
libcogl-pango20"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcogl.so.20 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
