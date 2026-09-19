SUMMARY = "error-prone annotations"
DESCRIPTION = "Google Error Prone is a static analysis tool for Java that catches \
common programming mistakes at compile-time. \
 \
This package contains Google Error Prone annotations"
LICENSE = "Apache-2.0"

PV = "2.26.1"

RPM_NAME = "google-errorprone-annotations-2.26.1-2.9.noarch.rpm"
RPM_HASH = "817d8683ee337ba8f975107bf8db4658f7b9609e5935dac07e47720ed0904c8f15f5a7c8787e574f7215012dcb3a778fffdd64bd40efab8cd5868267b7ac6605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-errorprone-annotations \
mvn-com.google.errorprone-error-prone-annotations \
mvn-com.google.errorprone-error-prone-annotations-pom- \
osgi-com.google.errorprone.annotations"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
