SUMMARY = "Apache HttpAsyncClient Cache"
DESCRIPTION = "This package provides client side caching for httpcomponents-asyncclient."
LICENSE = "Apache-2.0"

PV = "4.1.4"

RPM_NAME = "httpcomponents-asyncclient-cache-4.1.4-5.4.noarch.rpm"
RPM_HASH = "c55cf9ac927253503a27a45013f0dffea471523fd9faa8bd4cd8e7b96a876ced8e337167d1083d9b6a2bbda237b772edadf05762dfa6a18c984f9bed237f66c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-asyncclient-cache \
mvn-org.apache.httpcomponents-httpasyncclient-cache \
mvn-org.apache.httpcomponents-httpasyncclient-cache-pom- \
osgi-org.apache.httpcomponents.httpasyncclient-cache"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.httpcomponents-httpasyncclient \
mvn-org.apache.httpcomponents-httpclient-cache"

inherit rpm
