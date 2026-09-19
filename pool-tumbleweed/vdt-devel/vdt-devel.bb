SUMMARY = "Headers and sources for building against vdt"
DESCRIPTION = "This package provides the headers and sources for developing applications \
against vdt."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.4"

RPM_NAME = "vdt-devel-0.4.4-3.6.aarch64.rpm"
RPM_HASH = "4e663b4f2371061042ac80360902dabb7370228952f0a7f65e76ceb4bebe022c4fa1e4f89f35996f88102c4253251e35d4af14632450ac2d9675ea231133425a"

RPROVIDES:${PN} += "vdt-devel"

RDEPENDS:${PN} += "libvdt0"

inherit rpm
