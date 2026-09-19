SUMMARY = "GNU Data Access (GDA) Library - Plugins for UI Widgets"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-ui-6_0-plugins-6.0.0-11.5.aarch64.rpm"
RPM_HASH = "2f5636b1035bb8ee1652babb4c85bc73e3822b72daacbbd50660de38ae8ce27b0a9db762cca439b0f2f34f2bab77e1f20550f777e83f0bca7944417cdbc9598b"

RPROVIDES:${PN} += "libgda-ui-6-0-plugins \
libgda-ui-plugins-libgda-6.0.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgda-6.0.so.6.0.0 \
libgda-ui-6.0.so.6.0.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
