SUMMARY = "AutoService Annotations"
DESCRIPTION = "Provider-configuration files for ServiceLoader."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-service-annotations-1.6.1-3.4.noarch.rpm"
RPM_HASH = "d271b3dcef8cc4f8362d832cffa2bcda633b81e6a98343404f7ef4569e1cf8f40ad21239692810cfd77855715fcf98de551a0541b1ecdaf8c9fc1ca0a11395e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-service-annotations \
mvn-com.google.auto.service-auto-service-annotations \
mvn-com.google.auto.service-auto-service-annotations-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
