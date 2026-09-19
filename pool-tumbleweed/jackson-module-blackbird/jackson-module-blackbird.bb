SUMMARY = "Jackson module that uses LambdaMetafactory based code generation to replace reflection calls."
DESCRIPTION = "The LambdaMetafactory introduces a standard Java API for dynamically instantiating function objects. \
The current OpenJDK implementation generates anonymous classes in a somewhat similar fashion to the \
classic Afterburner. While the metafactory cannot generate comparably specialized implementations, \
we can write needed adapters as simple Java code and use the metafactory to create distinct call \
sites for every needed access path. This should allow each accessor to have a monomorphic call \
profile and easily inline for maximum performance."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-module-blackbird-2.18.9-1.1.noarch.rpm"
RPM_HASH = "c63dfabefb4e7bbbfd0d356501f8f145dad43adb2845ad5e7ddb445d4d9753b468ae7bdb9d3306f2f5cbdda91a519dad3c93058cac2f47f707e3d707ace2b584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-blackbird \
mvn-com.fasterxml.jackson.module-jackson-module-blackbird \
mvn-com.fasterxml.jackson.module-jackson-module-blackbird-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-blackbird"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
