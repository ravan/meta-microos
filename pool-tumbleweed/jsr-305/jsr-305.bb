SUMMARY = "Correctness annotations for Java code"
DESCRIPTION = "This package contains reference implementations, test cases, and other \
documents for Java Specification Request 305: Annotations for Software Defect \
Detection."
LICENSE = "BSD-3-Clause"

PV = "3.0.2"

RPM_NAME = "jsr-305-3.0.2-3.8.noarch.rpm"
RPM_HASH = "56ae9aacb795964980ad02bf59711d7ebd5dfcc45f6907155981721ab66d80dc3a7dedaa836be2ee068678eca53f9cd4366fb2716be53a609120b3ea4b2f7edb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsr-305 \
mvn-com.google.code.findbugs-jsr305 \
mvn-com.google.code.findbugs-jsr305-pom- \
osgi-org.jsr-305"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
