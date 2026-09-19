SUMMARY = "Codecs module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'codecs' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-codecs-8.11.4-1.8.noarch.rpm"
RPM_HASH = "dd2eb2a91e711fd3cb846a9601e956fda3881861528065772f7ed2e3583d2d43a59dfdfc8be0fe2ac0fb64df7d6b383e66007dadbb9d8275bfe1ebbddd52dd5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-codecs \
mvn-org.apache.lucene-lucene-codecs \
mvn-org.apache.lucene-lucene-codecs-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
