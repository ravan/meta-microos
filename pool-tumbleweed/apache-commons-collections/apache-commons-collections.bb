SUMMARY = "Commons Collections Package"
DESCRIPTION = "The introduction of the Collections API by Sun in JDK 1.2 \
has been a boon to quick and effective Java programming. \
Ready access to powerful data structures has accelerated \
development by reducing the need for custom container \
classes around each core object.  Most Java2 APIs are \
significantly easier to use because of the Collections API. \
However, there are certain holes left unfilled by Sun's \
implementations, and the Jakarta-Commons Collections \
Component strives to fulfill them. Among the features of \
this package are: - special-purpose implementations of \
Lists and Maps for fast access \
 \
- adapter classes from Java1-style containers (arrays, \
  enumerations) to Java2-style collections \
 \
- methods to test or create typical set theory properties \
  of collections such as union, intersection, and closure"
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "apache-commons-collections-3.2.2-9.10.noarch.rpm"
RPM_HASH = "e79c8dd33d9eb9dcaaf3c1497fd9d212fb7fc5d3ac498c8cc23646d8aa1a6b6f7a05602d7ce671e5cc1e9a30bbe0bf73c1ad70c22bf73d02ac17ac6e0099fb8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-collections \
commons-collections \
jakarta-commons-collections \
mvn-commons-collections-commons-collections \
mvn-commons-collections-commons-collections-pom- \
mvn-org.apache.commons-commons-collections \
mvn-org.apache.commons-commons-collections-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
