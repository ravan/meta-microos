SUMMARY = "Checker Qual"
DESCRIPTION = "Checker Qual contains annotations (type qualifiers) that a programmer \
writes to specify Java code for type-checking by the Checker Framework."
LICENSE = "MIT"

PV = "3.22.0"

RPM_NAME = "checker-qual-3.22.0-2.8.noarch.rpm"
RPM_HASH = "a29587bc3357c8df2f94e047281dfc25dcf544edbc371189c59e7e5f335f7a5064ac8c738e0f8babe85ec9e99da1f33e80eadfb82ff7896e685f9c169e7f9db6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "checker-qual \
mvn-org.checkerframework-checker-qual \
mvn-org.checkerframework-checker-qual-pom- \
osgi-checker-qual"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
