SUMMARY = "Caffeine Guava extension"
DESCRIPTION = "An adapter to expose a Caffeine cache through the Guava interfaces."
LICENSE = "Apache-2.0"

PV = "2.9.3"

RPM_NAME = "caffeine-guava-2.9.3-2.5.noarch.rpm"
RPM_HASH = "a502e04a839778ca0e0295451757e7363685692c9a86f564e2708bd8de49b1e26d2a99c3ff85772139718e30278fd9bb6131001488b728a2910df712e628c095"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caffeine-guava \
mvn-com.github.ben-manes.caffeine-guava \
mvn-com.github.ben-manes.caffeine-guava-pom- \
osgi-com.github.ben-manes.caffeine.guava"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.ben-manes.caffeine-caffeine \
mvn-com.google.guava-guava"

inherit rpm
