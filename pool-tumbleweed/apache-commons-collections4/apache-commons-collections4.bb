SUMMARY = "Extension of the Java Collections Framework"
DESCRIPTION = "Commons-Collections seek to build upon the JDK classes by providing \
new interfaces, implementations and utilities."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "apache-commons-collections4-4.5.0-1.3.noarch.rpm"
RPM_HASH = "9aed61670af773ad78f4ef352a3da260c0af1816bea8a74bf78884de9d3025b13e1a948b97f911ae2b097501b4c52332744749d46345aebf44f332b3ca791701"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-collections4 \
mvn-org.apache.commons-commons-collections4 \
mvn-org.apache.commons-commons-collections4-pom- \
osgi-org.apache.commons.commons-collections4"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
