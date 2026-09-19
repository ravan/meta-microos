SUMMARY = "OpenLDAP plugin for collectd"
DESCRIPTION = "This plugin for collectd reads monitoring information \
from OpenLDAP's cn=Monitor subtree."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-openldap-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "d11920820a965d50bf5a4fa8c43e0938ace05fafde5981b7f2a21e6ed5b23635408ecd2ac10cc57f62937f15c13341ec790a2cee4ac5a85bc4daf37aed32162b"

RPROVIDES:${PN} += "collectd-plugin-openldap"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libldap.so.2"

inherit rpm
