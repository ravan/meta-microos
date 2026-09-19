SUMMARY = "The configuration files and scripts for galera replication"
DESCRIPTION = "This package contains configuration files and scripts that are \
needed for running MariaDB Galera Cluster."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "12.3.2"

RPM_NAME = "mariadb-galera-12.3.2-1.3.aarch64.rpm"
RPM_HASH = "6c6a314ed9700241dc02a2a0e5a8fe8cf9bf8c2008fc3f362569d3470f5dea7c2ac34af70bdd9b5ef0dda28f53ef26213b09b908fed1c68fd699c934cbaa0c73"

RPROVIDES:${PN} += "config-mariadb-galera \
mariadb-galera"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
galera-4 \
group-mysql \
iproute2 \
lsof \
mariadb \
rsync \
socat \
which"

inherit rpm
