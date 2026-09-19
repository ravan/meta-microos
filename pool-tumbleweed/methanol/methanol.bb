SUMMARY = "Lightweight HTTP extensions for Java"
DESCRIPTION = "Methanol is a library designed to extend the functionality of Java's \
built-in HTTP client (java.net.http). While it acts as a wrapper \
around the HTTP client, it provides additionalfeatures such as \
multipart uploads, caching, and response decompression."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "methanol-1.9.0-1.4.noarch.rpm"
RPM_HASH = "3e6fdde9c35e4d8fd748dc1afdcf7d3b1bad1f90efe149aebc41a197361d29521c11824842d91396ff673b9882920bdd570e5fbe73fdb323d04fe61767b73eb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "methanol \
mvn-com.github.mizosoft.methanol-methanol \
mvn-com.github.mizosoft.methanol-methanol-pom- \
osgi-methanol"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
