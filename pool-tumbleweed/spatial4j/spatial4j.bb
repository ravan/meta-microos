SUMMARY = "A Geospatial Library for Java"
DESCRIPTION = "Spatial4j is a general purpose spatial / geospatial ASL licensed open-source \
Java library. It’s core capabilities are 3-fold: to provide common shapes that \
can work in Euclidean and geodesic (surface of sphere) world models, to provide \
distance calculations and other math, and to read & write shapes from formats \
like WKT and GeoJSON. Spatial4j is a project of the LocationTech Industry \
Working Group of the Eclipse Foundation."
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "spatial4j-0.8-1.5.noarch.rpm"
RPM_HASH = "af66ca4db95458a631cca911880f6d566c3a4d59594967d08ceb46a12e0aa1f21aeb42bab3f4a664fd69e8e892a6aff8d04058bae29530225ded90086d9a4f1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.locationtech.spatial4j-spatial4j \
mvn-org.locationtech.spatial4j-spatial4j-pom- \
osgi-org.locationtech.spatial4j \
spatial4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
