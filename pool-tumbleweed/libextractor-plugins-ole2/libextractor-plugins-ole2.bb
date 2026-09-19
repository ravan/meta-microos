SUMMARY = "The 'ole2' libextractor plugin"
DESCRIPTION = "This package ships the 'ole2' plugin for libextractor."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-plugins-ole2-1.14-1.2.aarch64.rpm"
RPM_HASH = "94c3c029ed208585bbfa9eb77a89cf1d701434646ad158a74dbb4595e44829d5632126790baf8df6d6fba94a03c48cc325bf0150e2f488ee838a229c5fccf551"

RPROVIDES:${PN} += "libextractor-ole2.so \
libextractor-plugins-ole2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libextractor-common.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114"

inherit rpm
