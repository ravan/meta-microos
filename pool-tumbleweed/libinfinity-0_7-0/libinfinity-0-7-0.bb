SUMMARY = "Implementation of the Infinote collaborative editing protocol"
DESCRIPTION = "libinfinity is an implementation of the Infinote protocol written in \
GObject-based C. Infinote is a protocol for collaborative editing \
multiple documents and is portable to both Windows and Unix-like \
platforms."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libinfinity-0_7-0-0.7.2-4.20.aarch64.rpm"
RPM_HASH = "c09af0d2c55b3c416c825db0456eb55df1c94aa2514a3e51b85ea54ac2bb56a547a54b70ce1fc8ef0e2d11fa011ae3473544b1528f7a66ab2292ffd1d7d6db08"

RPROVIDES:${PN} += "libinfgtk-0.7.so.0 \
libinfinity \
libinfinity-0-7-0 \
libinfinity-0.7.so.0 \
libinfinoted-plugin-manager-0.7.so.0 \
libinftext-0.7.so.0 \
libinftextgtk-0.7.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libcairo.so.2 \
libdaemon.so.0 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgsasl.so.18 \
libgtk-3.so.0 \
libm.so.6 \
libxml2.so.16"

inherit rpm
