SUMMARY = "The main library for AppStream"
DESCRIPTION = "The main library for AppStream."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.5"

RPM_NAME = "libappstream5-1.1.5-1.1.aarch64.rpm"
RPM_HASH = "7fa547ed9effd70282c7ba98bfa000a50bb4f7213f78dfaef75ba8bf59b65a42e8cb2c6628719eaee45df6ec0a948e9affeb3c6acda89c9f34fe240d2fecd660"

RPROVIDES:${PN} += "libappstream.so.5 \
libappstream5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libfyaml.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libsystemd.so.0 \
libxml2.so.16 \
libxmlb.so.2 \
libzstd.so.1"

inherit rpm
