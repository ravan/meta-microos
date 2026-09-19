SUMMARY = "OpenLDAP SQL backend"
DESCRIPTION = "The primary purpose of this OpenLDAP backend is to present information \
stored in a Relational (SQL) Database as an LDAP subtree without the need \
to do any programming."
LICENSE = "OLDAP-2.8"

PV = "2.6.13"

RPM_NAME = "openldap2-back-sql-2.6.13-1.6.aarch64.rpm"
RPM_HASH = "4cfa98f126be0c2501a90367cefc1c0b5cc7627efc93b4cd8948af49185e74bf16ba4a46b9229a33c7147b51a07fdb7a7a65d846827c7bbb9bac13c26cbbd838"

RPROVIDES:${PN} += "openldap2-back-sql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
libodbc.so.2 \
openldap2"

inherit rpm
