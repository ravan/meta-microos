SUMMARY = "Galera support library"
DESCRIPTION = "Galera is a fast synchronous multimaster wsrep provider (replication engine) \
for transactional databases and similar applications. For more information \
about wsrep API see http://launchpad.net/wsrep. For a description of Galera \
replication engine see http://www.codership.com. \
 \
This package provides the libgalera_smm library."
LICENSE = "GPL-2.0-only"

PV = "26.4.22"

RPM_NAME = "galera-4-wsrep-provider-26.4.22-2.9.aarch64.rpm"
RPM_HASH = "bb856a6a662b1ac8f66b181ad3eb4dc4566570b407de00f1dabd82a07f33446c26d138594a808a62860f2eff2e6ec2945ee625feda4d4ce3360d844264a246a2"

RPROVIDES:${PN} += "config-galera-4-wsrep-provider \
galera-4-wsrep-provider \
libgalera-smm.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libstdc++.so.6 \
mariadb-galera"

inherit rpm
