SUMMARY = "LDAP Provider for GNU Data Access (GDA)"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-ldap-6.0.0-11.5.aarch64.rpm"
RPM_HASH = "1ef27f9c03e2366b2d4bf3742e6dc83795d8052aa23a526b71356bf22996aa1c1652b85b0daca1b54a8f2517193c74157713ad3f3e39991bcdc5eac3cf438a67"

RPROVIDES:${PN} += "libgda-6-0-ldap \
libgda-ldap-6.0.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgda-6-0-6-0-0 \
libgda-6.0.so.6.0.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
liblber.so.2 \
libldap.so.2"

inherit rpm
