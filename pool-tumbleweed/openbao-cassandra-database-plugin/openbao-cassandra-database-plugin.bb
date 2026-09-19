SUMMARY = "OpenBao database plugin for Cassandra"
DESCRIPTION = "OpenBao database plugin for Cassandra"
LICENSE = "MPL-2.0"

PV = "2.6.2"

RPM_NAME = "openbao-cassandra-database-plugin-2.6.2-1.1.aarch64.rpm"
RPM_HASH = "1367838e8bf530ecc700b1ad3e8b3cfc97c70a7c76b52b470fa021c8c12fe865db0c3b844f71685feffd4246b97cc00b080562fdca187a5c8bfa812ed40e7bf9"

RPROVIDES:${PN} += "openbao-cassandra-database-plugin"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
