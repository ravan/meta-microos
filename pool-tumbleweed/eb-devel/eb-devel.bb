SUMMARY = "EB Header Files and Libraries"
DESCRIPTION = "EB header files and libraries."
LICENSE = "GPL-2.0-or-later"

PV = "4.4.3"

RPM_NAME = "eb-devel-4.4.3-7.5.aarch64.rpm"
RPM_HASH = "c25f2bdccd557e6e2d9544ee16a81e5097aaf1c344c0f519319e41a652e73fcd0484a5a545ff56034b3a1565c58e7eb4823984017e207a084717597ff519b37a"

RPROVIDES:${PN} += "eb-devel \
ebdev"

RDEPENDS:${PN} += "eb"

inherit rpm
