SUMMARY = "Geronimo Servlet 2.5 Specification"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-servlet-2_5-api-1.2-41.6.noarch.rpm"
RPM_HASH = "c9b69ec6b86d74912d0ddb79ed17fe4fe148bb1d937f6f1af0f0a706c285930791f2483c857edae82cc775980958b09f95d6f8855aecf33d372d112c9c6d785c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-servlet-2-5-api \
mvn-org.apache.geronimo.specs-geronimo-servlet-2.5-spec \
mvn-org.apache.geronimo.specs-geronimo-servlet-2.5-spec-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
