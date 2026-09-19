SUMMARY = "Jackson module to inject OSGI services in deserialized beans"
DESCRIPTION = "This module provides a way to inject OSGI services into deserialized objects. \
Thanks to the JacksonInject annotations, the OsgiJacksonModule will search for \
the required service in the OSGI service registry and injects it in the object \
while deserializing."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-module-osgi-2.18.9-1.1.noarch.rpm"
RPM_HASH = "e852b664e9cd196716c00217882d07d1a18962521423cd7487c9b47f4a4d742fdc7e0fede9675a983e078dc9192d37f9d3d9761e034d32861c56454050b73629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-osgi \
mvn-com.fasterxml.jackson.module-jackson-module-osgi \
mvn-com.fasterxml.jackson.module-jackson-module-osgi-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-osgi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-org.osgi-osgi.core"

inherit rpm
