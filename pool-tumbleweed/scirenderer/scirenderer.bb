SUMMARY = "A Java rendering library based on JoGL"
DESCRIPTION = "SciRenderer is a rendering library based on JoGL. This Java API allows \
2-D or 3-D plotting from simple 2-D graph to complex scenes. Independent \
library, SciRender is used within Scilab software but is available \
for other application and developments."
LICENSE = "CECILL-2.0"

PV = "1.1.0"

RPM_NAME = "scirenderer-1.1.0-8.5.noarch.rpm"
RPM_HASH = "11ef853c463aa2af83bb99c24459eb0acd9f09d4a05fb4436f57506c02a1b712e9f903e6993c9b1c3a1f3e991bcbe502c2a3d4f83bb5af2559568ab5f0503b16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scirenderer"

RDEPENDS:${PN} += "java \
jpackage-utils"

inherit rpm
