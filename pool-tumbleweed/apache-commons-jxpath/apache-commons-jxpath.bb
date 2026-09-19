SUMMARY = "Simple XPath interpreter"
DESCRIPTION = "Defines a simple interpreter of an expression language called XPath. \
JXPath applies XPath expressions to graphs of objects of all kinds: \
JavaBeans, Maps, Servlet contexts, DOM etc, including mixtures thereof."
LICENSE = "Apache-2.0"

PV = "1.3"

RPM_NAME = "apache-commons-jxpath-1.3-11.8.noarch.rpm"
RPM_HASH = "854aa33b61f720cb276c9987a3af08ade15ae40caf9a05aa5566f7fad18dc6b4612ea74bf3960c1d9a212b3646e25b1b92333f787fb8e6bbc455e1bfe9b3eabf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-jxpath \
commons-jxpath \
jakarta-commons-jxpath \
mvn-commons-jxpath-commons-jxpath \
mvn-commons-jxpath-commons-jxpath-pom- \
mvn-org.apache.commons-commons-jxpath \
mvn-org.apache.commons-commons-jxpath-pom- \
osgi-org.apache.commons.jxpath"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
