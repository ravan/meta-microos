SUMMARY = "Support deserialization of POJO classes without default constructor"
DESCRIPTION = "Module that allows instantiation of Java POJOs that do not have 'default constructor' \
(constructor that takes no arguments) but should be deserialized from JSON Object \
as POJOs. In such cases, module tries to use sun.reflect.ReflectionFactory \
to force instantiation that by-passes all constructors (it is the mechanism used by \
JDK serialization system)."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-module-no-ctor-deser-2.18.9-1.1.noarch.rpm"
RPM_HASH = "460eba6f8f6b329057becb6d102919f1482eaf5461a86d965cbfceb5048dd9a756bc295e69d3a0c60760528d7c9f7bd134c60c3fa556d871d7cfa276172f6556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-no-ctor-deser \
mvn-com.fasterxml.jackson.module-jackson-module-no-ctor-deser \
mvn-com.fasterxml.jackson.module-jackson-module-no-ctor-deser-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-no-ctor-deser"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
