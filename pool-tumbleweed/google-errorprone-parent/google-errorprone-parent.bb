SUMMARY = "Error Prone parent POM"
DESCRIPTION = "Error Prone is a static analysis tool for Java that catches \
common programming mistakes at compile-time."
LICENSE = "Apache-2.0"

PV = "2.26.1"

RPM_NAME = "google-errorprone-parent-2.26.1-2.7.noarch.rpm"
RPM_HASH = "7ad47d0dbcdcb8a809c3197d15120b5c3a5c63b92fcc1c64c1e03c7ed3f2ddc8ab4d506edbce9806cac31623999dd977c02baf818a7ce68edd25a4d143e9d2e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-errorprone-parent \
mvn-com.google.errorprone-error-prone-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-biz.aQute.bnd-bnd-maven-plugin \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-jar-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin"

inherit rpm
