SUMMARY = "GNOME service to access online accounts -- Client Library"
DESCRIPTION = "gnome-online-accounts provides interfaces so applications and \
libraries in GNOME can access the user's online accounts."
LICENSE = "LGPL-2.0-or-later"

PV = "3.58.1"

RPM_NAME = "libgoa-1_0-0-3.58.1-1.3.aarch64.rpm"
RPM_HASH = "fadde4d642a01d94a6fea391351d66aaa7b899f0d657ddbd94bb6a9212482933ae92cab458151f847bb631113e25cc29c77dc4d4f56fd353bb373d8713e03ccc"

RPROVIDES:${PN} += "libgoa-1-0-0 \
libgoa-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
