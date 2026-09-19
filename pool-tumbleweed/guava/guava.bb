SUMMARY = "Google Core Libraries for Java"
DESCRIPTION = "Guava is a suite of core and expanded libraries that include \
utility classes, Google's collections, io classes, and much \
much more. \
This project is a complete packaging of all the Guava libraries \
into a single jar.  Individual portions of Guava can be used \
by downloading the appropriate module and its dependencies."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "33.4.8"

RPM_NAME = "guava-33.4.8-1.6.noarch.rpm"
RPM_HASH = "2a487428b2038c0526292dde0521492bebbcf1d0ebb0d8a927cfff32bd349fc0e2f7502c41627de43c20cb79b65df81f767e4240207c810372375711cd0141c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guava \
mvn-com.google.guava-failureaccess \
mvn-com.google.guava-failureaccess-pom- \
mvn-com.google.guava-guava \
mvn-com.google.guava-guava-pom- \
mvn-com.google.guava-listenablefuture \
mvn-com.google.guava-listenablefuture-pom- \
osgi-com.google.guava"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.errorprone-error-prone-annotations \
mvn-com.google.j2objc-j2objc-annotations \
mvn-org.jspecify-jspecify"

inherit rpm
