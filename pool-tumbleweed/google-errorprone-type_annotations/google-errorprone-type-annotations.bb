SUMMARY = "error-prone type annotations"
DESCRIPTION = "Google Error Prone type annotations"
LICENSE = "Apache-2.0"

PV = "2.26.1"

RPM_NAME = "google-errorprone-type_annotations-2.26.1-2.7.noarch.rpm"
RPM_HASH = "dd4b571c3b9be8a83581b1487c5aafa803af9e90596b6846f5f796f7c981272e2d9153ca14e6be5064390e725ea1ea43204d75ed7037b441afc495acfe4d1bee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-errorprone-type-annotations \
mvn-com.google.errorprone-error-prone-type-annotations \
mvn-com.google.errorprone-error-prone-type-annotations-pom- \
osgi-com.google.errorprone.type.annotations"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
