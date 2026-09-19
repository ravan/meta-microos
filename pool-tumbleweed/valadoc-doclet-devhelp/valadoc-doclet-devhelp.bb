SUMMARY = "Devhelp plugin for the valadoc generator"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.19"

RPM_NAME = "valadoc-doclet-devhelp-0.56.19-1.4.aarch64.rpm"
RPM_HASH = "bf30c320afabaa7e93666b82edcc32ca8e3b9c9dc63d00a238d240e2b4c86d094a3b4b0876efb5004798ec147793d72a1ebe72d1636a0edad274415d796dbaab"

RPROVIDES:${PN} += "libdoclet.so \
valadoc-doclet-devhelp"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvala-0.56.so.0 \
libvaladoc-0.56.so.0"

inherit rpm
