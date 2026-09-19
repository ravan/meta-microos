SUMMARY = "LDAP Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for configuring uWSGI via LDAP."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.31"

RPM_NAME = "uwsgi-ldap-2.0.31-4.4.aarch64.rpm"
RPM_HASH = "f4309b666bec103f41c8b20677882a232ba19c66ec5bcdd0d811d8292bfe6bdd296bfbef9f6519534154bcc575f34fd758c1616ae18eca5684e1103043b69ff3"

RPROVIDES:${PN} += "uwsgi-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldap.so.2 \
uwsgi"

inherit rpm
