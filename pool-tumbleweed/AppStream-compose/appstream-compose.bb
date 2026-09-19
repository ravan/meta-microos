SUMMARY = "Support for appstreamcli compose"
DESCRIPTION = "This package contains all necessary files, libraries, \
configuration files to add compose support to appstreamcli."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.5"

RPM_NAME = "AppStream-compose-1.1.5-1.1.aarch64.rpm"
RPM_HASH = "dd0175b00c30bd34e0edf10940c710d0132e7f8bf11ef0c19b4df24a71504c68618b07ca124468ae6400b428e2f54ce538f144b9eabe66f1f2ce0ed29c027696"

RPROVIDES:${PN} += "AppStream-compose"

RDEPENDS:${PN} += "AppStream \
glycin-loaders \
ld-linux-aarch64.so.1 \
libappstream-compose.so.0 \
libappstream.so.5 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
