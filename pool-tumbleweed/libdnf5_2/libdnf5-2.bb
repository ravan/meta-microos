SUMMARY = "Package management library"
DESCRIPTION = "Package management library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.2.1"

RPM_NAME = "libdnf5_2-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "8772846631fb6e8d1850e39522895fe531f04aab2c897743cbd9824014c14d2f56e86f9ae2cbddae633f9d537070528dc71a19b4c61ceb26036a21582dacfaa1"

RPROVIDES:${PN} += "/etc/dnf/dnf.conf \
config-libdnf5-2 \
libdnf5-2 \
libdnf5.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libfmt.so.12 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-c.so.5 \
libmodulemd.so.2 \
libmodulemd2 \
librepo.so.0 \
librepo0 \
librpm.so.10 \
librpmio.so.10 \
libsolv.so.1 \
libsolv1 \
libsolvext.so.1 \
libsqlite3-0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
