SUMMARY = "Apache Log4j NoSql"
DESCRIPTION = "Use NoSQL databases such as MongoDB and CouchDB to append log messages."
LICENSE = "Apache-2.0"

PV = "2.26.1"

RPM_NAME = "log4j-nosql-2.26.1-2.1.noarch.rpm"
RPM_HASH = "6e3b0919336439676191e4b1b97260d8429e266a58f42fe903dec9766d4019af45677599182bac9659463226e74484d3322385dcd6f65cfe0befeafcf3ba81ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-nosql \
mvn-org.apache.logging.log4j-log4j-couchdb \
mvn-org.apache.logging.log4j-log4j-couchdb-pom- \
osgi-org.apache.logging.log4j.couchdb"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.logging.log4j-log4j-core \
mvn-org.lightcouch-lightcouch"

inherit rpm
