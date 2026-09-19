SUMMARY = "JAXB XJC"
DESCRIPTION = "JAXB Binding Compiler. Contains source code needed for binding \
customization files into java sources. In other words: the tool to \
generate java classes for the given xml representation."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-xjc-2.3.1-12.4.noarch.rpm"
RPM_HASH = "553c2913fcb2875aa724bf22f1545984c8a2143744e472622025c157a525d3fd9dcb7f9ed7d246d5e88204f64f1906f8dd43692962ec0649f5bf703ceae68f1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-xjc \
mvn-com.sun.xml.bind-jaxb-xjc \
mvn-com.sun.xml.bind-jaxb-xjc-pom- \
mvn-org.glassfish.jaxb-jaxb-xjc \
mvn-org.glassfish.jaxb-jaxb-xjc-jdk9 \
mvn-org.glassfish.jaxb-jaxb-xjc-jdk9-pom- \
mvn-org.glassfish.jaxb-jaxb-xjc-pom-"

RDEPENDS:${PN} += "glassfish-dtd-parser \
istack-commons-tools \
java-headless \
javapackages-filesystem \
mvn-com.sun.istack-istack-commons-runtime \
mvn-com.sun.istack-istack-commons-tools \
mvn-com.sun.xml.bind.external-relaxng-datatype \
mvn-com.sun.xml.bind.external-rngom \
mvn-com.sun.xml.dtd-parser-dtd-parser \
mvn-org.glassfish.jaxb-codemodel \
mvn-org.glassfish.jaxb-jaxb-runtime \
mvn-org.glassfish.jaxb-xsom"

inherit rpm
