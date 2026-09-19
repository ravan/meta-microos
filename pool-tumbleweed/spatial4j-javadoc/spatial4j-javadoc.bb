SUMMARY = "API documentation for spatial4j"
DESCRIPTION = "API documentation for spatial4j."
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "spatial4j-javadoc-0.8-1.5.noarch.rpm"
RPM_HASH = "4661117b2f9e911e2ab7687e1b14b0a125763b4679699ec01bca29b5c4874e272f2aed530f1eddbb13c8a579f4bdc88604aa2805784f132bf3010cf2d3a9f550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spatial4j-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
