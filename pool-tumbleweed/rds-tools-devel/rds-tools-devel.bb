SUMMARY = "Development files for Reliable Datagram Sockets"
DESCRIPTION = "This package provides the header needed to use the RDS socket API."
LICENSE = "BSD-3-Clause | GPL-2.0"

PV = "2.3.11"

RPM_NAME = "rds-tools-devel-2.3.11-1.5.aarch64.rpm"
RPM_HASH = "b80186f49b5a8a4ae1fe99c2d8c84eb209a0ce8f792db88d9d7ceb2a5e9fde9ba37d30fb40ff2eec944a9fb68b3e2ec92d001f8d368585447118492d80e221d4"

RPROVIDES:${PN} += "rds-tools-devel"

RDEPENDS:${PN} += ""

inherit rpm
