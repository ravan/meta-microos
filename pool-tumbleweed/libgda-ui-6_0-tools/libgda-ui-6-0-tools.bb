SUMMARY = "GNU Data Access (GDA) Library -- Graphical Tools"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data. \
 \
This package provides graphical tools: \
  - gda-browser: a tool to browse databases \
  - gda-control-center: configuration tool for libgda"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-ui-6_0-tools-6.0.0-11.5.aarch64.rpm"
RPM_HASH = "9295d7093b38ab320b2867cc761726aacb3e7e64c3752a1ee6acbb6a9ea1668a21cef478afbf7e30779758f1e67f0d95db853e1b9be1e014f1c6eb204a910a36"

RPROVIDES:${PN} += "libgda-ui-6-0-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgda-6.0.so.6.0.0 \
libgda-ldap-6.0.so \
libgda-ui-6.0.so.6.0.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgoocanvas-2.0.so.9 \
libgtk-3.so.0 \
libxml2.so.16"

inherit rpm
