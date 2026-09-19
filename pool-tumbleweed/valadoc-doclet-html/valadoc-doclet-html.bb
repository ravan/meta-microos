SUMMARY = "HTML plugin for valadoc"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.19"

RPM_NAME = "valadoc-doclet-html-0.56.19-1.4.aarch64.rpm"
RPM_HASH = "94373e7a901ec5f27b78a6d1372c628c53b2deb02dda8a7d80821fac9d580aecb39563d25a90d059f399a14a06894f03aaa0094bd181d746b30ed44df2d59800"

RPROVIDES:${PN} += "libdoclet.so \
valadoc-doclet-html"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvaladoc-0.56.so.0"

inherit rpm
