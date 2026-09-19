SUMMARY = "Javadoc for jts"
DESCRIPTION = "This package contains API documentation for jts."
LICENSE = "EPL-1.0"

PV = "1.20.0"

RPM_NAME = "jts-javadoc-1.20.0-1.6.noarch.rpm"
RPM_HASH = "c4bcb4feaff7973e79b3d53cf178f2e7c8c2d1e1491bd2697c4c089c33cf528f7845b010dda8579c3aaa8a54a82a5dcaab5aa02cc5a3ed60e449960028ac7a55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jts-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
