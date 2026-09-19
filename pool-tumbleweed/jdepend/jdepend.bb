SUMMARY = "Java Design Quality Metrics"
DESCRIPTION = "JDepend traverses a set of Java class and source file directories and \
generates design quality metrics for each Java package. JDepend allows \
you to automatically measure the quality of a design in terms of its \
extensibility, reusability, and maintainability to effectively manage \
and control package dependencies."
LICENSE = "MIT"

PV = "2.10"

RPM_NAME = "jdepend-2.10-4.9.noarch.rpm"
RPM_HASH = "e9bc33f5f701d2bd135d7346a2025008fbac886d5af4f4d9fbf289e939c8f61bdead2bf1eedec708a4ff92382c8fd95b32c2d4d60eab4a3f6afdcf829fdb93d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdepend \
mvn-jdepend-jdepend \
mvn-jdepend-jdepend-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
