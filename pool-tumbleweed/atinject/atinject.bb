SUMMARY = "Dependency injection specification for Java (JSR-330)"
DESCRIPTION = "This package specifies a means for obtaining objects in such a way as \
to maximize reusability, testability and maintainability compared to \
traditional approaches such as constructors, factories, and service \
locators (e.g., JNDI). This process, known as dependency injection, is \
beneficial to most nontrivial applications."
LICENSE = "Apache-2.0"

PV = "1+20211017gitd06ce18"

RPM_NAME = "atinject-1+20211017gitd06ce18-2.1.noarch.rpm"
RPM_HASH = "6832bc194674d939c953923e28384dee4e5612043aaae9b04e26606173fe487c94583a20da2c34ee7efcc523f5a5c32767788e0efe8918a5bcf4a4a006ad8117"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atinject \
mvn-javax.inject-javax.inject \
mvn-javax.inject-javax.inject-pom- \
osgi-javax.inject"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
