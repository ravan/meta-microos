SUMMARY = "Non-ABI stable API for the Qt 6 tools libraries"
DESCRIPTION = "This package provides private headers of qt6-tools that do not have any \
ABI or API guarantees."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-tools-private-devel-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "d3257318a0e4fab842aeb2d04e4b7a5cfc6aad57daed78a0b7cfaedfcffd6ed5c8bde44c5cc6a8fe72b0d03d4256d704eb9ff2908b38989770505c19e23b2e65"

RPROVIDES:${PN} += "qt6-tools-private-devel"

RDEPENDS:${PN} += ""

inherit rpm
