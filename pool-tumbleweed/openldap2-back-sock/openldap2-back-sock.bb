SUMMARY = "OpenLDAP Socket backend"
DESCRIPTION = "The OpenLDAP socket back-end allows you to handle LDAP requests and \
results with an external process listening on a Unix domain socket."
LICENSE = "OLDAP-2.8"

PV = "2.6.13"

RPM_NAME = "openldap2-back-sock-2.6.13-1.6.aarch64.rpm"
RPM_HASH = "4545cd85dc914fd1d3f01420a47c4317aefc7654e2ce27354a4fcdf26804f8523f2a292da3e2d5e918909c9de75307bd613828e84fde314f163e8ff34d15013d"

RPROVIDES:${PN} += "openldap2-/usr/share/man/man5/slapd-sock.5.gz \
openldap2-back-sock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
openldap2"

inherit rpm
