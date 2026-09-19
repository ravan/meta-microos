SUMMARY = "Private headers for rime"
DESCRIPTION = "This package provides private headers of Rime to build plugins."
LICENSE = "BSD-3-Clause"

PV = "1.17.0"

RPM_NAME = "librime-private-devel-1.17.0-1.1.aarch64.rpm"
RPM_HASH = "d3a9e8ee89d791fd4ad74504885ff0fb9e1db2a35b3d5da566301eafc6af4bbd079271efecef211212c88ed6a3d5be807cc33afdf6de37bfa96924443815032c"

RPROVIDES:${PN} += "librime-private-devel"

RDEPENDS:${PN} += "librime-devel"

inherit rpm
