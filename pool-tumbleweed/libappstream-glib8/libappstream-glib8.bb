SUMMARY = "AppStream Abstraction Library"
DESCRIPTION = "This library provides GObjects and helper methods to read and write \
AppStream metadata. It also provides a DOM implementation to edit \
nodes and convert to and from the standardized XML representation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.4"

RPM_NAME = "libappstream-glib8-0.8.4-1.1.aarch64.rpm"
RPM_HASH = "22792ed63ff1181af39382f5670abc5ec626c4a84f49d0e5906c4ab6e6b91fc30fc573edf03372d763596f32972516bdad281bebad9a7c307f69090e66056bf9"

RPROVIDES:${PN} += "libappstream-glib.so.8 \
libappstream-glib8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcurl.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
librpmio.so.10 \
libuuid.so.1 \
libyaml-0.so.2"

inherit rpm
