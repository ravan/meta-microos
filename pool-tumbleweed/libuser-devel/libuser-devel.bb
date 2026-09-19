SUMMARY = "Development files for libuser"
DESCRIPTION = "Development files for libuser."
LICENSE = "LGPL-2.0-or-later"

PV = "0.64"

RPM_NAME = "libuser-devel-0.64-2.7.aarch64.rpm"
RPM_HASH = "fa239fa63c4bb40e2f9b454981c44e76b335d945eb16908dac94da9e5c17e135cf7f61fc16f21ec571c6889dd2ba8fd5ad6074276c7ff30859f60f6e42201a8c"

RPROVIDES:${PN} += "libuser-devel \
libuser-files.so \
libuser-ldap.so \
libuser-sasldb.so \
libuser-shadow.so \
pkgconfig-libuser"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libldap.so.2 \
libsasl2.so.3 \
libuser \
libuser.so.1 \
libuser1 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
