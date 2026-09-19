SUMMARY = "The guava-testlib artifact"
DESCRIPTION = "guava-testlib provides additional functionality for conveninent unit testing"
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "33.4.8"

RPM_NAME = "guava-testlib-33.4.8-1.6.noarch.rpm"
RPM_HASH = "8d06318beda3e2f10b84ee94b3b7aa969ba708d45dee0f4c340247fb6b10cd48cbfbbaf3251288c8fcf47b75ebe89a289c99c36708fc6ce877a7de30db853022"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guava-testlib \
mvn-com.google.guava-guava-testlib \
mvn-com.google.guava-guava-testlib-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.errorprone-error-prone-annotations \
mvn-com.google.guava-guava \
mvn-com.google.j2objc-j2objc-annotations \
mvn-junit-junit \
mvn-org.jspecify-jspecify"

inherit rpm
