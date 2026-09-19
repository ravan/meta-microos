SUMMARY = "S2 Geometry Library"
DESCRIPTION = "This is a package for manipulating geometric shapes. Unlike many geometry \
libraries, S2 is primarily designed to work with spherical geometry, i.e., \
shapes drawn on a sphere rather than on a planar 2D map. This makes it \
especially suitable for working with geographic data."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "s2-geometry-library-java-2.0.0-3.4.noarch.rpm"
RPM_HASH = "353e2ea2a7f0934315ff117e81ece8cf5b5b195a35c4e90e0c0f0850011a066f44bbbc7cd9aafd13afa641858126cc40dbab05de05806170851fcb1bd52f640f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.google.geometry-s2-geometry \
mvn-com.google.geometry-s2-geometry-pom- \
s2-geometry-library-java"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.errorprone-error-prone-annotations \
mvn-com.google.guava-guava"

inherit rpm
