SUMMARY = "Data files for libenchant"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries. \
 \
This package provides data/configuration files for libenchant."
LICENSE = "LGPL-2.1-or-later"

PV = "2.8.19"

RPM_NAME = "enchant-data-2.8.19-1.1.aarch64.rpm"
RPM_HASH = "62d9cc3bf6c7f7730cff4c172bbf2026e5287bf671d277e0943c81aa62d8f21f5ecba91b0f3103981fd9180960424a5a9048a580a2907b0dc4dbdb061d6064fc"

RPROVIDES:${PN} += "enchant-data"

RDEPENDS:${PN} += ""

inherit rpm
