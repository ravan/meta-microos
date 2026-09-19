SUMMARY = "Kalpa Desktop"
DESCRIPTION = "Kalpa desktop bundles the benefits of a rolling OS and a read-only root filesystem in a polished Desktop platform. It is a modern Linux Operating System, designed for minimal maintenance and tinkering. \
        It inherits the benefits of openSUSE Tumbleweed and MicroOS while redefining the operating system into a small, efficient and opinionated desktop."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "Kalpa-release-appliance-20260915-3446.1.aarch64.rpm"
RPM_HASH = "7fea2b4cadb300d81971d818a4fc0f6f7c0f9cdfed856b0e4611bb4dba6c2799ba54f70e9e089e9e9d218fe90d5748a0aa20964823477142ce9a8fae6c1c5205"

RPROVIDES:${PN} += "Kalpa-release-appliance \
flavor-appliance \
product-flavor- \
product-flavor-Kalpa"

RDEPENDS:${PN} += ""

inherit rpm
