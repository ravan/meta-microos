SUMMARY = "Cache module for httpcomponents-client"
DESCRIPTION = "This package provides client side caching for httpcomponents-client."
LICENSE = "Apache-2.0"

PV = "4.5.14"

RPM_NAME = "httpcomponents-client-cache-4.5.14-2.1.noarch.rpm"
RPM_HASH = "a09ee31adcb58bf11933b1f6f440b84132ebe28b92d9dd28da787e677e4b9fd2a43d0cc2ff86973480b4c701654488930b985f29569198c9b82e3148badca481"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-client-cache \
mvn-org.apache.httpcomponents-httpclient-cache \
mvn-org.apache.httpcomponents-httpclient-cache-pom- \
osgi-org.apache.httpcomponents.httpclient-cache"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging \
mvn-org.apache.httpcomponents-httpclient"

inherit rpm
