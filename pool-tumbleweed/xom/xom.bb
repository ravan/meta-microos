SUMMARY = "XML Object Model"
DESCRIPTION = "XOM is a new XML object model. It is an open source (LGPL), \
tree-based API for processing XML with Java that strives \
for correctness, simplicity, and performance, in that order. \
XOM is designed to be easy to learn and easy to use. It \
works very straight-forwardly, and has a very shallow \
learning curve. Assuming you're already familiar with XML, \
you should be able to get up and running with XOM very quickly."
LICENSE = "LGPL-2.0-only"

PV = "1.3.9"

RPM_NAME = "xom-1.3.9-3.7.noarch.rpm"
RPM_HASH = "0e1a838d296670d4037396c63687f1e2215364218cc0d713a21d296581861c2dad3992962fdaf5108093528a36bb6b2f5d59df283eaf77b02b2c09aac7a0cc4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.io7m.xom-xom \
mvn-com.io7m.xom-xom-pom- \
mvn-xom-xom \
mvn-xom-xom-pom- \
osgi-nu.xom \
xom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-jaxen-jaxen \
mvn-xerces-xercesImpl"

inherit rpm
