SUMMARY = "Javadoc for java-jwt"
DESCRIPTION = "API documentation for the Logback library"
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "java-jwt-javadoc-4.4.0-1.8.noarch.rpm"
RPM_HASH = "4e16447c93700f5b2ac25763cedb840ee51af9d35688de669a261a38e73b2c87c0113eaa7450cca2f74a05007f1ffc6cfd0f16bd5aecf45d62f1ef6cb15abde4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-jwt-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
