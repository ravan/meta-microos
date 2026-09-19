SUMMARY = "Support for reading and writing CSV-encoded data via Jackson abstractions"
DESCRIPTION = "Jackson data format module for reading and writing CSV encoded data, either \
as 'raw' data (sequence of String arrays), or via data binding to/from Java \
Objects (POJOs)."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-dataformat-csv-2.18.9-1.1.noarch.rpm"
RPM_HASH = "bf0d912a3fc4afdce4130cf502d123bb5602bffa20f1785fce41a41cfc3739d771f9aa72ee6c1478fa9600a12e6b34a6d0a14c222625892c415bfbcd2a68a9a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-csv \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-csv \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-csv-pom- \
osgi-com.fasterxml.jackson.dataformat.jackson-dataformat-csv"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
