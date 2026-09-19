SUMMARY = "Dependency injection specification for Java (JSR-330)"
DESCRIPTION = "This package specifies a means for obtaining objects in such a way as \
to maximize reusability, testability and maintainability compared to \
traditional approaches such as constructors, factories, and service \
locators (e.g., JNDI). This process, known as dependency injection, is \
beneficial to most nontrivial applications."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "jakarta-inject-2.0.1-2.9.noarch.rpm"
RPM_HASH = "27075f7ac885521a8e582e4696e4b27df7122f31c42157b3b49f10ed8d1fbe1b42f4d7a041277769c623de6a1b61faa859f9a06ab9a966e9747807cc1bcbdfbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-inject \
mvn-jakarta.inject-jakarta.inject-api \
mvn-jakarta.inject-jakarta.inject-api-pom- \
osgi-jakarta.inject.jakarta.inject-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
