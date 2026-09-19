SUMMARY = "Spatial Strategies for Apache Lucene"
DESCRIPTION = "Spatial Strategies for Apache Lucene."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-spatial-extras-8.11.4-1.8.noarch.rpm"
RPM_HASH = "7b540dc9d8a5402b279baf9c018fa913ab2bd8294afe7c5644d8c24a31adba5d999794b56341e75032572ba8d0f93e332b1f1fa97af721141d84bd28aa57fe43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-spatial-extras \
mvn-org.apache.lucene-lucene-spatial-extras \
mvn-org.apache.lucene-lucene-spatial-extras-pom- \
osgi-org.apache.lucene.spatial-extras"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.geometry-s2-geometry \
mvn-org.apache.lucene-lucene-core \
mvn-org.apache.lucene-lucene-spatial3d \
mvn-org.locationtech.spatial4j-spatial4j"

inherit rpm
