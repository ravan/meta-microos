SUMMARY = "Apache Resource Bundles"
DESCRIPTION = "An archive which contains templates for generating the necessary license files \
and notices for all Apache releases."
LICENSE = "Apache-2.0"

PV = "1.8"

RPM_NAME = "apache-resource-bundles-1.8-1.2.noarch.rpm"
RPM_HASH = "669b0e7329cc2da0672b4bf33916bb1a4370c1c87dd6c3895091bd86535ed5844165d257b2f7e75844b0799ad7616a4ee6b4b833984dccd309b8e8ffc3c737cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-resource-bundles \
mvn-org.apache-apache-incubator-disclaimer-resource-bundle \
mvn-org.apache-apache-incubator-disclaimer-resource-bundle-pom- \
mvn-org.apache-apache-jar-resource-bundle \
mvn-org.apache-apache-jar-resource-bundle-pom- \
mvn-org.apache-apache-jar-txt-resource-bundle \
mvn-org.apache-apache-jar-txt-resource-bundle-pom- \
mvn-org.apache-apache-license-header-resource-bundle \
mvn-org.apache-apache-license-header-resource-bundle-pom- \
mvn-org.apache-apache-resource-bundles-pom- \
mvn-org.apache-apache-source-release-assembly-descriptor \
mvn-org.apache-apache-source-release-assembly-descriptor-pom- \
mvn-org.apache.apache.resources-apache-incubator-disclaimer-resource-bundle \
mvn-org.apache.apache.resources-apache-incubator-disclaimer-resource-bundle-pom- \
mvn-org.apache.apache.resources-apache-jar-resource-bundle \
mvn-org.apache.apache.resources-apache-jar-resource-bundle-pom- \
mvn-org.apache.apache.resources-apache-jar-txt-resource-bundle \
mvn-org.apache.apache.resources-apache-jar-txt-resource-bundle-pom- \
mvn-org.apache.apache.resources-apache-license-header-resource-bundle \
mvn-org.apache.apache.resources-apache-license-header-resource-bundle-pom- \
mvn-org.apache.apache.resources-apache-resource-bundles-pom- \
mvn-org.apache.apache.resources-apache-source-release-assembly-descriptor \
mvn-org.apache.apache.resources-apache-source-release-assembly-descriptor-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
