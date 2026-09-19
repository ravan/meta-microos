SUMMARY = "Development Part of Curses Development Kit"
DESCRIPTION = "This package includes the development headers and static libraries for \
CDK, the Curses Development Kit."
LICENSE = "BSD-3-Clause"

PV = "5.0.20230201"

RPM_NAME = "cdk-devel-5.0.20230201-1.11.aarch64.rpm"
RPM_HASH = "e11639555e24fe4451b12d37ba1c9947caeb87b713eb5aa6f49f5cb549f0415b2483694e309527e1941b620349e3f734bf74250d6c105d48dd47b46c93ad1442"

RPROVIDES:${PN} += "cdk-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
libcdk6-3-4 \
ncurses-devel"

inherit rpm
