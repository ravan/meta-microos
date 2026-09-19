SUMMARY = "@BugPattern annotation"
DESCRIPTION = "@BugPattern annotation for Google Error Prone"
LICENSE = "Apache-2.0"

PV = "2.26.1"

RPM_NAME = "google-errorprone-annotation-2.26.1-2.7.noarch.rpm"
RPM_HASH = "04d1f01438610ee7c66f79f51d19a6a616481030fe2794f76ef108e55ed713cf5ff5133bcc340cc24545fe5aea45738bbc19a42fd733bc213e035e1adbe4baa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-errorprone-annotation \
mvn-com.google.errorprone-error-prone-annotation \
mvn-com.google.errorprone-error-prone-annotation-pom- \
osgi-com.google.errorprone.annotation"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.guava-guava"

inherit rpm
