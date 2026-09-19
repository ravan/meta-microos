SUMMARY = "Headers and sources for developing with igwn_ligolw"
DESCRIPTION = "This module provides a python LIGO Light-Weight XML I/O Library \
 \
This package provides the headers and sources for developing with igwn_ligolw."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "python314-igwn-ligolw-devel-2.1.0-1.5.aarch64.rpm"
RPM_HASH = "ffe5ca54d228491bf831b89501299eb0939bacb64c9f97bd7b4343df8f5ba9500397d2df90b28e1cec60ace6aee3db7ecb216b233e2a5f2f2fffcb9a1a0885c8"

RPROVIDES:${PN} += "python314-igwn-ligolw-devel"

RDEPENDS:${PN} += "python314-igwn-ligolw"

inherit rpm
