SUMMARY = "Embeddable, replicated and fault tolerant SQL engine"
DESCRIPTION = "cowsql is a C library that implements an embeddable and replicated SQL database \
engine with high availability and automatic failover. \
 \
cowsql extends SQLite with a network protocol that can connect together various \
instances of your application and have them act as a highly-available cluster, \
with no dependency on external databases. \
 \
This package contains the files necessary for developing and building \
applications using the library."
LICENSE = "LGPL-3.0-only-with-LGPL-3.0-linking-exception"

PV = "1.15.9"

RPM_NAME = "cowsql-devel-1.15.9-2.3.aarch64.rpm"
RPM_HASH = "1b90e2a1d2e6ac7e4c0dc1d8c759c6fc302eb3e04c01ccdb4aa666d6b270490ce1c6b2333cdae7ba5cdd2636c8b9d98aa39344430836f965bfd3f14f25bb4614"

RPROVIDES:${PN} += "cowsql-devel \
pkgconfig-cowsql"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcowsql0"

inherit rpm
