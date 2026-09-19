SUMMARY = "An XPath engine written in Java"
DESCRIPTION = "Jaxen is an open source XPath library written in Java. It is adaptable \
to many different object models, including DOM, XOM, dom4j, and JDOM. \
Is it also possible to write adapters that treat non-XML trees such as compiled \
Java byte code or Java beans as XML, thus enabling you to query these trees \
with XPath too."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "jaxen-2.0.0-1.11.noarch.rpm"
RPM_HASH = "a7cb8755f25717bc0e0e6cdf6606f4c062e8ff4a9c196afb27fee925a7d3077510bc9a468f53fe9580f069bb376d21569db72e3606ba1edb0bfab90f159691bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxen \
mvn-jaxen-jaxen \
mvn-jaxen-jaxen-pom- \
osgi-jaxen"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
