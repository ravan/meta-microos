SUMMARY = "Jackson module that uses Paranamer to introspect names of constructor params"
DESCRIPTION = "Module that uses Paranamer library to auto-detect names of Creator \
(constructor, static factory method, annotated with @JsonCreator) methods."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-module-paranamer-2.18.9-1.1.noarch.rpm"
RPM_HASH = "955446450e92d82a7e3028a99dffe0026a12038f688058f9183fc22d12b5bc879690a299a4081169ea5bc36ccc92d3fd719231c7b7698edf0196c1b621df6d7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-paranamer \
mvn-com.fasterxml.jackson.module-jackson-module-paranamer \
mvn-com.fasterxml.jackson.module-jackson-module-paranamer-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-paranamer"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.thoughtworks.paranamer-paranamer"

inherit rpm
