SUMMARY = "Aeon"
DESCRIPTION = "Aeon bundles the benefits of a rolling OS and a read-only root filesystem in a polished Desktop platform. It is a modern Linux Operating System, designed for minimal maintenance and tinkering. \
        It inherits the benefits of Tumbleweed while redefining the operating system into a small, efficient and opinionated desktop."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "Aeon-release-appliance-20260915-3446.1.aarch64.rpm"
RPM_HASH = "a66a64079af2a33185b931cbae151dd5c9f8ed676e2767a19c4e15099f5ed4396e7c2649e5d49a2285c402e907632df11dcc544bc7042bddbca0137ad1f71260"

RPROVIDES:${PN} += "Aeon-release-appliance \
flavor-appliance \
product-flavor- \
product-flavor-Aeon"

RDEPENDS:${PN} += ""

inherit rpm
