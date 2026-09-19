SUMMARY = "Graphical User Interface for Doxygen"
DESCRIPTION = "Doxywizard is a graphical front-end to read/edit/write doxygen \
configuration files."
LICENSE = "GPL-2.0-or-later"

PV = "1.18.0"

RPM_NAME = "doxywizard-1.18.0-1.1.aarch64.rpm"
RPM_HASH = "7101e85d45b24508688b5816eeff0a29687006e2340309cc3888967a8f14f35e7fb6536743595cd3bacb80a153b27e319f289c694da66baa72952443efa6920b"

RPROVIDES:${PN} += "doxywizard"

RDEPENDS:${PN} += "doxygen \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
