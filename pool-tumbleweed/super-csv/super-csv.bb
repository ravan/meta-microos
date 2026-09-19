SUMMARY = "A CSV library for Java"
DESCRIPTION = "A library for reading and writing CSV files with Java. \
 \
It supports reading and writing with POJOs, Maps and Lists. It also \
has support for deep-mapping and index-based mapping with POJOs."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "super-csv-2.4.0-7.10.noarch.rpm"
RPM_HASH = "033e042d8720d2e8866ecae48be88a7a0a7b409a001d3491bb0e6bd51cf2d0b1851e846895b67c22578b9740d6a53c07bd514b8f99738bcdbe61b237e801c38b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-net.sf.supercsv-super-csv \
mvn-net.sf.supercsv-super-csv-java8 \
mvn-net.sf.supercsv-super-csv-java8-pom- \
mvn-net.sf.supercsv-super-csv-parent-pom- \
mvn-net.sf.supercsv-super-csv-pom- \
osgi-net.sf.supercsv.super-csv \
osgi-net.sf.supercsv.super-csv-java8 \
super-csv"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
