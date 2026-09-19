SUMMARY = "RelaxNG Datatype"
DESCRIPTION = "This package contains RelaxNG Datatype."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-relaxng-datatype-2.3.1-12.4.noarch.rpm"
RPM_HASH = "c129dcb7db4982a94236393013bb74f5070c36d83fdfd3c04d10fc86470e57e7f08e467aa396b974dd92674db2e03ad97efad886a9f811b6a400a47c1e095ffd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-relaxng-datatype \
mvn-com.sun.xml.bind.external-relaxng-datatype \
mvn-com.sun.xml.bind.external-relaxng-datatype-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
