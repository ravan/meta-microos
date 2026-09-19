SUMMARY = "A library to read and write files in variations of the Comma Separated Value (CSV) format"
DESCRIPTION = "Commons CSV reads and writes files in variations of the Comma Separated Value (CSV) format."
LICENSE = "Apache-2.0"

PV = "1.14.1"

RPM_NAME = "apache-commons-csv-1.14.1-2.2.noarch.rpm"
RPM_HASH = "1fdfe2d3e280bf27d078ea67c9d6f84df2ec64b300dc60c98cbbb75befd856d80a73fa2a341705b277a92f9a2022bf590f265c73dc4e7af566e9e557fab86935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-csv \
mvn-org.apache.commons-commons-csv \
mvn-org.apache.commons-commons-csv-pom- \
osgi-org.apache.commons.commons-csv"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-codec-commons-codec \
mvn-commons-io-commons-io"

inherit rpm
