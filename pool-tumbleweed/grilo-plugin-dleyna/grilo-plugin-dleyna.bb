SUMMARY = "DLNA (dLeyna) plugin for the Grilo media framework"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API. \
 \
This package provides a plugin for accessing content from a DLNA \
(dLeyna) provider."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.18"

RPM_NAME = "grilo-plugin-dleyna-0.3.18-2.3.aarch64.rpm"
RPM_HASH = "f2acee7f06c358a4e095209e8db3c4ba451514be9c9cb028c5c6399558eb59a118e5417c92b3bc2f28d750a02f7004d8443011fd1fa566116e845252ea0c5154"

RPROVIDES:${PN} += "grilo-plugin-dleyna \
grilo-plugin-upnp \
libgrldleyna.so"

RDEPENDS:${PN} += "dbus-com.intel.dleyna-server \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgrilo-0.3.so.0"

inherit rpm
