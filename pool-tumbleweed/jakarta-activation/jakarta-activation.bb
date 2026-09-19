SUMMARY = "Jakarta Activation Specification and Implementation"
DESCRIPTION = "Jakarta Activation lets you take advantage of standard services to: \
determine the type of an arbitrary piece of data; encapsulate access to \
it; discover the operations available on it; and instantiate the \
appropriate bean to perform the operation(s)."
LICENSE = "BSD-3-Clause"

PV = "2.1.3"

RPM_NAME = "jakarta-activation-2.1.3-1.9.noarch.rpm"
RPM_HASH = "a59610b2ccdbbb7152b2dcf752d9356cef0e1d6888a924fc4fa582770bfd19105f94762848da9b599964e7bc448f905d5d540fa6af49d1c47e03adf7f2c188a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-activation \
mvn-jakarta.activation-jakarta.activation-api \
mvn-jakarta.activation-jakarta.activation-api-pom- \
osgi-jakarta.activation-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
