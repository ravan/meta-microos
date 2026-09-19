SUMMARY = "Container Library and tools for working with container registries"
DESCRIPTION = "This is a golang library for working with container registries."
LICENSE = "Apache-2.0"

PV = "0.22.1"

RPM_NAME = "go-containerregistry-0.22.1-1.1.aarch64.rpm"
RPM_HASH = "6c03753ab70a9517327f6200af045f5387348a64b5fb3931ef7c460d3cab86f3816dd5a4c8df384268649626ed11ec960b7fa2484f9a0e1b4ab33e875afa491c"

RPROVIDES:${PN} += "go-containerregistry"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
