SUMMARY = "@BugPattern annotation processor"
DESCRIPTION = "JSR-269 annotation processor for @BugPattern annotation"
LICENSE = "Apache-2.0"

PV = "2.26.1"

RPM_NAME = "google-errorprone-docgen_processor-2.26.1-2.7.noarch.rpm"
RPM_HASH = "338ef67cf90b8e8795470fd1fa0e8f9a4ee2e7a2732fea112329b05e35e5f91725829e5d21abeb4746500fe8b0e7b960cf9acb259a4131cd944ddc837552705f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-errorprone-docgen-processor \
mvn-com.google.errorprone-error-prone-docgen-processor \
mvn-com.google.errorprone-error-prone-docgen-processor-pom- \
osgi-com.google.errorprone.docgen.processor"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.auto.service-auto-service-annotations \
mvn-com.google.code.gson-gson \
mvn-com.google.errorprone-error-prone-annotation \
mvn-com.google.guava-guava"

inherit rpm
