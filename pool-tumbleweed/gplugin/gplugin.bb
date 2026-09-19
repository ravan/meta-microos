SUMMARY = "GObject based library that implements a reusable plugin system"
DESCRIPTION = "GPlugin is a GObject based library that implements a reusable plugin system. \
It supports loading plugins in multiple other languages via loaders.  It relies \
heavily on [GObjectIntrospection](https://gi.readthedocs.io/) to expose its API \
to the other languages. \
 \
It has a simple API which makes it very easy to use in your application. \
For more information on using GPlugin in your application, please see the \
[embedding](https://docs.pidgin.im/gplugin/latest/chapter-embedding.html) page."
LICENSE = "LGPL-2.0-or-later"

PV = "0.44.2"

RPM_NAME = "gplugin-0.44.2-2.4.aarch64.rpm"
RPM_HASH = "86b0d361856c8d43e99d91c7f61d34e40a388584353e90bd76ec58b214e427f5938973e0230d430b9f4d063b8f0e9f736f17478c46770be351de44b136289cc4"

RPROVIDES:${PN} += "gplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgplugin-gtk4.so.0 \
libgplugin.so.0 \
libgtk-4.so.1"

inherit rpm
