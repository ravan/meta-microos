SUMMARY = "Data files for libenchant"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries. \
 \
This package provides data/configuration files for libenchant."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "enchant-1-data-1.6.1-8.10.aarch64.rpm"
RPM_HASH = "727e77d86cccee7b4a34c6e54a8b2d1370915b0f72e1f1029940d5f69d22c24540a5edd3e35451d534c21030e7b2cb55e329399588870112f7d559dbf377c43b"

RPROVIDES:${PN} += "enchant-1-data \
enchant-data \
libenchant1-/usr/share/enchant/enchant.ordering"

RDEPENDS:${PN} += ""

inherit rpm
