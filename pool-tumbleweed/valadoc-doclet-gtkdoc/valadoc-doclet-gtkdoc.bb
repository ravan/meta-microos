SUMMARY = "Gtkdoc plugin for valadoc"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.19"

RPM_NAME = "valadoc-doclet-gtkdoc-0.56.19-1.4.aarch64.rpm"
RPM_HASH = "48c59d3204e793e0bf1162e099190a4b1dc3b454fcf0044e0c765acb7a211ccc4f91a1f2c03131eeab7c14032e4045e9f829985aefbb70fee376eec903ef0d79"

RPROVIDES:${PN} += "libdoclet.so \
valadoc-doclet-gtkdoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvala-0.56.so.0 \
libvaladoc-0.56.so.0"

inherit rpm
