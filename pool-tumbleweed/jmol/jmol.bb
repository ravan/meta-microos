SUMMARY = "3D Viewer for chemical structures"
DESCRIPTION = "Jmol is a Java-based viewer for chemical structures in 3D with \
features for chemicals, crystals, materials and biomolecules."
LICENSE = "LGPL-2.1-only"

PV = "16.3.45"

RPM_NAME = "jmol-16.3.45-1.4.noarch.rpm"
RPM_HASH = "52290330caad6c1beffd9b0ea8ffa92675150c133f901c43680b299073955ee98ce0e2441ecee08fbaf29374bb4899b3f73e08673897dcf09cb0040bc61b4ded"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmol"

RDEPENDS:${PN} += "/usr/bin/sh \
java"

inherit rpm
